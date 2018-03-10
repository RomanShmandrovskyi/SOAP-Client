package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import web.service.Wallet;
import web.service.WalletResponse;
import web.service.implementation.WalletService;
import web.service.implementation.WalletServiceImplService;

import static data.DataForTest.*;
import static org.testng.Assert.*;

public class WalletServiceTest {

    private static WalletService service = new WalletServiceImplService().getWalletServiceImplPort();

    //1
    @Test(testName = "add new wallet")
    public void addNewWalletTest() {
        WalletResponse response = service.getAllWallets();
        int walletCount = response.getValues().size();
        response = service.addNewWallet();
        int actualWalletCount = service.getAllWallets().getValues().size();

        assertEquals(actualWalletCount, walletCount + 1);

        String actual = response.getSuccess().getMessage();
        assertEquals(actual, WALLET_ADDED);
    }

    //2
    @Test(testName = "get all wallets")
    public void getAllWalletsTest() {
        WalletResponse response = service.getAllWallets();
        int walletCount = service.getAllWallets().getValues().size();
        String actual = response.getSuccess().getMessage();

        assertEquals(actual, ALL_WALLETS);
        assertNotNull(walletCount);
    }

    //3
    @Test(testName = "get not exist wallet")
    public void getNotExistWalletTest() {
        WalletResponse response = service.getWalletById(NON_EXIST_WALLET_ID);

        String actual = response.getFault().getFaultStatus();
        assertEquals(actual, NO_ONE_WALLET);

        Wallet wallet = (Wallet) service.getWalletById(NON_EXIST_WALLET_ID).getValue();
        assertNull(wallet);
    }

    //4
    @Test(testName = "get wallet")
    public void getExistWalletByIdTest() {
        WalletResponse response = service.getWalletById(EXIST_WALLET_ID);

        String actual = response.getSuccess().getMessage();
        assertEquals(actual, WALLET_IS_PRESENT);

        Wallet wallet = (Wallet) service.getWalletById(EXIST_WALLET_ID).getValue();
        assertNotNull(wallet);
    }

    //5
    @Test(testName = "buy good")
    public void buyGoodTest() {
        double balance = (double) service.getBalanceOfCurrentWallet(EXIST_WALLET_ID).getValue();
        WalletResponse response = service.buyGood(EXIST_WALLET_ID, LITTLE_NUMBER);

        double balanceAfterPurchase = (double) service.getBalanceOfCurrentWallet(EXIST_WALLET_ID).getValue();

        String actual = response.getSuccess().getMessage();
        assertEquals(actual, SUCCESSFUL_PURCHASE);

        assertEquals(balanceAfterPurchase, balance - LITTLE_NUMBER);
    }

    //6
    @Test(testName = "buy expensive good")
    public void buyExpensiveGoodTest() {
        double balance = (double) service.getBalanceOfCurrentWallet(EXIST_WALLET_ID).getValue();
        WalletResponse response = service.buyGood(EXIST_WALLET_ID, BIG_NUMBER);
        double balanceAfterPurchase = (double) service.getBalanceOfCurrentWallet(EXIST_WALLET_ID).getValue();

        String actual = response.getFault().getFaultStatus();
        assertEquals(actual, FAULT_PURCHASE);

        assertEquals(balance, balanceAfterPurchase);
    }

    //7
    @Test(testName = "get balance of current wallet")
    public void getBalanceTest() {
        double balanceActual = (double) service.getBalanceOfCurrentWallet(1).getValue();
        assertEquals(balanceActual, BALANCE_ON_WALLET);
    }

    //8
    @Test(testName = "put money on wallet")
    public void putMoneyOnWalletTest() {
        double balance = (double) service.getBalanceOfCurrentWallet(EXIST_WALLET_ID).getValue();
        WalletResponse response = service.putMoneyOnBalance(EXIST_WALLET_ID, REFILL_NUMBER);
        double balanceAfterRefill = (double) service.getBalanceOfCurrentWallet(EXIST_WALLET_ID).getValue();

        assertEquals(balance + REFILL_NUMBER, balanceAfterRefill);

        String actual = response.getSuccess().getMessage();
        assertEquals(actual, REFILL_BALANCE);
    }

    //9
    @Test(testName = "put to much money on wallet")
    public void putToMuchMoneyOnWalletTest() {
        double balance = (double) service.getBalanceOfCurrentWallet(EXIST_WALLET_ID).getValue();
        WalletResponse response = service.putMoneyOnBalance(EXIST_WALLET_ID, BIG_NUMBER);
        double balanceAfterRefill = (double) service.getBalanceOfCurrentWallet(EXIST_WALLET_ID).getValue();

        assertEquals(balance, balanceAfterRefill);

        String actual = response.getFault().getFaultStatus();
        assertEquals(actual, FAULT_REFILL_BALANCE);
    }

    //10
    @Test(testName = "delete wallet")
    public void deleteWalletTest() {
        int walletCount = service.getAllWallets().getValues().size();
        WalletResponse response = service.deleteWalletById(TEST_WALLET_ID);
        int walletCountAfterDeleting = service.getAllWallets().getValues().size();

        assertEquals(walletCountAfterDeleting, walletCount - 1);

        String actual = response.getSuccess().getMessage();
        assertEquals(actual, SUCCESS_WALLET_DELETING);
    }
}
