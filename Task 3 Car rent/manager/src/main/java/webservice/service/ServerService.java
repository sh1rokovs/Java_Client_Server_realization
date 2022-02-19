
package webservice.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


@WebServiceClient(name = "ServerService", targetNamespace = "http://server/", wsdlLocation = "http://localhost:8080/Server?wsdl")
public class ServerService
    extends Service
{

    private final static URL SERVERSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVERSERVICE_EXCEPTION;
    private final static QName SERVERSERVICE_QNAME = new QName("http://server/", "ServerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Server?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVERSERVICE_WSDL_LOCATION = url;
        SERVERSERVICE_EXCEPTION = e;
    }

    public ServerService() {
        super(__getWsdlLocation(), SERVERSERVICE_QNAME);
    }

    public ServerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVERSERVICE_QNAME, features);
    }

    public ServerService(URL wsdlLocation) {
        super(wsdlLocation, SERVERSERVICE_QNAME);
    }

    public ServerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVERSERVICE_QNAME, features);
    }

    public ServerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }


    @WebEndpoint(name = "ServerPort")
    public Server getServerPort() {
        return super.getPort(new QName("http://server/", "ServerPort"), Server.class);
    }


    @WebEndpoint(name = "ServerPort")
    public Server getServerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server/", "ServerPort"), Server.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVERSERVICE_EXCEPTION!= null) {
            throw SERVERSERVICE_EXCEPTION;
        }
        return SERVERSERVICE_WSDL_LOCATION;
    }

}
