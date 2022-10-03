import java.util.Arrays;

public class arrayMethod {


    public int[] maxValues(int[] num) {



        Arrays.sort(num);

        int max1 = num[num.length - 1];
        int max2 = num[num.length - 2];


        int[] values={max1,max2};

        return values;

    }


}


