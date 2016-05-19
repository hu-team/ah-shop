using System;
using System.Collections.Generic;
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
            throw new NotImplementedException();
        }

        public userDetailsResponse UserDetails(userDetails data)
        {
            throw new NotImplementedException();
        }

        public purchaseProductResponse PurchaseProduct(purchaseProduct data)
        {
            throw new NotImplementedException();
        }

        public Product[] ProductList(productList data)
        {
            throw new NotImplementedException();
        }

        public Product[] HistoryList(historyList data)
        {
            throw new NotImplementedException();
        }
        
    }
}
