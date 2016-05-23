﻿using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;

namespace server
{
    [ServiceContract]
    [System.Web.Services.WebServiceBindingAttribute(Name = "WS-Binding", Namespace = "http://schemas.arvici.nl/messages/message")]
    public interface IShopService
    {
        [OperationContract]
        [WebInvoke(
            BodyStyle = WebMessageBodyStyle.WrappedRequest,
            RequestFormat = WebMessageFormat.Xml
            )]
        ServiceResponse<User> CreateUser(CreateUserData data);



        [OperationContract]
        [WebInvoke(
            BodyStyle = WebMessageBodyStyle.WrappedRequest,
            RequestFormat = WebMessageFormat.Xml
            )]
        ServiceResponse<User> LoginUser(LoginUserData data);



        [OperationContract]
        [WebInvoke(
            BodyStyle = WebMessageBodyStyle.WrappedRequest,
            RequestFormat = WebMessageFormat.Xml
            )]
        ServiceResponse<User> UserDetails(UserDetailsData data);



        [OperationContract]
        [WebInvoke(
            BodyStyle = WebMessageBodyStyle.WrappedRequest,
            RequestFormat = WebMessageFormat.Xml
            )]
        ServiceResponse<Purchase> PurchaseProduct(PurchaseProductData data);



        [OperationContract]
        [WebInvoke(
            BodyStyle = WebMessageBodyStyle.WrappedRequest,
            RequestFormat = WebMessageFormat.Xml
            )]
        ServiceResponse<Product[]> ProductList();



        [OperationContract]
        [WebInvoke(
            BodyStyle = WebMessageBodyStyle.WrappedRequest,
            RequestFormat = WebMessageFormat.Xml
            )]
        ServiceResponse<Purchase[]> HistoryList(HistoryListData data);
    }

    


    // Use a data contract as illustrated in the sample below to add composite types to service operations.
    [DataContract]
    public class CompositeType
    {
        bool boolValue = true;
        string stringValue = "Hello ";

        [DataMember]
        public bool BoolValue
        {
            get { return boolValue; }
            set { boolValue = value; }
        }

        [DataMember]
        public string StringValue
        {
            get { return stringValue; }
            set { stringValue = value; }
        }
    }
}
