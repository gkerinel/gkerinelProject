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
    public void validation() {

        int[] num = {4, 5, 12, 33, 67, 23, 45, 2345, 17, 678};

      int[] result= unitTest.maxValues(num);
        System.out.println("max1 value= "+result[0]);
        System.out.println("max2 value= "+result[1]);

      Assert.assertEquals(2345, result[0]);
      Assert.assertEquals(678,result[1]);
    }
}


