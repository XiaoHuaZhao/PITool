package com.sap.xi.basis;

/**
 * Service Endpoint Interface (generated by SAP WSDL to Java generator).
 */
@javax.jws.WebService(name = "IntegrationProcessIn", targetNamespace = "http://sap.com/xi/BASIS")
@javax.jws.soap.SOAPBinding(parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.BARE, style = javax.jws.soap.SOAPBinding.Style.DOCUMENT, use = javax.jws.soap.SOAPBinding.Use.LITERAL)
public interface IntegrationProcessIn {

  /**
   * Java representation of web method [Check].
   */
  @javax.jws.WebMethod(operationName = "Check", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "LogMessageCollection", targetNamespace = "http://sap.com/xi/BASIS", partName = "LogMessageCollection")
  public com.sap.xi.basis.LogMessageCollection check(@javax.jws.WebParam(name = "IntegrationProcessCheckRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "IntegrationProcessCheckRequest") com.sap.xi.basis.IntegrationProcessIdentifierCollection integrationProcessCheckRequest);

  /**
   * Java representation of web method [Query].
   */
  @javax.jws.WebMethod(operationName = "Query", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "IntegrationProcessQueryResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "IntegrationProcessQueryResponse")
  public com.sap.xi.basis.IntegrationProcessQueryOut query(@javax.jws.WebParam(name = "IntegrationProcessQueryRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "IntegrationProcessQueryRequest") com.sap.xi.basis.IntegrationProcessQueryIn integrationProcessQueryRequest);

  /**
   * Java representation of web method [Create].
   */
  @javax.jws.WebMethod(operationName = "Create", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "ConfigurationObjectModifyResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "ConfigurationObjectModifyResponse")
  public com.sap.xi.basis.ConfigurationObjectModifyOut create(@javax.jws.WebParam(name = "IntegrationProcessCreateRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "IntegrationProcessCreateRequest") com.sap.xi.basis.IntegrationProcessCreateChangeIn integrationProcessCreateRequest);

  /**
   * Java representation of web method [Revert].
   */
  @javax.jws.WebMethod(operationName = "Revert", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "LogMessageCollection", targetNamespace = "http://sap.com/xi/BASIS", partName = "LogMessageCollection")
  public com.sap.xi.basis.LogMessageCollection revert(@javax.jws.WebParam(name = "IntegrationProcessRevertRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "IntegrationProcessRevertRequest") com.sap.xi.basis.IntegrationProcessIdentifierCollection integrationProcessRevertRequest);

  /**
   * Java representation of web method [Read].
   */
  @javax.jws.WebMethod(operationName = "Read", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "IntegrationProcessReadResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "IntegrationProcessReadResponse")
  public com.sap.xi.basis.IntegrationProcessReadOut read(@javax.jws.WebParam(name = "IntegrationProcessReadRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "IntegrationProcessReadRequest") com.sap.xi.basis.IntegrationProcessReadIn integrationProcessReadRequest);

  /**
   * Java representation of web method [Delete].
   */
  @javax.jws.WebMethod(operationName = "Delete", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "ConfigurationObjectModifyResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "ConfigurationObjectModifyResponse")
  public com.sap.xi.basis.ConfigurationObjectModifyOut delete(@javax.jws.WebParam(name = "IntegrationProcessDeleteRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "IntegrationProcessDeleteRequest") com.sap.xi.basis.IntegrationProcessDeleteOpenForEditIn integrationProcessDeleteRequest);

}