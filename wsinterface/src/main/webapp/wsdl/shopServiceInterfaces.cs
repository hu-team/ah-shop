﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Deze code is gegenereerd met een hulpprogramma.
//     Runtime-versie:4.0.30319.42000
//
//     Als u wijzigingen aanbrengt in dit bestand, kan dit onjuist gedrag veroorzaken wanneer
//     de code wordt gegenereerd.
// </auto-generated>
//------------------------------------------------------------------------------

using System;
using System.ComponentModel;
using System.Diagnostics;
using System.Web.Services;
using System.Web.Services.Protocols;
using System.Xml.Serialization;

// 
// This source code was auto-generated by wsdl, Version=4.6.1055.0.
// 


/// <remarks/>
// CODEGEN: Het optionele WSDL-extensie-element address van de naamruimte http://schemas.xmlsoap.org/wsdl/soap/ is niet afgehandeld.
[System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.6.1055.0")]
[System.Web.Services.WebServiceBindingAttribute(Name="WS-Binding", Namespace="http://schemas.arvici.nl/messages/message")]
public interface IWSBinding {
    
    /// <remarks/>
    [System.Web.Services.WebMethodAttribute()]
    [System.Web.Services.Protocols.SoapDocumentMethodAttribute("", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Bare)]
    [return: System.Xml.Serialization.XmlElementAttribute("createUserResponse", Namespace="http://schemas.arvici.nl/messages/response")]
    createUserResponse createUser([System.Xml.Serialization.XmlElementAttribute("createUser", Namespace="http://schemas.arvici.nl/messages/request")] createUser createUser1);
    
    /// <remarks/>
    [System.Web.Services.WebMethodAttribute()]
    [System.Web.Services.Protocols.SoapDocumentMethodAttribute("", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Bare)]
    [return: System.Xml.Serialization.XmlElementAttribute("loginUserResponse", Namespace="http://schemas.arvici.nl/messages/response")]
    loginUserResponse loginUser([System.Xml.Serialization.XmlElementAttribute("loginUser", Namespace="http://schemas.arvici.nl/messages/request")] loginUser loginUser1);
    
    /// <remarks/>
    [System.Web.Services.WebMethodAttribute()]
    [System.Web.Services.Protocols.SoapDocumentMethodAttribute("", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Bare)]
    [return: System.Xml.Serialization.XmlElementAttribute("userDetailsResponse", Namespace="http://schemas.arvici.nl/messages/response")]
    userDetailsResponse userDetails([System.Xml.Serialization.XmlElementAttribute("userDetails", Namespace="http://schemas.arvici.nl/messages/request")] userDetails userDetails1);
    
    /// <remarks/>
    [System.Web.Services.WebMethodAttribute()]
    [System.Web.Services.Protocols.SoapDocumentMethodAttribute("", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Bare)]
    [return: System.Xml.Serialization.XmlElementAttribute("purchaseProductResponse", Namespace="http://schemas.arvici.nl/messages/response")]
    purchaseProductResponse purchaseProduct([System.Xml.Serialization.XmlElementAttribute("purchaseProduct", Namespace="http://schemas.arvici.nl/messages/request")] purchaseProduct purchaseProduct1);
    
    /// <remarks/>
    [System.Web.Services.WebMethodAttribute()]
    [System.Web.Services.Protocols.SoapDocumentMethodAttribute("", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Bare)]
    [return: System.Xml.Serialization.XmlArrayAttribute("productListResponse", Namespace="http://schemas.arvici.nl/messages/response")]
    [return: System.Xml.Serialization.XmlArrayItemAttribute("product", IsNullable=false)]
    Product[] productList([System.Xml.Serialization.XmlElementAttribute("productList", Namespace="http://schemas.arvici.nl/messages/request")] productList productList1);
    
    /// <remarks/>
    [System.Web.Services.WebMethodAttribute()]
    [System.Web.Services.Protocols.SoapDocumentMethodAttribute("", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Bare)]
    [return: System.Xml.Serialization.XmlArrayAttribute("historyListResponse", Namespace="http://schemas.arvici.nl/messages/response")]
    [return: System.Xml.Serialization.XmlArrayItemAttribute("product", IsNullable=false)]
    Product[] historyList([System.Xml.Serialization.XmlElementAttribute("historyList", Namespace="http://schemas.arvici.nl/messages/request")] historyList historyList1);
}

/// <opmerkingen/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.6.1055.0")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(Namespace="http://schemas.arvici.nl/messages/request")]
public partial class createUser {
    
    private string usernameField;
    
    private string nameField;
    
    /// <opmerkingen/>
    public string username {
        get {
            return this.usernameField;
        }
        set {
            this.usernameField = value;
        }
    }
    
    /// <opmerkingen/>
    public string name {
        get {
            return this.nameField;
        }
        set {
            this.nameField = value;
        }
    }
}

/// <opmerkingen/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.6.1055.0")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(Namespace="http://schemas.arvici.nl/messages/request")]
public partial class historyList {
    
    private string userField;
    
    /// <opmerkingen/>
    [System.Xml.Serialization.XmlElementAttribute(DataType="positiveInteger")]
    public string user {
        get {
            return this.userField;
        }
        set {
            this.userField = value;
        }
    }
}

/// <opmerkingen/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.6.1055.0")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(Namespace="http://schemas.arvici.nl/model")]
public partial class Product {
    
    private string productidField;
    
    private string nameField;
    
    private string quantityField;
    
    private float priceField;
    
    /// <opmerkingen/>
    [System.Xml.Serialization.XmlElementAttribute(DataType="positiveInteger")]
    public string productid {
        get {
            return this.productidField;
        }
        set {
            this.productidField = value;
        }
    }
    
    /// <opmerkingen/>
    public string name {
        get {
            return this.nameField;
        }
        set {
            this.nameField = value;
        }
    }
    
    /// <opmerkingen/>
    [System.Xml.Serialization.XmlElementAttribute(DataType="integer")]
    public string quantity {
        get {
            return this.quantityField;
        }
        set {
            this.quantityField = value;
        }
    }
    
    /// <opmerkingen/>
    public float price {
        get {
            return this.priceField;
        }
        set {
            this.priceField = value;
        }
    }
}

/// <opmerkingen/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.6.1055.0")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(Namespace="http://schemas.arvici.nl/messages/request")]
public partial class productList {
}

/// <opmerkingen/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.6.1055.0")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(Namespace="http://schemas.arvici.nl/messages/response")]
public partial class purchaseProductResponse {
    
    private bool successField;
    
    private float balanceField;
    
    /// <opmerkingen/>
    public bool success {
        get {
            return this.successField;
        }
        set {
            this.successField = value;
        }
    }
    
    /// <opmerkingen/>
    public float balance {
        get {
            return this.balanceField;
        }
        set {
            this.balanceField = value;
        }
    }
}

/// <opmerkingen/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.6.1055.0")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(Namespace="http://schemas.arvici.nl/messages/request")]
public partial class purchaseProduct {
    
    private string productField;
    
    private string userField;
    
    /// <opmerkingen/>
    [System.Xml.Serialization.XmlElementAttribute(DataType="positiveInteger")]
    public string product {
        get {
            return this.productField;
        }
        set {
            this.productField = value;
        }
    }
    
    /// <opmerkingen/>
    [System.Xml.Serialization.XmlElementAttribute(DataType="positiveInteger")]
    public string user {
        get {
            return this.userField;
        }
        set {
            this.userField = value;
        }
    }
}

/// <opmerkingen/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.6.1055.0")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(Namespace="http://schemas.arvici.nl/messages/response")]
public partial class userDetailsResponse {
    
    private string useridField;
    
    private string nameField;
    
    private string usernameField;
    
    private float balanceField;
    
    /// <opmerkingen/>
    [System.Xml.Serialization.XmlElementAttribute(DataType="positiveInteger")]
    public string userid {
        get {
            return this.useridField;
        }
        set {
            this.useridField = value;
        }
    }
    
    /// <opmerkingen/>
    public string name {
        get {
            return this.nameField;
        }
        set {
            this.nameField = value;
        }
    }
    
    /// <opmerkingen/>
    public string username {
        get {
            return this.usernameField;
        }
        set {
            this.usernameField = value;
        }
    }
    
    /// <opmerkingen/>
    public float balance {
        get {
            return this.balanceField;
        }
        set {
            this.balanceField = value;
        }
    }
}

/// <opmerkingen/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.6.1055.0")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(Namespace="http://schemas.arvici.nl/messages/request")]
public partial class userDetails {
    
    private string userField;
    
    /// <opmerkingen/>
    [System.Xml.Serialization.XmlElementAttribute(DataType="positiveInteger")]
    public string user {
        get {
            return this.userField;
        }
        set {
            this.userField = value;
        }
    }
}

/// <opmerkingen/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.6.1055.0")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(Namespace="http://schemas.arvici.nl/messages/response")]
public partial class loginUserResponse {
    
    private bool successField;
    
    private string useridField;
    
    private float balanceField;
    
    /// <opmerkingen/>
    public bool success {
        get {
            return this.successField;
        }
        set {
            this.successField = value;
        }
    }
    
    /// <opmerkingen/>
    [System.Xml.Serialization.XmlElementAttribute(DataType="positiveInteger")]
    public string userid {
        get {
            return this.useridField;
        }
        set {
            this.useridField = value;
        }
    }
    
    /// <opmerkingen/>
    public float balance {
        get {
            return this.balanceField;
        }
        set {
            this.balanceField = value;
        }
    }
}

/// <opmerkingen/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.6.1055.0")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(Namespace="http://schemas.arvici.nl/messages/request")]
public partial class loginUser {
    
    private string usernameField;
    
    private string passwordField;
    
    /// <opmerkingen/>
    public string username {
        get {
            return this.usernameField;
        }
        set {
            this.usernameField = value;
        }
    }
    
    /// <opmerkingen/>
    public string password {
        get {
            return this.passwordField;
        }
        set {
            this.passwordField = value;
        }
    }
}

/// <opmerkingen/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.6.1055.0")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(Namespace="http://schemas.arvici.nl/messages/response")]
public partial class createUserResponse {
    
    private string useridField;
    
    private string usernameField;
    
    private string passwordField;
    
    private string nameField;
    
    /// <opmerkingen/>
    [System.Xml.Serialization.XmlElementAttribute(DataType="positiveInteger")]
    public string userid {
        get {
            return this.useridField;
        }
        set {
            this.useridField = value;
        }
    }
    
    /// <opmerkingen/>
    public string username {
        get {
            return this.usernameField;
        }
        set {
            this.usernameField = value;
        }
    }
    
    /// <opmerkingen/>
    public string password {
        get {
            return this.passwordField;
        }
        set {
            this.passwordField = value;
        }
    }
    
    /// <opmerkingen/>
    public string name {
        get {
            return this.nameField;
        }
        set {
            this.nameField = value;
        }
    }
}
