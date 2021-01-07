/*
Write a program to check whether two given strings contains same set of characters as well as having same length.

 input
 String s1 = "amar";
 String s2= "rama";

 output : Both contains same characters
 */
import java.util.Scanner;
import java.util.Arrays;
public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1 : ");
        String s1 = sc.nextLine();
        System.out.println("Enter string2 : ");
        String s2 = sc.nextLine();
        //changing strings to character array
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        int n = str1.length;
        int m = str2.length;
        if (n == m) {
            //checking for duplicate elements in str1
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (str1[i] == str1[j]) {
                        str1[j] = str1[n - 1];//replacing duplicate characters
                        n--;
                        j--;
                    }
                }
            }
            //copying array with unique characters
            char[] string1 = Arrays.copyOf(str1, n);

            //checking for duplicate elements in str2
            for (int i = 0; i < m; i++) {
                for (int j = i + 1; j < m; j++) {
                    if (str2[i] == str2[j]) {
                        str2[j] = str2[m - 1];//replacing duplicate characters
                        m--;
                        j--;
                    }
                }
            }
            //copying array with unique characters
            char[] string2 = Arrays.copyOf(str2, m);

           System.out.println(Arrays.toString(string1));
           System.out.println(Arrays.toString(string2));

            boolean s = false; //flag value
            if (string1.length == string2.length) {
                //checking if new arrays have same set of characters or not
                for (int i = 0; i < string1.length; i++) {
                    for (int j = 0; j < string2.length; j++) {
                        if (string1[i] == string2[j]) {
                            s = true;
                            break;
                        }
                    }
                    if(s == false)//if (i)th  of string1 is not present present in string2 then no need to check more
                        break;
                }
            } else
                s = false;
            //output statement
            if (s) {
                System.out.println("Both contain same characters");
            } else {
                System.out.println("Both do not contain same characters");
            }
        }
        else
            System.out.println("Both do not have same length");
    }
}
