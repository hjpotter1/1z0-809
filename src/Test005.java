import java.util.Arrays;

public class Test005 {
    public static int checkValue(String s1, String s2) {
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        String[] strArray = new String[]{"Tiger", "Rat", "Cat", "Lion"};
        Arrays.sort(strArray, Test005::checkValue);
        for (String s : strArray) {
            System.out.print(s + " ");
        }
    }
}