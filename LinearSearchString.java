package Searching;

public class LinearSearchString {

    static int linearSearch(String s, char target) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String s = "education";
        char target = 'a';

        int index = linearSearch(s, target);

        System.out.println(index);
    }
}