import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberTest {

    @Test
    public void mathExampleTest() throws Exception {
        Number mathExample = new Number();
        Assertions.assertEquals(mathExample.findSum(2,3), 5);
    }

    @Test
    public void QuotExampleTest() {
        Number quotExample = new Number();
        Assertions.assertEquals(quotExample.findQuot(5,1), 4);
    }

    @Test
    public void prodExampleTest(){
        Number prodExample = new Number();
        Assertions.assertEquals(prodExample.findProd(2, 5), 10);

    }
}
