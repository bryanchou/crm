//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.23 at 09:55:50 上午 CST 
//


package com.deppon.crm.module.interfaces.ows.jmsdomain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateOwsCustomerRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateOwsCustomerRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobilephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkmanName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="provinceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="provinceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="areaName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobilephoneBU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telephoneBU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkmanNameBU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOwsCustomerRequest", propOrder = {
    "userName",
    "mobilephone",
    "telephone",
    "linkmanName",
    "provinceCode",
    "cityCode",
    "areaCode",
    "provinceName",
    "cityName",
    "areaName",
    "detailAddress",
    "email",
    "mobilephoneBU",
    "telephoneBU",
    "linkmanNameBU",
    "operateType"
})
public class CreateOwsCustomerRequest {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String mobilephone;
    @XmlElement(required = true)
    protected String telephone;
    @XmlElement(required = true)
    protected String linkmanName;
    @XmlElement(required = true)
    protected String provinceCode;
    @XmlElement(required = true)
    protected String cityCode;
    @XmlElement(required = true)
    protected String areaCode;
    @XmlElement(required = true)
    protected String provinceName;
    @XmlElement(required = true)
    protected String cityName;
    @XmlElement(required = true)
    protected String areaName;
    @XmlElement(required = true)
    protected String detailAddress;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String mobilephoneBU;
    @XmlElement(required = true)
    protected String telephoneBU;
    @XmlElement(required = true)
    protected String linkmanNameBU;
    @XmlElement(required = true)
    protected String operateType;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the mobilephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilephone() {
        return mobilephone;
    }

    /**
     * Sets the value of the mobilephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilephone(String value) {
        this.mobilephone = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the linkmanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkmanName() {
        return linkmanName;
    }

    /**
     * Sets the value of the linkmanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkmanName(String value) {
        this.linkmanName = value;
    }

    /**
     * Gets the value of the provinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * Sets the value of the provinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceCode(String value) {
        this.provinceCode = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the provinceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * Sets the value of the provinceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceName(String value) {
        this.provinceName = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the areaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * Sets the value of the areaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaName(String value) {
        this.areaName = value;
    }

    /**
     * Gets the value of the detailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * Sets the value of the detailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailAddress(String value) {
        this.detailAddress = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the mobilephoneBU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilephoneBU() {
        return mobilephoneBU;
    }

    /**
     * Sets the value of the mobilephoneBU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilephoneBU(String value) {
        this.mobilephoneBU = value;
    }

    /**
     * Gets the value of the telephoneBU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneBU() {
        return telephoneBU;
    }

    /**
     * Sets the value of the telephoneBU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneBU(String value) {
        this.telephoneBU = value;
    }

    /**
     * Gets the value of the linkmanNameBU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkmanNameBU() {
        return linkmanNameBU;
    }

    /**
     * Sets the value of the linkmanNameBU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkmanNameBU(String value) {
        this.linkmanNameBU = value;
    }

    /**
     * Gets the value of the operateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperateType() {
        return operateType;
    }

    /**
     * Sets the value of the operateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperateType(String value) {
        this.operateType = value;
    }

}
