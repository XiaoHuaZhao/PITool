package com.sap.xi.basis;

/**
 * Service Endpoint Interface (generated by SAP WSDL to Java generator).
 */
@javax.jws.WebService(name = "BusinessComponentIn", targetNamespace = "http://sap.com/xi/BASIS")
@javax.jws.soap.SOAPBinding(parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.BARE, style = javax.jws.soap.SOAPBinding.Style.DOCUMENT, use = javax.jws.soap.SOAPBinding.Use.LITERAL)
public interface BusinessComponentIn {

  /**
   * Java representation of web method [Check].
   */
  @javax.jws.WebMethod(operationName = "Check", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "LogMessageCollection", targetNamespace = "http://sap.com/xi/BASIS", partName = "LogMessageCollection")
  public com.sap.xi.basis.LogMessageCollection check(@javax.jws.WebParam(name = "BusinessComponentCheckRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "BusinessComponentCheckRequest") com.sap.xi.basis.BusinessComponentIdentifierCollection businessComponentCheckRequest);

  /**
   * Java representation of web method [Change].
   */
  @javax.jws.WebMethod(operationName = "Change", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "ConfigurationObjectModifyResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "ConfigurationObjectModifyResponse")
  public com.sap.xi.basis.ConfigurationObjectModifyOut change(@javax.jws.WebParam(name = "BusinessComponentChangeRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "BusinessComponentChangeRequest") com.sap.xi.basis.BusinessComponentCreateChangeIn businessComponentChangeRequest);

  /**
   * Java representation of web method [Query].
   */
  @javax.jws.WebMethod(operationName = "Query", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "BusinessComponentQueryResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "BusinessComponentQueryResponse")
  public com.sap.xi.basis.BusinessComponentQueryOut query(@javax.jws.WebParam(name = "BusinessComponentQueryRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "BusinessComponentQueryRequest") com.sap.xi.basis.BusinessComponentQueryIn businessComponentQueryRequest);

  /**
   * Java representation of web method [Create].
   */
  @javax.jws.WebMethod(operationName = "Create", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "ConfigurationObjectModifyResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "ConfigurationObjectModifyResponse")
  public com.sap.xi.basis.ConfigurationObjectModifyOut create(@javax.jws.WebParam(name = "BusinessComponentCreateRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "BusinessComponentCreateRequest") com.sap.xi.basis.BusinessComponentCreateChangeIn businessComponentCreateRequest);

  /**
   * Java representation of web method [Revert].
   */
  @javax.jws.WebMethod(operationName = "Revert", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "LogMessageCollection", targetNamespace = "http://sap.com/xi/BASIS", partName = "LogMessageCollection")
  public com.sap.xi.basis.LogMessageCollection revert(@javax.jws.WebParam(name = "BusinessComponentRevertRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "BusinessComponentRevertRequest") com.sap.xi.basis.BusinessComponentIdentifierCollection businessComponentRevertRequest);

  /**
   * Java representation of web method [Read].
   */
  @javax.jws.WebMethod(operationName = "Read", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "BusinessComponentReadResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "BusinessComponentReadResponse")
  public com.sap.xi.basis.BusinessComponentReadOut read(@javax.jws.WebParam(name = "BusinessComponentReadRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "BusinessComponentReadRequest") com.sap.xi.basis.BusinessComponentReadIn businessComponentReadRequest);

  /**
   * Java representation of web method [Delete].
   */
  @javax.jws.WebMethod(operationName = "Delete", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "ConfigurationObjectModifyResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "ConfigurationObjectModifyResponse")
  public com.sap.xi.basis.ConfigurationObjectModifyOut delete(@javax.jws.WebParam(name = "BusinessComponentDeleteRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "BusinessComponentDeleteRequest") com.sap.xi.basis.BusinessComponentDeleteOpenForEditIn businessComponentDeleteRequest);

  /**
   * Java representation of web method [OpenForEdit].
   */
  @javax.jws.WebMethod(operationName = "OpenForEdit", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "BusinessComponentOpenForEditResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "BusinessComponentOpenForEditResponse")
  public com.sap.xi.basis.BusinessComponentOpenForEditOut openForEdit(@javax.jws.WebParam(name = "BusinessComponentOpenForEditRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "BusinessComponentOpenForEditRequest") com.sap.xi.basis.BusinessComponentDeleteOpenForEditIn businessComponentOpenForEditRequest);

}
