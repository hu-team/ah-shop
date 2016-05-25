
package nl.arvici.ahshop.wsinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.server.ServiceResponseOfUserUEsMBek5;


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
 *         &lt;element name="CreateUserResult" type="{http://schemas.datacontract.org/2004/07/server}ServiceResponseOfUserUEsMBek5" minOccurs="0"/>
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
    "createUserResult"
})
@XmlRootElement(name = "CreateUserResponse")
public class CreateUserResponse {

    @XmlElementRef(name = "CreateUserResult", namespace = "http://arvici.nl/ahshop/wsinterface", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceResponseOfUserUEsMBek5> createUserResult;

    /**
     * Gets the value of the createUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponseOfUserUEsMBek5 }{@code >}
     *     
     */
    public JAXBElement<ServiceResponseOfUserUEsMBek5> getCreateUserResult() {
        return createUserResult;
    }

    /**
     * Sets the value of the createUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponseOfUserUEsMBek5 }{@code >}
     *     
     */
    public void setCreateUserResult(JAXBElement<ServiceResponseOfUserUEsMBek5> value) {
        this.createUserResult = value;
    }

}
