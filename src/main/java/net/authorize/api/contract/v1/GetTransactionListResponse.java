//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.27 at 04:18:12 PM GMT+05:30 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ANetApiResponse">
 *       &lt;sequence>
 *         &lt;element name="transactions" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ArrayOfTransactionSummaryType" minOccurs="0"/>
 *         &lt;element name="totalNumInResultSet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transactions",
    "totalNumInResultSet"
})
@XmlRootElement(name = "getTransactionListResponse")
public class GetTransactionListResponse
    extends ANetApiResponse
{

    protected ArrayOfTransactionSummaryType transactions;
    protected Integer totalNumInResultSet;

    /**
     * Gets the value of the transactions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransactionSummaryType }
     *     
     */
    public ArrayOfTransactionSummaryType getTransactions() {
        return transactions;
    }

    /**
     * Sets the value of the transactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransactionSummaryType }
     *     
     */
    public void setTransactions(ArrayOfTransactionSummaryType value) {
        this.transactions = value;
    }

    /**
     * Gets the value of the totalNumInResultSet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumInResultSet() {
        return totalNumInResultSet;
    }

    /**
     * Sets the value of the totalNumInResultSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumInResultSet(Integer value) {
        this.totalNumInResultSet = value;
    }

}
