import org.junit.Test;
import portfolio.Portfolio;

public class PortfolioTest {
    @Test
    public void testPortfolio() {
        Portfolio portfolio = new Portfolio(50000.0);
        if(portfolio == null){
            System.out.println("Test failure! - createPortfolio");
        }else {
            System.out.println("OK");
        }
    }
}
