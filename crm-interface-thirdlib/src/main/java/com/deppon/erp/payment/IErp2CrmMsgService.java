package com.deppon.erp.payment;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2012-10-25T16:46:59.859+08:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "service.amsonline.ws.deppon.com", name = "IErp2crmMsgService")
@XmlSeeAlso({ObjectFactory.class})
public interface IErp2CrmMsgService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "insertCrmMsg", targetNamespace = "service.amsonline.ws.deppon.com", className = "com.deppon.erp.payment.InsertCrmMsg")
    @WebMethod
    @ResponseWrapper(localName = "insertCrmMsgResponse", targetNamespace = "service.amsonline.ws.deppon.com", className = "com.deppon.erp.payment.InsertCrmMsgResponse")
    public java.lang.String insertCrmMsg(
        @WebParam(name = "arg0", targetNamespace = "")
        java.util.List<com.deppon.erp.payment.Msg> arg0
    );
}