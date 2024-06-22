package Java.Module_25;

import java.util.Arrays;

public class fourth {
    public static void main(String[] args) {
        String inputString = "example";
        String sortedString = sortString(inputString);
        System.out.println(inputString);
        System.out.println(sortedString);
    }

    public static String sortString(String input) {
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
