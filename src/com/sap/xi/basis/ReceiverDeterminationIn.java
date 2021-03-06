package com.sap.xi.basis;

/**
 * Service Endpoint Interface (generated by SAP WSDL to Java generator).
 */
@javax.jws.WebService(name = "ReceiverDeterminationIn", targetNamespace = "http://sap.com/xi/BASIS")
@javax.jws.soap.SOAPBinding(parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.BARE, style = javax.jws.soap.SOAPBinding.Style.DOCUMENT, use = javax.jws.soap.SOAPBinding.Use.LITERAL)
public interface ReceiverDeterminationIn {

  /**
   * Java representation of web method [Check].
   */
  @javax.jws.WebMethod(operationName = "Check", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "LogMessageCollection", targetNamespace = "http://sap.com/xi/BASIS", partName = "LogMessageCollection")
  public com.sap.xi.basis.LogMessageCollection check(@javax.jws.WebParam(name = "ReceiverDeterminationCheckRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "ReceiverDeterminationCheckRequest") com.sap.xi.basis.ReceiverDeterminationIdentifierCollection receiverDeterminationCheckRequest);

  /**
   * Java representation of web method [Change].
   */
  @javax.jws.WebMethod(operationName = "Change", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "ConfigurationObjectModifyResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "ConfigurationObjectModifyResponse")
  public com.sap.xi.basis.ConfigurationObjectModifyOut change(@javax.jws.WebParam(name = "ReceiverDeterminationChangeRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "ReceiverDeterminationChangeRequest") com.sap.xi.basis.ReceiverDeterminationCreateChangeIn receiverDeterminationChangeRequest);

  /**
   * Java representation of web method [Query].
   */
  @javax.jws.WebMethod(operationName = "Query", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "ReceiverDeterminationQueryResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "ReceiverDeterminationQueryResponse")
  public com.sap.xi.basis.ReceiverDeterminationQueryOut query(@javax.jws.WebParam(name = "ReceiverDeterminationQueryRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "ReceiverDeterminationQueryRequest") com.sap.xi.basis.ReceiverDeterminationQueryIn receiverDeterminationQueryRequest);

  /**
   * Java representation of web method [Create].
   */
  @javax.jws.WebMethod(operationName = "Create", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "ConfigurationObjectModifyResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "ConfigurationObjectModifyResponse")
  public com.sap.xi.basis.ConfigurationObjectModifyOut create(@javax.jws.WebParam(name = "ReceiverDeterminationCreateRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "ReceiverDeterminationCreateRequest") com.sap.xi.basis.ReceiverDeterminationCreateChangeIn receiverDeterminationCreateRequest);

  /**
   * Java representation of web method [Revert].
   */
  @javax.jws.WebMethod(operationName = "Revert", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "LogMessageCollection", targetNamespace = "http://sap.com/xi/BASIS", partName = "LogMessageCollection")
  public com.sap.xi.basis.LogMessageCollection revert(@javax.jws.WebParam(name = "ReceiverDeterminationRevertRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "ReceiverDeterminationRevertRequest") com.sap.xi.basis.ReceiverDeterminationIdentifierCollection receiverDeterminationRevertRequest);

  /**
   * Java representation of web method [Read].
   */
  @javax.jws.WebMethod(operationName = "Read", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "ReceiverDeterminationReadResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "ReceiverDeterminationReadResponse")
  public com.sap.xi.basis.ReceiverDeterminationReadOut read(@javax.jws.WebParam(name = "ReceiverDeterminationReadRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "ReceiverDeterminationReadRequest") com.sap.xi.basis.ReceiverDeterminationReadIn receiverDeterminationReadRequest);

  /**
   * Java representation of web method [Delete].
   */
  @javax.jws.WebMethod(operationName = "Delete", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "ConfigurationObjectModifyResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "ConfigurationObjectModifyResponse")
  public com.sap.xi.basis.ConfigurationObjectModifyOut delete(@javax.jws.WebParam(name = "ReceiverDeterminationDeleteRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "ReceiverDeterminationDeleteRequest") com.sap.xi.basis.ReceiverDeterminationDeleteOpenForEditIn receiverDeterminationDeleteRequest);

  /**
   * Java representation of web method [OpenForEdit].
   */
  @javax.jws.WebMethod(operationName = "OpenForEdit", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "ReceiverDeterminationOpenForEditResponse", targetNamespace = "http://sap.com/xi/BASIS", partName = "ReceiverDeterminationOpenForEditResponse")
  public com.sap.xi.basis.ReceiverDeterminationOpenForEditOut openForEdit(@javax.jws.WebParam(name = "ReceiverDeterminationOpenForEditRequest", targetNamespace = "http://sap.com/xi/BASIS", partName = "ReceiverDeterminationOpenForEditRequest") com.sap.xi.basis.ReceiverDeterminationDeleteOpenForEditIn receiverDeterminationOpenForEditRequest);

}
