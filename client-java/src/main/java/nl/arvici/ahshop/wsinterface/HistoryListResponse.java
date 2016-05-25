
package nl.arvici.ahshop.wsinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.server.ServiceResponseOfArrayOfPurchaseUEsMBek5;


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
 *         &lt;element name="HistoryListResult" type="{http://schemas.datacontract.org/2004/07/server}ServiceResponseOfArrayOfPurchaseUEsMBek5" minOccurs="0"/>
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
    "historyListResult"
})
@XmlRootElement(name = "HistoryListResponse")
public class HistoryListResponse {

    @XmlElementRef(name = "HistoryListResult", namespace = "http://arvici.nl/ahshop/wsinterface", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceResponseOfArrayOfPurchaseUEsMBek5> historyListResult;

    /**
     * Gets the value of the historyListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponseOfArrayOfPurchaseUEsMBek5 }{@code >}
     *     
     */
    public JAXBElement<ServiceResponseOfArrayOfPurchaseUEsMBek5> getHistoryListResult() {
        return historyListResult;
    }

    /**
     * Sets the value of the historyListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponseOfArrayOfPurchaseUEsMBek5 }{@code >}
     *     
     */
    public void setHistoryListResult(JAXBElement<ServiceResponseOfArrayOfPurchaseUEsMBek5> value) {
        this.historyListResult = value;
    }

}
