
package web.service.implementation;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WalletServiceImplService", targetNamespace = "http://implementation.service.web/", wsdlLocation = "http://localhost:8080/WalletService?wsdl")
public class WalletServiceImplService
    extends Service
{

    private final static URL WALLETSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException WALLETSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName WALLETSERVICEIMPLSERVICE_QNAME = new QName("http://implementation.service.web/", "WalletServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WalletService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WALLETSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        WALLETSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public WalletServiceImplService() {
        super(__getWsdlLocation(), WALLETSERVICEIMPLSERVICE_QNAME);
    }

    public WalletServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WALLETSERVICEIMPLSERVICE_QNAME, features);
    }

    public WalletServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, WALLETSERVICEIMPLSERVICE_QNAME);
    }

    public WalletServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WALLETSERVICEIMPLSERVICE_QNAME, features);
    }

    public WalletServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WalletServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WalletService
     */
    @WebEndpoint(name = "WalletServiceImplPort")
    public web.service.implementation.WalletService getWalletServiceImplPort() {
        return super.getPort(new QName("http://implementation.service.web/", "WalletServiceImplPort"), WalletService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WalletService
     */
    @WebEndpoint(name = "WalletServiceImplPort")
    public WalletService getWalletServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://implementation.service.web/", "WalletServiceImplPort"), WalletService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WALLETSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw WALLETSERVICEIMPLSERVICE_EXCEPTION;
        }
        return WALLETSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}