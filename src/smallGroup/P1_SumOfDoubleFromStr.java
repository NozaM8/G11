package smallGroup;

import java.text.DecimalFormat;

public class P1_SumOfDoubleFromStr {
    public static void main(String[] args) {

        String str = "aaa1.1bbb2.2ccc4.4fff1.5";  // 9.20
        String temp = ""; // 12.4
        double sum = 0;
        for (int i=0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                temp += str.charAt(i);
            } if (str.charAt(i)=='.'){
                temp += str.charAt(i);
            } if (Character.isDigit(str.charAt(i))) {
                if (!temp.equals("")){
                    sum += Double.parseDouble(temp);
                    temp = "";
                }
            }
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(sum));

    }
}
