package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueChars_ArrayList {
    public static void main(String[] args) {

        /*  Task1. Write a program that can find the unique characters from a string
            Ex: "ABABCDEE"  Output: CD
            Do not use nested loop
         */

        String str = "ABABCDEE";
        ArrayList<String> list = new ArrayList<>();
        /*
        for(char each : str.toCharArray()){  //or can do str.split("") instead of toCharArray
            list.add(each);
        }

         */

        //instead of the above loop:
        list.addAll(Arrays.asList(str.split("")) );

        int frequency = 0;
        for(char ch : str.toCharArray()) {
            frequency = Collections.frequency(list, ch);

            if(frequency==1){
                System.out.print(ch);
            }

        }

        //Output: CD















    }

}
