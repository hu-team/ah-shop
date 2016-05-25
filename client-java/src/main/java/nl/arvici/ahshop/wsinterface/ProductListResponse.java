
package nl.arvici.ahshop.wsinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.server.ServiceResponseOfArrayOfProductUEsMBek5;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductListResult" type="{http://schemas.datacontract.org/2004/07/server}ServiceResponseOfArrayOfProductUEsMBek5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "productListResult"
})
@XmlRootElement(name = "ProductListResponse")
public class ProductListResponse {

    @XmlElementRef(name = "ProductListResult", namespace = "http://arvici.nl/ahshop/wsinterface", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceResponseOfArrayOfProductUEsMBek5> productListResult;

    /**
     * Gets the value of the productListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponseOfArrayOfProductUEsMBek5 }{@code >}
     *     
     */
    public JAXBElement<ServiceResponseOfArrayOfProductUEsMBek5> getProductListResult() {
        return productListResult;
    }

    /**
     * Sets the value of the productListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponseOfArrayOfProductUEsMBek5 }{@code >}
     *     
     */
    public void setProductListResult(JAXBElement<ServiceResponseOfArrayOfProductUEsMBek5> value) {
        this.productListResult = value;
    }

}
