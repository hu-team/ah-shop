using System;
using System.Runtime.Serialization;
using System.ServiceModel;

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
}