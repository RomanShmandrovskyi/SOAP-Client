
package web.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the web.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Fault_QNAME = new QName("http://service.web/", "fault");
    private final static QName _Wallet_QNAME = new QName("http://service.web/", "wallet");
    private final static QName _Success_QNAME = new QName("http://service.web/", "success");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: web.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Wallet }
     * 
     */
    public Wallet createWallet() {
        return new Wallet();
    }

    /**
     * Create an instance of {@link ResponseStatusSuccess }
     * 
     */
    public ResponseStatusSuccess createResponseStatusSuccess() {
        return new ResponseStatusSuccess();
    }

    /**
     * Create an instance of {@link ResponseStatusFault }
     * 
     */
    public ResponseStatusFault createResponseStatusFault() {
        return new ResponseStatusFault();
    }

    /**
     * Create an instance of {@link WalletResponse }
     * 
     */
    public WalletResponse createWalletResponse() {
        return new WalletResponse();
    }

    /**
     * Create an instance of {@link ResponseStatus }
     * 
     */
    public ResponseStatus createResponseStatus() {
        return new ResponseStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStatusFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "fault")
    public JAXBElement<ResponseStatusFault> createFault(ResponseStatusFault value) {
        return new JAXBElement<ResponseStatusFault>(_Fault_QNAME, ResponseStatusFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Wallet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "wallet")
    public JAXBElement<Wallet> createWallet(Wallet value) {
        return new JAXBElement<Wallet>(_Wallet_QNAME, Wallet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStatusSuccess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "success")
    public JAXBElement<ResponseStatusSuccess> createSuccess(ResponseStatusSuccess value) {
        return new JAXBElement<ResponseStatusSuccess>(_Success_QNAME, ResponseStatusSuccess.class, null, value);
    }

}
