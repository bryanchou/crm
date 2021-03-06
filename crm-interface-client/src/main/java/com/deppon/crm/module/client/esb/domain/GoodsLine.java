//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 08:37:14 上午 CST 
//


package com.deppon.crm.module.client.esb.domain;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 走货线路
 * 
 * <p>Java class for GoodsLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="startingArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="arrivalArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startingOutfield" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="arrivalOutfield" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsLine", propOrder = {
    "fid",
    "startingArea",
    "arrivalArea",
    "startingOutfield",
    "arrivalOutfield"
})
public class GoodsLine {

    @XmlElement(required = true)
    protected BigDecimal fid;
    @XmlElement(required = true)
    protected String startingArea;
    @XmlElement(required = true)
    protected String arrivalArea;
    @XmlElement(required = true)
    protected String startingOutfield;
    @XmlElement(required = true)
    protected String arrivalOutfield;

    /**
     * Gets the value of the fid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFid() {
        return fid;
    }

    /**
     * Sets the value of the fid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFid(BigDecimal value) {
        this.fid = value;
    }

    /**
     * Gets the value of the startingArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingArea() {
        return startingArea;
    }

    /**
     * Sets the value of the startingArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingArea(String value) {
        this.startingArea = value;
    }

    /**
     * Gets the value of the arrivalArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalArea() {
        return arrivalArea;
    }

    /**
     * Sets the value of the arrivalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalArea(String value) {
        this.arrivalArea = value;
    }

    /**
     * Gets the value of the startingOutfield property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingOutfield() {
        return startingOutfield;
    }

    /**
     * Sets the value of the startingOutfield property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingOutfield(String value) {
        this.startingOutfield = value;
    }

    /**
     * Gets the value of the arrivalOutfield property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalOutfield() {
        return arrivalOutfield;
    }

    /**
     * Sets the value of the arrivalOutfield property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalOutfield(String value) {
        this.arrivalOutfield = value;
    }

}
