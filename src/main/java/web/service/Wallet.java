
package web.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wallet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wallet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="walletId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="walletBalance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wallet", propOrder = {
    "walletId",
    "walletBalance"
})
public class Wallet {

    protected int walletId;
    protected double walletBalance;

    /**
     * Gets the value of the walletId property.
     * 
     */
    public int getWalletId() {
        return walletId;
    }

    /**
     * Sets the value of the walletId property.
     * 
     */
    public void setWalletId(int value) {
        this.walletId = value;
    }

    /**
     * Gets the value of the walletBalance property.
     * 
     */
    public double getWalletBalance() {
        return walletBalance;
    }

    /**
     * Sets the value of the walletBalance property.
     * 
     */
    public void setWalletBalance(double value) {
        this.walletBalance = value;
    }

}
