package Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateCharacters_ArrayList {
    public static void main(String[] args) {

        //Task1. Separate characters from an ArrayList of characters & store them in different ArrayLists
        //Ex: list: {a,b,@,c,3,5,$,6,8,&,#,%}  output: {a,b,c}, {3,5,6,8} & {@,$,&,#,%}

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('a','b','@','c','3','5','$','6','8','&','#','%'));

        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll(list);
        letters.removeIf(p -> !Character.isLetter(p)); //removes if characters are not letters
        System.out.println("Letters: " + letters); // Letters: [a, b, c]

        ArrayList<Character> nums = new ArrayList<>();
        nums.addAll(list);
        nums.removeIf(p -> !Character.isDigit(p));
        System.out.println("Numbers: " + nums); // Numbers: [3, 5, 6, 8]

        ArrayList<Character> specialChars = new ArrayList<>();
        specialChars.addAll(list);

        /* 1st way:
        specialChars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));
        System.out.println("Special characters: " + specialChars); // Special characters: [@, $, &, #, %]
         */


        // 2nd way:
        specialChars.removeAll(letters);
        specialChars.removeAll(nums);
        System.out.println("Special characters: " + specialChars); // Special characters: [@, $, &, #, %]



        // Shahnozai, thank you for allowing me access to the codes!

        // Thank you too, Akbarmirzo for everything!

















    }

}

