package Strings;

public class validAnagramFreq {
    public static void main(String[] args) {
        String s = "rat", t = "car";
        s = s.toLowerCase();
        t = t.toLowerCase();

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < freq.length; i++) {
            System.out.print(freq[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < s.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < freq.length; i++) {
            System.out.print(freq[i] + " ");
        }

        // Use for-each loop
    }
}
