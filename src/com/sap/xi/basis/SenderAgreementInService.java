package com.sap.xi.basis;

/**
 * Service implementation of {SenderAgreementIn_Service} (generated by SAP WSDL to Java generator).
 */
@javax.xml.ws.WebServiceClient(name = "SenderAgreementIn_Service", targetNamespace = "http://sap.com/xi/BASIS", wsdlLocation = "wsdl/com/sap/xi/basis/SenderAgreementIn/SenderAgreementIn.wsdl")
public class SenderAgreementInService extends javax.xml.ws.Service {

  private final static java.net.URL SENDERAGREEMENTINSERVICE_WSDL_LOCATION;
  static {
    java.net.URL url = null;
    try {
		java.net.URL tmpUrl = SenderAgreementInService.class.getClassLoader().getResource("wsdl/com/sap/xi/basis/SenderAgreementIn/SenderAgreementIn.wsdl");
		url = new java.net.URL(tmpUrl.getProtocol(), tmpUrl.getHost(), tmpUrl.getPort(), tmpUrl.getFile());
    } catch (java.net.MalformedURLException e) {
      e.printStackTrace();
    }
    SENDERAGREEMENTINSERVICE_WSDL_LOCATION = url;
  }
  /**
   * Default service constructor.
   */
  public SenderAgreementInService() throws java.net.MalformedURLException {
    super(SENDERAGREEMENTINSERVICE_WSDL_LOCATION, new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "SenderAgreementIn_Service"));
  }
  public SenderAgreementInService(java.net.URL wsdlLocation, javax.xml.namespace.QName serviceName) {
    super(wsdlLocation, serviceName);
  }
  /**
   * Get method for webservice port [SenderAgreementIn_Port].
   */
  @javax.xml.ws.WebEndpoint(name = "SenderAgreementIn_Port")
  public com.sap.xi.basis.SenderAgreementIn getSenderAgreementIn_Port() {
    javax.xml.namespace.QName portName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS","SenderAgreementIn_Port");
    return (com.sap.xi.basis.SenderAgreementIn) super.getPort(portName,com.sap.xi.basis.SenderAgreementIn.class);
  }
}
