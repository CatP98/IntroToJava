import java.util.Arrays;

class AnagramChecker {
    public static void main(String[] args) {
        String[][] anagrams = {
            {"astronomer", "moon starer"},
            {"listen ", "silent"},
            {"the Morse Code", "here come dots"},
            {"the eyes", "they see"},
            {"hello", "from the other side"},
            {"C a t a r i n a", "Aniratac"}
        };

        for (String[] pair : anagrams) {
            String strOne = pair[0];
            String strTwo = pair[1];
            boolean anagramChecker = anagramChecker(strOne, strTwo);
            System.out.println("\"" + strOne + "\" and \"" + strTwo + "\" are anagrams: " + anagramChecker);
        }
    }

    public static boolean anagramChecker(String str1, String str2) {
        // Removing spaces and converting strings to lowercase
        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();

        // Convert strings to character arrays + sort them alphabetically
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if sorted arrays are equal, if charArray1 == charArray2, then RETURNS true, else, RETURNS false
        return Arrays.equals(charArray1, charArray2);
    }
}