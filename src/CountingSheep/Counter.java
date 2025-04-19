package CountingSheep;

/* Consider an array/list of sheep where some sheep may be missing from their place.
We need a function that counts the number of sheep present in the array (true means present). */

public class Counter {

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int x = 0;
        if (arrayOfSheeps == null && arrayOfSheeps.length < 2){
            return 0;
        }
        for (int i = 0; i < arrayOfSheeps.length; i++){

            if (arrayOfSheeps[i] != null){
                if (arrayOfSheeps[i] == true ){
                    x++;
                }
            }
        }

        return x;
    }

}
