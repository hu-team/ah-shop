
package org.datacontract.schemas._2004._07.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceResponseOfPurchaseUEsMBek5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceResponseOfPurchaseUEsMBek5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Data" type="{http://schemas.datacontract.org/2004/07/server}Purchase" minOccurs="0"/>
 *         &lt;element name="Meta" type="{http://schemas.datacontract.org/2004/07/server}MetaData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceResponseOfPurchaseUEsMBek5", propOrder = {
    "data",
    "meta"
})
public class ServiceResponseOfPurchaseUEsMBek5 {

    @XmlElementRef(name = "Data", namespace = "http://schemas.datacontract.org/2004/07/server", type = JAXBElement.class, required = false)
    protected JAXBElement<Purchase> data;
    @XmlElementRef(name = "Meta", namespace = "http://schemas.datacontract.org/2004/07/server", type = JAXBElement.class, required = false)
    protected JAXBElement<MetaData> meta;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Purchase }{@code >}
     *     
     */
    public JAXBElement<Purchase> getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Purchase }{@code >}
     *     
     */
    public void setData(JAXBElement<Purchase> value) {
        this.data = value;
    }

    /**
     * Gets the value of the meta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MetaData }{@code >}
     *     
     */
    public JAXBElement<MetaData> getMeta() {
        return meta;
    }

    /**
     * Sets the value of the meta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MetaData }{@code >}
     *     
     */
    public void setMeta(JAXBElement<MetaData> value) {
        this.meta = value;
    }

}
