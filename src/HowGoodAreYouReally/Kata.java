package HowGoodAreYouReally;

/* There was a test in your class and you passed it. Congratulations!
But you're an ambitious person. You want to know if you're better than the average student in your class.
You receive an array with your peers' test scores. Now calculate the average and compare your score!
Return true if you're better, else false! */

public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int i = 0; i < classPoints.length ; i++) {
            sum = classPoints[i] + sum;
        }
        sum = (sum + yourPoints) / (classPoints.length + 1);
        if ( yourPoints > sum ){
            return true;
        }else {
            return false;
        }
    }
}
