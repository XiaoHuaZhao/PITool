package com.sap.xi.basis;

/**
 * Service Endpoint Interface (generated by SAP WSDL to Java generator).
 */
@javax.jws.WebService(name = "ProcessComponentIn", targetNamespace = "http://sap.com/xi/BASIS")
@javax.jws.soap.SOAPBinding(parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.BARE, style = javax.jws.soap.SOAPBinding.Style.DOCUMENT, use = javax.jws.soap.SOAPBinding.Use.LITERAL)
public interface ProcessComponentIn {

  /**
   * Java representation of web method [Check].
   */
  @javax.jws.WebMethod(operationName = "Check", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "LogMessageCollection", targetNamespace = "http://sap.com/xi/BASIS", partName = "LogMessageCollection")
  public com.sap.xi.basis.LogMessageCollection check(@javax.jws.WebParam(name = "ProcessComponentCheckRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "ProcessComponentCheckRequest") com.sap.xi.basis.ProcessComponentIdentifierCollection processComponentCheckRequest);

  /**
   * Java representation of web method [Query].
   */
  @javax.jws.WebMethod(operationName = "Query", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "ProcessComponentQueryResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "ProcessComponentQueryResponse")
  public com.sap.xi.basis.ProcessComponentQueryOut query(@javax.jws.WebParam(name = "ProcessComponentQueryRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "ProcessComponentQueryRequest") com.sap.xi.basis.ProcessComponentQueryIn processComponentQueryRequest);

  /**
   * Java representation of web method [Create].
   */
  @javax.jws.WebMethod(operationName = "Create", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "ConfigurationObjectModifyResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "ConfigurationObjectModifyResponse")
  public com.sap.xi.basis.ConfigurationObjectModifyOut create(@javax.jws.WebParam(name = "ProcessComponentCreateRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "ProcessComponentCreateRequest") com.sap.xi.basis.ProcessComponentCreateChangeIn processComponentCreateRequest);

  /**
   * Java representation of web method [Revert].
   */
  @javax.jws.WebMethod(operationName = "Revert", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "LogMessageCollection", targetNamespace = "http://sap.com/xi/BASIS", partName = "LogMessageCollection")
  public com.sap.xi.basis.LogMessageCollection revert(@javax.jws.WebParam(name = "ProcessComponentRevertRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "ProcessComponentRevertRequest") com.sap.xi.basis.ProcessComponentIdentifierCollection processComponentRevertRequest);

  /**
   * Java representation of web method [Read].
   */
  @javax.jws.WebMethod(operationName = "Read", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "ProcessComponentReadResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "ProcessComponentReadResponse")
  public com.sap.xi.basis.ProcessComponentReadOut read(@javax.jws.WebParam(name = "ProcessComponentReadRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "ProcessComponentReadRequest") com.sap.xi.basis.ProcessComponentReadIn processComponentReadRequest);

  /**
   * Java representation of web method [Delete].
   */
  @javax.jws.WebMethod(operationName = "Delete", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "ConfigurationObjectModifyResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "ConfigurationObjectModifyResponse")
  public com.sap.xi.basis.ConfigurationObjectModifyOut delete(@javax.jws.WebParam(name = "ProcessComponentDeleteRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "ProcessComponentDeleteRequest") com.sap.xi.basis.ProcessComponentDeleteOpenForEditIn processComponentDeleteRequest);

}
