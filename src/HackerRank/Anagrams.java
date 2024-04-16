package HackerRank;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) return false;

        int valueA = 0;
        int valueB = 0;
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] arr = new int[26];
        for (int i = 0; i < a.length(); i++) {
            int idx = a.charAt(i) - 'a';
            arr[idx] += 1;
        }
        for (int i = 0; i < b.length(); i++) {
            int idx = b.charAt(i) - 'a';
            arr[idx] -= 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}