package SumWithoutHighestAndLowestNumber;

import java.util.Arrays;

/* Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.
Mind the input validation. */

public class Kata {
    public static int sum(int[] numbers)
    {
        if ( numbers == null ){
            return 0;
        } else if ( numbers.length < 2 ){
            return 0;
        }
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        int sum = 0;

        for (int i = 0; i < numbers.length ; i++) {
            sum += numbers[i];
        }

        sum = sum - max - min;
        return sum;
    }
}
