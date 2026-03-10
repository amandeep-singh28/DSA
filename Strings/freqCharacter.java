package Strings;

public class freqCharacter {
    public static void main(String[] args) {
        String str = "Amandeep";
        str = str.toLowerCase();

        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        for (int i = 0; i < freq.length; i++) {
            System.out.print(freq[i] + " ");
        }
    }
}
