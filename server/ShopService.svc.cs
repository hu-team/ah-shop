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
        public string GetData(int value)
        {
            return string.Format("You entered: {0}", value);
        }

        public CompositeType GetDataUsingDataContract(CompositeType composite)
        {
            if (composite == null)
            {
                throw new ArgumentNullException("composite");
            }
            if (composite.BoolValue)
            {
                composite.StringValue += "Suffix";
            }
            return composite;
        }

        public createUserResponse CreateUser(createUser data)
        {
            User user = new User();
            user.name = data.name;
            user.username = data.username;
            user.password = "JAAJ";

            using (var context = new databaseEntities())
            {
                context.User.Add(user);
                context.SaveChanges();
            }

            createUserResponse Response = new createUserResponse();
            Response.userid = user.userid + "";
            Response.name = user.name;
            Response.username = user.username;
            Response.password = user.password;

            return Response;
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
