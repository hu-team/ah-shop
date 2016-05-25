
package nl.arvici.ahshop.wsinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.server.ServiceResponseOfPurchaseUEsMBek5;


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
 *         &lt;element name="PurchaseProductResult" type="{http://schemas.datacontract.org/2004/07/server}ServiceResponseOfPurchaseUEsMBek5" minOccurs="0"/>
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
    "purchaseProductResult"
})
@XmlRootElement(name = "PurchaseProductResponse")
public class PurchaseProductResponse {

    @XmlElementRef(name = "PurchaseProductResult", namespace = "http://arvici.nl/ahshop/wsinterface", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceResponseOfPurchaseUEsMBek5> purchaseProductResult;

    /**
     * Gets the value of the purchaseProductResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponseOfPurchaseUEsMBek5 }{@code >}
     *     
     */
    public JAXBElement<ServiceResponseOfPurchaseUEsMBek5> getPurchaseProductResult() {
        return purchaseProductResult;
    }

    /**
     * Sets the value of the purchaseProductResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponseOfPurchaseUEsMBek5 }{@code >}
     *     
     */
    public void setPurchaseProductResult(JAXBElement<ServiceResponseOfPurchaseUEsMBek5> value) {
        this.purchaseProductResult = value;
    }

}
