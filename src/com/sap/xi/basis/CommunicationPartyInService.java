package com.sap.xi.basis;

/**
 * Service implementation of {CommunicationPartyIn_Service} (generated by SAP WSDL to Java generator).
 */
@javax.xml.ws.WebServiceClient(name = "CommunicationPartyIn_Service", targetNamespace = "http://sap.com/xi/BASIS", wsdlLocation = "wsdl/com/sap/xi/basis/CommunicationPartyIn/CommunicationPartyIn.wsdl")
public class CommunicationPartyInService extends javax.xml.ws.Service {

  private final static java.net.URL COMMUNICATIONPARTYINSERVICE_WSDL_LOCATION;
  static {
    java.net.URL url = null;
    try {
		java.net.URL tmpUrl = CommunicationPartyInService.class.getClassLoader().getResource("wsdl/com/sap/xi/basis/CommunicationPartyIn/CommunicationPartyIn.wsdl");
		url = new java.net.URL(tmpUrl.getProtocol(), tmpUrl.getHost(), tmpUrl.getPort(), tmpUrl.getFile());
    } catch (java.net.MalformedURLException e) {
      e.printStackTrace();
    }
    COMMUNICATIONPARTYINSERVICE_WSDL_LOCATION = url;
  }
  /**
   * Default service constructor.
   */
  public CommunicationPartyInService() throws java.net.MalformedURLException {
    super(COMMUNICATIONPARTYINSERVICE_WSDL_LOCATION, new javax.xml.namespace.QName("http://sap.com/xi/BASIS", "CommunicationPartyIn_Service"));
  }
  public CommunicationPartyInService(java.net.URL wsdlLocation, javax.xml.namespace.QName serviceName) {
    super(wsdlLocation, serviceName);
  }
  /**
   * Get method for webservice port [CommunicationPartyIn_Port].
   */
  @javax.xml.ws.WebEndpoint(name = "CommunicationPartyIn_Port")
  public com.sap.xi.basis.CommunicationPartyIn getCommunicationPartyIn_Port() {
    javax.xml.namespace.QName portName = new javax.xml.namespace.QName("http://sap.com/xi/BASIS","CommunicationPartyIn_Port");
    return (com.sap.xi.basis.CommunicationPartyIn) super.getPort(portName,com.sap.xi.basis.CommunicationPartyIn.class);
  }
}
