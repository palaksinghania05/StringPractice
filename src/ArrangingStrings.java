/*
Write a program to lexicographically arrange the given strings
 "Raman" , "Aman" , "Vikram" , "Shyam" and "Bhuvan".
 */
import java.util.Arrays;

public class ArrangingStrings {
    public static void main(String[] args) {
        String[] str = {"Raman","Aman","Vikram","Shyam","Bhuvan"};
        for(int i = 0; i < str.length; i++){
            for(int j = i+1; j < str.length; j++){
                int result = str[i].compareTo(str[j]);
                String s = "";
                if(result > 0) {
                    s = str[i];
                    str[i] = str[j];
                    str[j] = s;
                }
            }
        }
        System.out.println("Arranged String = " + Arrays.toString(str));
    }
}
