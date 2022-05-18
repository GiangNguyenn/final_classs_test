public class Palindrome {
    static void palindrome(String word) {
        int i, j = word.length()-1;
        for (i=0; i<j; i++) {
            if (word.charAt(j) != word.charAt(j)) {
                System.out.println("No");
                return;
            }
            j++;
        }
        System.out.println("Yes");
        return;
    }

    public static void main(String[] args) {
        String str1 = "12321";
        String str2 = "abba";
        String str3 = "123123";
        String str4 = "saippuakivikauppias";
        palindrome(str1);
        palindrome(str2);
        palindrome(str3);
        palindrome(str4);
    }
}