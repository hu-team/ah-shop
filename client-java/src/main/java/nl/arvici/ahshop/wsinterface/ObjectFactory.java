
package nl.arvici.ahshop.wsinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.server.CreateUserData;
import org.datacontract.schemas._2004._07.server.HistoryListData;
import org.datacontract.schemas._2004._07.server.LoginUserData;
import org.datacontract.schemas._2004._07.server.PurchaseProductData;
import org.datacontract.schemas._2004._07.server.ServiceResponseOfArrayOfProductUEsMBek5;
import org.datacontract.schemas._2004._07.server.ServiceResponseOfArrayOfPurchaseUEsMBek5;
import org.datacontract.schemas._2004._07.server.ServiceResponseOfPurchaseUEsMBek5;
import org.datacontract.schemas._2004._07.server.ServiceResponseOfUserUEsMBek5;
import org.datacontract.schemas._2004._07.server.UserDetailsData;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.arvici.ahshop.wsinterface package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateUserResponseCreateUserResult_QNAME = new QName("http://arvici.nl/ahshop/wsinterface", "CreateUserResult");
    private final static QName _ProductListResponseProductListResult_QNAME = new QName("http://arvici.nl/ahshop/wsinterface", "ProductListResult");
    private final static QName _LoginUserResponseLoginUserResult_QNAME = new QName("http://arvici.nl/ahshop/wsinterface", "LoginUserResult");
    private final static QName _HistoryListResponseHistoryListResult_QNAME = new QName("http://arvici.nl/ahshop/wsinterface", "HistoryListResult");
    private final static QName _CreateUserData_QNAME = new QName("http://arvici.nl/ahshop/wsinterface", "data");
    private final static QName _PurchaseProductResponsePurchaseProductResult_QNAME = new QName("http://arvici.nl/ahshop/wsinterface", "PurchaseProductResult");
    private final static QName _UserDetailsResponseUserDetailsResult_QNAME = new QName("http://arvici.nl/ahshop/wsinterface", "UserDetailsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.arvici.ahshop.wsinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductList }
     * 
     */
    public ProductList createProductList() {
        return new ProductList();
    }

    /**
     * Create an instance of {@link ProductListResponse }
     * 
     */
    public ProductListResponse createProductListResponse() {
        return new ProductListResponse();
    }

    /**
     * Create an instance of {@link LoginUserResponse }
     * 
     */
    public LoginUserResponse createLoginUserResponse() {
        return new LoginUserResponse();
    }

    /**
     * Create an instance of {@link UserDetails }
     * 
     */
    public UserDetails createUserDetails() {
        return new UserDetails();
    }

    /**
     * Create an instance of {@link HistoryList }
     * 
     */
    public HistoryList createHistoryList() {
        return new HistoryList();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link HistoryListResponse }
     * 
     */
    public HistoryListResponse createHistoryListResponse() {
        return new HistoryListResponse();
    }

    /**
     * Create an instance of {@link PurchaseProductResponse }
     * 
     */
    public PurchaseProductResponse createPurchaseProductResponse() {
        return new PurchaseProductResponse();
    }

    /**
     * Create an instance of {@link LoginUser }
     * 
     */
    public LoginUser createLoginUser() {
        return new LoginUser();
    }

    /**
     * Create an instance of {@link UserDetailsResponse }
     * 
     */
    public UserDetailsResponse createUserDetailsResponse() {
        return new UserDetailsResponse();
    }

    /**
     * Create an instance of {@link PurchaseProduct }
     * 
     */
    public PurchaseProduct createPurchaseProduct() {
        return new PurchaseProduct();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponseOfUserUEsMBek5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://arvici.nl/ahshop/wsinterface", name = "CreateUserResult", scope = CreateUserResponse.class)
    public JAXBElement<ServiceResponseOfUserUEsMBek5> createCreateUserResponseCreateUserResult(ServiceResponseOfUserUEsMBek5 value) {
        return new JAXBElement<ServiceResponseOfUserUEsMBek5>(_CreateUserResponseCreateUserResult_QNAME, ServiceResponseOfUserUEsMBek5 .class, CreateUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponseOfArrayOfProductUEsMBek5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://arvici.nl/ahshop/wsinterface", name = "ProductListResult", scope = ProductListResponse.class)
    public JAXBElement<ServiceResponseOfArrayOfProductUEsMBek5> createProductListResponseProductListResult(ServiceResponseOfArrayOfProductUEsMBek5 value) {
        return new JAXBElement<ServiceResponseOfArrayOfProductUEsMBek5>(_ProductListResponseProductListResult_QNAME, ServiceResponseOfArrayOfProductUEsMBek5 .class, ProductListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponseOfUserUEsMBek5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://arvici.nl/ahshop/wsinterface", name = "LoginUserResult", scope = LoginUserResponse.class)
    public JAXBElement<ServiceResponseOfUserUEsMBek5> createLoginUserResponseLoginUserResult(ServiceResponseOfUserUEsMBek5 value) {
        return new JAXBElement<ServiceResponseOfUserUEsMBek5>(_LoginUserResponseLoginUserResult_QNAME, ServiceResponseOfUserUEsMBek5 .class, LoginUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponseOfArrayOfPurchaseUEsMBek5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://arvici.nl/ahshop/wsinterface", name = "HistoryListResult", scope = HistoryListResponse.class)
    public JAXBElement<ServiceResponseOfArrayOfPurchaseUEsMBek5> createHistoryListResponseHistoryListResult(ServiceResponseOfArrayOfPurchaseUEsMBek5 value) {
        return new JAXBElement<ServiceResponseOfArrayOfPurchaseUEsMBek5>(_HistoryListResponseHistoryListResult_QNAME, ServiceResponseOfArrayOfPurchaseUEsMBek5 .class, HistoryListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://arvici.nl/ahshop/wsinterface", name = "data", scope = CreateUser.class)
    public JAXBElement<CreateUserData> createCreateUserData(CreateUserData value) {
        return new JAXBElement<CreateUserData>(_CreateUserData_QNAME, CreateUserData.class, CreateUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponseOfPurchaseUEsMBek5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://arvici.nl/ahshop/wsinterface", name = "PurchaseProductResult", scope = PurchaseProductResponse.class)
    public JAXBElement<ServiceResponseOfPurchaseUEsMBek5> createPurchaseProductResponsePurchaseProductResult(ServiceResponseOfPurchaseUEsMBek5 value) {
        return new JAXBElement<ServiceResponseOfPurchaseUEsMBek5>(_PurchaseProductResponsePurchaseProductResult_QNAME, ServiceResponseOfPurchaseUEsMBek5 .class, PurchaseProductResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseProductData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://arvici.nl/ahshop/wsinterface", name = "data", scope = PurchaseProduct.class)
    public JAXBElement<PurchaseProductData> createPurchaseProductData(PurchaseProductData value) {
        return new JAXBElement<PurchaseProductData>(_CreateUserData_QNAME, PurchaseProductData.class, PurchaseProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://arvici.nl/ahshop/wsinterface", name = "data", scope = LoginUser.class)
    public JAXBElement<LoginUserData> createLoginUserData(LoginUserData value) {
        return new JAXBElement<LoginUserData>(_CreateUserData_QNAME, LoginUserData.class, LoginUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponseOfUserUEsMBek5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://arvici.nl/ahshop/wsinterface", name = "UserDetailsResult", scope = UserDetailsResponse.class)
    public JAXBElement<ServiceResponseOfUserUEsMBek5> createUserDetailsResponseUserDetailsResult(ServiceResponseOfUserUEsMBek5 value) {
        return new JAXBElement<ServiceResponseOfUserUEsMBek5>(_UserDetailsResponseUserDetailsResult_QNAME, ServiceResponseOfUserUEsMBek5 .class, UserDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDetailsData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://arvici.nl/ahshop/wsinterface", name = "data", scope = UserDetails.class)
    public JAXBElement<UserDetailsData> createUserDetailsData(UserDetailsData value) {
        return new JAXBElement<UserDetailsData>(_CreateUserData_QNAME, UserDetailsData.class, UserDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryListData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://arvici.nl/ahshop/wsinterface", name = "data", scope = HistoryList.class)
    public JAXBElement<HistoryListData> createHistoryListData(HistoryListData value) {
        return new JAXBElement<HistoryListData>(_CreateUserData_QNAME, HistoryListData.class, HistoryList.class, value);
    }

}
