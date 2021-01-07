/*  Write a program to check whether two given strings contains same set of characters as well as having
same length.
    input
    String s1 = "amar";
    String s2= "rama";

    output : Both contains same characters
    */
import java.util.Scanner;
public class Program3 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("input 2 strings:");
        String s1 = obj.nextLine();
        String s2 = obj.nextLine();
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        int size = 0, f = 0, t = 0;
        int m=0;

            /*
            Making two character arrays to store strings s1 and s2.
             */

        char[] c = new char[s1.length()];
        char[] d = new char[s2.length()];
        if (s1.length() == s2.length()) {
                /*
                Taking out the unique characters of both the strings.
                 */
            for (int i = 0; i < s1.length(); i++) {
                f = 0;
                for (int j = 0; j < size; j++) {
                    if (a[i] == c[j]) {
                        f = 1;
                        break;
                    }
                }
                if (f == 0) {
                    c[size] = a[i];
                    size = size + 1;
                }

                for (int k = 0; k < s1.length(); k++) {
                    f = 0;
                    for (int l = 0; l < t; l++) {
                        if (b[k] == d[l]) {
                            f = 1;
                            break;
                        }
                    }
                    if (f == 0) {
                        d[t] = b[k];
                        t = t + 1;
                    }

                }
            }
    /*
    After taking out the unique characters checking if both the array containing unique characters
    is having the same set of UNIQUE characters or not.
    */

            if(t==size) {

                for (int u = 0; u <size; u++) {
                    f = 1;
                    for (int w = 0; w <t; w++) {
                        if (c[u] == d[w]) {
                            f=0;
                            m=m+1; /* Putting a counter m to check if the value of the counter is
                                            equal to length of both the character arrays*/
                            System.out.println(m);
                            break;
                        }

                    }
                    if(f==1)
                    {
                        break;
                    }
                }
            }
        }
        if(m!=0 && m==size&& m==t){
            System.out.println("Both contains same characters and have the same length");
        }
        else
            System.out.println("Both do not contanin the same characters");

    }
}
