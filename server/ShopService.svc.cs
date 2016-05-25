using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.ServiceModel;

namespace server
{
    [ServiceBehavior(Namespace = "http://arvici.nl/ahshop/wsinterface")]
    public class ShopService : IShopService
    {

        public ServiceResponse<User> CreateUser(CreateUserData data)
        {
            // Save the model to the datastore if it doesn't exists
            User user = new User();
            user.name = data.Name;
            user.username = data.Username;
            user.balance = 10;

            char[] nameReverse = data.Name.ToArray();
            Array.Reverse(nameReverse);
            user.password = new string(nameReverse);

            using (var context = new ahshopEntities())
            {
                User userExists = context.User.FirstOrDefault(b => b.username == data.Username);
                if (userExists != null) return ServiceResponse<User>.Error(null, "Username already exists!");

                context.User.Add(user);
                context.SaveChanges();
            }
            return ServiceResponse<User>.Success(user, "User successfully created!");
        }
        


        public ServiceResponse<User> LoginUser(LoginUserData data)
        {
            User user = null;
            using (var context = new ahshopEntities())
            {
                user = context.User
                                .FirstOrDefault(b => b.password == data.Password && b.password == data.Password);
            }

            if (user != null)
            {
                // bug: Some kind of bug causes to empty the response.
                // Prevent by hack
                return ServiceResponse<User>.Success(Copy.CloneUser(user), "Welcome back!");
            }
            else
            {
                return ServiceResponse<User>.Error(null, "Invalid credentials");
            }
        }



        public ServiceResponse<User> UserDetails(UserDetailsData data)
        {
            User user = null;
            using (var context = new ahshopEntities())
                user = context.User.FirstOrDefault(b => b.userid == data.UserID);
            return user == null ? ServiceResponse<User>.Error(null, "Not Found!") : ServiceResponse<User>.Success(Copy.CloneUser(user));
        }


        public ServiceResponse<Purchase> PurchaseProduct(PurchaseProductData data)
        {
            User user = null;
            Product product = null;
            Purchase purchase = new Purchase();

            using (var context = new ahshopEntities())
            {
                user = context.User.FirstOrDefault(b => b.userid == data.UserID);
                product = context.Product.FirstOrDefault(b => b.productid == data.ProductID);
                if (user == null) return ServiceResponse<Purchase>.Error(null, "User not found!");
                if (product == null) return ServiceResponse<Purchase>.Error(null, "Product not found!");
                if (user.balance - product.price < 0) return ServiceResponse<Purchase>.Error(null, "Not enough money!");
                if (product.quantity - 1 < 0) return ServiceResponse<Purchase>.Error(null, "Not enough items in shop!");

                purchase.price = product.price;
                purchase.productid = product.productid;
                purchase.Product = product;
                purchase.userid = user.userid;
                purchase.User = user;

                product.quantity -= 1;

                user.balance -= product.price;
                user.Purchase.Add(purchase);
                context.SaveChanges();
            }

            return ServiceResponse<Purchase>.Success(Copy.ClonePurchase(purchase));
        }



        public ServiceResponse<Product[]> ProductList()
        {
            var result = new List<Product>();
            using (var context = new ahshopEntities())
                foreach (var product in context.Product)
                    result.Add(Copy.CloneProduct(product));
            return ServiceResponse<Product[]>.Success(result.ToArray());
        }



        public ServiceResponse<Purchase[]> HistoryList(HistoryListData data)
        {
            var result = new List<Purchase>();
            using (var context = new ahshopEntities())
            {
                var user = context.User.FirstOrDefault(b => b.userid == data.UserID);
                if (user == null) return ServiceResponse<Purchase[]>.Error(null, "User not found!");

                foreach (var pur in user.Purchase)
                {
                    var purchase = Copy.ClonePurchase(pur);
                    purchase.Product = Copy.CloneProduct(pur.Product);
                    result.Add(purchase);
                }
            }
            return ServiceResponse<Purchase[]>.Success(result.ToArray());
        }
        
    }
}
