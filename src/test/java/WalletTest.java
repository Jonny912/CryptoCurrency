import org.junit.Test;
import portfolio.Wallet;

public class WalletTest {
    @Test
    public void testWallet() {
        Wallet wallet = new Wallet(1000.0);
        if (wallet == null){
            System.out.println("Test failure! - createPortfolio");
        }else {
            System.out.println("OK");
        }
    }
}
