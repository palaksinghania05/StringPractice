/*
Write a program to concatenate StringBuilder & StringBuffer objects.
 */
public class Concatenation {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        StringBuilder stringBuilder = new StringBuilder(" World");
        stringBuffer.append(stringBuilder);
        System.out.println(stringBuffer);
    }
}
