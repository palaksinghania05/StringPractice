/*
Write a program to display the length and capacity of String, StringBuilder and StringBuffer.
 */
public class LengthAndCapacity {
    public static void main(String[] args) {
        String s = new String();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Length of string = " + s.length()); //length and capacity is same for string as it is immutable
        System.out.println("Length of stringBuffer = " + stringBuffer.length() + "\tCapacity of stringBuffer = " + stringBuffer.capacity());
        System.out.println("Length of stringBuilder = " + stringBuilder.length() + "\tCapacity of stringBuilder = " + stringBuilder.capacity());
    }
}
