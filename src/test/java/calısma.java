import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;

public class calısma {

@BeforeTest
public void testStart(){
    System.out.println("test başlıyor");
}

@AfterTest
public  void testsonu(){

    System.out.println("test bitti");
}
    @Test
    public void   testarrays () {

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {

            nums[i] = (int) (Math.random() * 1000);
        }
        System.out.println("nums = " + Arrays.toString(nums));
        Arrays.sort(nums);


        int max1 = nums[nums.length - 1];
        int max2 = nums[nums.length - 2];

        System.out.println("Maximu = " + max1);
        System.out.println("En büyük ikinci= " + max2);


            Assert.assertTrue(max1 >= max2);

        for (int i = 0; i < nums.length-1; i++) {
            Assert.assertTrue(max1 >= nums[i]);
        }
        for (int i = 0; i < nums.length-2; i++) {
            Assert.assertTrue(max2 >= nums[i]);
        }

        }

    }



