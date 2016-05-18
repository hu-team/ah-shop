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
            createUserResponse Response = new createUserResponse();
            Response.userid = "1";
            Response.username = data.username;
            Response.password = data.name;

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
