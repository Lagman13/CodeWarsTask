package JadenCasingStrings;

/* Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
Jaden is also known for some of his philosophy that he delivers via Twitter.
When writing on Twitter, he is known for almost always capitalizing every word.
For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.
Your task is to convert strings to how they would be written by Jaden Smith.
The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.*/

public class JadenCase {

    public String toJadenCase(String phrase) {

        if (phrase == null || phrase.isEmpty()){
            return null;
        }

        String[] array = phrase.split(" ");
        String phrase1 = "";

        for (int i = 0; i < array.length; i++) {
            String str = array[i].substring(0, 1).toUpperCase() + array[i].substring(1);
            array[i] = str;
        }
        for (int i = 0; i < array.length; i++) {

            if ( i < array.length - 1 ){
                phrase1 = phrase1 + array[i] + " ";
            }else{
                phrase1 = phrase1 + array[i];
            }

        }

        return phrase1;
    }

}
