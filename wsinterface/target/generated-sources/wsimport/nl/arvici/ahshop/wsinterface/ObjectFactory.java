
package nl.arvici.ahshop.wsinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


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

    private final static QName _UserDetails_QNAME = new QName("http://schemas.arvici.nl/messages/request", "userDetails");
    private final static QName _Product_QNAME = new QName("http://schemas.arvici.nl/model", "Product");
    private final static QName _HistoryList_QNAME = new QName("http://schemas.arvici.nl/messages/request", "historyList");
    private final static QName _HistoryListResponse_QNAME = new QName("http://schemas.arvici.nl/messages/response", "historyListResponse");
    private final static QName _UserDetailsResponse_QNAME = new QName("http://schemas.arvici.nl/messages/response", "userDetailsResponse");
    private final static QName _PurchaseProductResponse_QNAME = new QName("http://schemas.arvici.nl/messages/response", "purchaseProductResponse");
    private final static QName _ProductList_QNAME = new QName("http://schemas.arvici.nl/messages/request", "productList");
    private final static QName _PurchaseItem_QNAME = new QName("http://schemas.arvici.nl/messages/request", "purchaseItem");
    private final static QName _CreateUser_QNAME = new QName("http://schemas.arvici.nl/messages/request", "createUser");
    private final static QName _CreateUserResponse_QNAME = new QName("http://schemas.arvici.nl/messages/response", "createUserResponse");
    private final static QName _LoginUserResponse_QNAME = new QName("http://schemas.arvici.nl/messages/response", "loginUserResponse");
    private final static QName _ProductListResponse_QNAME = new QName("http://schemas.arvici.nl/messages/response", "productListResponse");
    private final static QName _LoginUser_QNAME = new QName("http://schemas.arvici.nl/messages/request", "loginUser");
    private final static QName _ApplicationError_QNAME = new QName("http://schemas.arvici.nl/messages/error", "ApplicationError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.arvici.ahshop.wsinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link LoginUser }
     * 
     */
    public LoginUser createLoginUser() {
        return new LoginUser();
    }

    /**
     * Create an instance of {@link HistoryList }
     * 
     */
    public HistoryList createHistoryList() {
        return new HistoryList();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link PurchaseProduct }
     * 
     */
    public PurchaseProduct createPurchaseProduct() {
        return new PurchaseProduct();
    }

    /**
     * Create an instance of {@link UserDetails }
     * 
     */
    public UserDetails createUserDetails() {
        return new UserDetails();
    }

    /**
     * Create an instance of {@link ProductList }
     * 
     */
    public ProductList createProductList() {
        return new ProductList();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link LoginUserResponse }
     * 
     */
    public LoginUserResponse createLoginUserResponse() {
        return new LoginUserResponse();
    }

    /**
     * Create an instance of {@link ProductListResponse }
     * 
     */
    public ProductListResponse createProductListResponse() {
        return new ProductListResponse();
    }

    /**
     * Create an instance of {@link HistoryListResponse }
     * 
     */
    public HistoryListResponse createHistoryListResponse() {
        return new HistoryListResponse();
    }

    /**
     * Create an instance of {@link UserDetailsResponse }
     * 
     */
    public UserDetailsResponse createUserDetailsResponse() {
        return new UserDetailsResponse();
    }

    /**
     * Create an instance of {@link PurchaseProductResponse }
     * 
     */
    public PurchaseProductResponse createPurchaseProductResponse() {
        return new PurchaseProductResponse();
    }

    /**
     * Create an instance of {@link ApplicationError }
     * 
     */
    public ApplicationError createApplicationError() {
        return new ApplicationError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.arvici.nl/messages/request", name = "userDetails")
    public JAXBElement<UserDetails> createUserDetails(UserDetails value) {
        return new JAXBElement<UserDetails>(_UserDetails_QNAME, UserDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.arvici.nl/model", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.arvici.nl/messages/request", name = "historyList")
    public JAXBElement<HistoryList> createHistoryList(HistoryList value) {
        return new JAXBElement<HistoryList>(_HistoryList_QNAME, HistoryList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.arvici.nl/messages/response", name = "historyListResponse")
    public JAXBElement<HistoryListResponse> createHistoryListResponse(HistoryListResponse value) {
        return new JAXBElement<HistoryListResponse>(_HistoryListResponse_QNAME, HistoryListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.arvici.nl/messages/response", name = "userDetailsResponse")
    public JAXBElement<UserDetailsResponse> createUserDetailsResponse(UserDetailsResponse value) {
        return new JAXBElement<UserDetailsResponse>(_UserDetailsResponse_QNAME, UserDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.arvici.nl/messages/response", name = "purchaseProductResponse")
    public JAXBElement<PurchaseProductResponse> createPurchaseProductResponse(PurchaseProductResponse value) {
        return new JAXBElement<PurchaseProductResponse>(_PurchaseProductResponse_QNAME, PurchaseProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.arvici.nl/messages/request", name = "productList")
    public JAXBElement<ProductList> createProductList(ProductList value) {
        return new JAXBElement<ProductList>(_ProductList_QNAME, ProductList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.arvici.nl/messages/request", name = "purchaseItem")
    public JAXBElement<PurchaseProduct> createPurchaseItem(PurchaseProduct value) {
        return new JAXBElement<PurchaseProduct>(_PurchaseItem_QNAME, PurchaseProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.arvici.nl/messages/request", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.arvici.nl/messages/response", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.arvici.nl/messages/response", name = "loginUserResponse")
    public JAXBElement<LoginUserResponse> createLoginUserResponse(LoginUserResponse value) {
        return new JAXBElement<LoginUserResponse>(_LoginUserResponse_QNAME, LoginUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.arvici.nl/messages/response", name = "productListResponse")
    public JAXBElement<ProductListResponse> createProductListResponse(ProductListResponse value) {
        return new JAXBElement<ProductListResponse>(_ProductListResponse_QNAME, ProductListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.arvici.nl/messages/request", name = "loginUser")
    public JAXBElement<LoginUser> createLoginUser(LoginUser value) {
        return new JAXBElement<LoginUser>(_LoginUser_QNAME, LoginUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.arvici.nl/messages/error", name = "ApplicationError")
    public JAXBElement<ApplicationError> createApplicationError(ApplicationError value) {
        return new JAXBElement<ApplicationError>(_ApplicationError_QNAME, ApplicationError.class, null, value);
    }

}
