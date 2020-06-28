import org.junit.jupiter.api.Test;

public class WordsCount {

    @Test

    public void wordsCount() {

        String str = "We take 85000,0 were Month % is 2,42, The final amount will be equal 85435.68500";
        String[] arr = str.split(" ");
        System.out.println(arr.length);
        int count = 0;

        System.out.println("Word count is " + arr.length);
    }


}