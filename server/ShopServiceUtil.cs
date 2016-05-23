using System.Runtime.Serialization;

namespace server
{
    [DataContract]
    public class ServiceResponse<T>
    {
        [DataMember]
        public T Data;
        [DataMember]
        public MetaData Meta;

        public ServiceResponse (T data, MetaData meta)
        {
            Data = data;
            Meta = meta;
        }

        public ServiceResponse(MetaData meta)
        {
            Meta = meta;
        }

        public static ServiceResponse<T> Success(T data) => new ServiceResponse<T>(data, new MetaData(true));

        public static ServiceResponse<T> Success(T data, string message) => new ServiceResponse<T>(data, new MetaData(true, message));

        public static ServiceResponse<T> Error(T data, string message) => new ServiceResponse<T>(data, new MetaData(false, message));
    }


    [DataContract]
    public class MetaData
    {
        [DataMember]
        public bool Success;
        [DataMember]
        public string Message;

        public MetaData(bool success, string message)
        {
            Success = success;
            Message = message;
        }

        public MetaData(bool success)
        {
            Success = success;
            Message = "";
        }
    }


    /**
     * Clone Hax
     */

    public static class Copy
    {
        public static User CloneUser(User user) => new User()
        {
            userid = user.userid,
            balance = user.balance,
            username = user.username,
            password = user.password,
            name = user.name
        };

        public static Purchase ClonePurchase(Purchase purchase) => new Purchase()
        {
            userid = purchase.userid,
            productid = purchase.productid,
            price = purchase.price
        };

        public static Product CloneProduct(Product product) => new Product()
        {
            price = product.price,
            productid = product.productid,
            name = product.name,
            quantity = product.quantity
        };
    }


    /**
     * Request Data Models
     */
    public partial class CreateUserData
    {
        public string Username { get; set; }
        public string Name { get; set; }
    }

    public partial class LoginUserData
    {
        public string Username { get; set; }
        public string Password { get; set; }
    }

    public partial class UserDetailsData
    {
        public int UserID { get; set; }
    }

    public partial class PurchaseProductData
    {
        public int UserID { get; set; }
        public int ProductID { get; set; }
    }

    public partial class HistoryListData
    {
        public int UserID { get; set; }
    }
}