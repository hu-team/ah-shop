using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace server
{
    public class ShopService : IShopService
    {

        public createUserResponse CreateUser(createUser data)
        {
            // Save the model to the datastore if it doesn't exists
            User user = new User();
            user.name = data.name;
            user.username = data.username;
            user.balance = 10;

            char[] nameReverse = data.name.ToArray();
            Array.Reverse(nameReverse);
            user.password = new string(nameReverse);

            using (var context = new ahshopEntities())
            {
                User userExists = context.User.FirstOrDefault(b => b.username == data.username);
                if (userExists != null) return null;

                context.User.Add(user);
                context.SaveChanges();
            }

            return new createUserResponse()
            {
                username = user.username,
                name = user.name,
                userid = user.userid + "",
                password = user.password
            };
        }

        public loginUserResponse LoginUser(loginUser data)
        {
            User user = null;
            using (var context = new ahshopEntities())
            {
                user = context.User
                                .Where(b => b.username == data.username)
                                .FirstOrDefault(b => b.password == data.password);
            }

            loginUserResponse response = new loginUserResponse();
            response.success = user != null;
            if (user == null) return response;

            response.balance = (float) user.balance;
            response.userid = user.userid + "";
            return response;
        }

        public userDetailsResponse UserDetails(userDetails data)
        {
            User user = null;
            int userid = int.Parse(data.user);
            using (var context = new ahshopEntities())
                user = context.User.FirstOrDefault(b => b.userid == userid);

            if (user == null) return null;

            return new userDetailsResponse()
            {
                balance = (float) user.balance,
                name = user.name,
                userid = user.userid + "",
                username = user.username
            };
        }

        public purchaseProductResponse PurchaseProduct(purchaseProduct data)
        {
            var userid = int.Parse(data.user);
            var productid = int.Parse(data.product);

            User user = null;
            Product product = null;
            using (var context = new ahshopEntities())
            {
                user = context.User.FirstOrDefault(b => b.userid == userid);
                product = context.Product.FirstOrDefault(b => b.productid == productid);
                if (user == null || product == null) return new purchaseProductResponse() { success = false };

                if (user.balance - product.price < 0) return new purchaseProductResponse() {success = false};
                user.balance -= product.price;
                user.Purchase.Add(new Purchase()
                {
                    price = product.price,
                    productid = product.productid,
                    Product = product,
                    userid = user.userid,
                    User = user
                });
                context.SaveChanges();
            }

            return new purchaseProductResponse()
            {
                success = true,
                balance = (float)user.balance
            };
        }

        public Product[] ProductList(productList data)
        {
            var result = new List<Product>();
            using (var context = new ahshopEntities())
            {
                foreach (var prd in context.Product)
                {
                    result.Add(new Product()
                    {
                        productid = prd.productid,
                        name = prd.name,
                        price = prd.price,
                        quantity = prd.quantity
                    });
                }
            }

            return result.ToArray();
        }

        public Product[] HistoryList(historyList data)
        {
            var userid = int.Parse(data.user);
            var result = new List<Product>();
            using (var context = new ahshopEntities())
            {
                var user = context.User.FirstOrDefault(b => b.userid == userid);
                if (user == null) return null;

                foreach (var prd in user.Purchase)
                {
                    result.Add(new Product()
                    {
                        name = prd.Product.name,
                        productid = prd.productid,
                        price = prd.price,
                        quantity = 1
                    });
                }
            }
            return result.ToArray();
        }
        
    }
}
