import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class unitTest {

    private arrayMethod unitTest;

    @BeforeMethod
    public void setup() {

        unitTest = new arrayMethod();
    }

    @Test
    public void kontrol() {

        int[] num = {4, 5, 12, 33, 67, 23, 45, 2345, 23, 678};

      int[] result= unitTest.maxValues(num);
        System.out.println(result[0]);

      Assert.assertEquals(2345, result[0]);
      Assert.assertEquals(678,result[1]);
    }
}


