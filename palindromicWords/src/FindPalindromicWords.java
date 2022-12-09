import java.util.Scanner;

public class FindPalindromicWords {
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static boolean isPalindrome2(String str) {
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0 ; i--) {
            //reverse += str.charAt(i);
            reverse.append(str.charAt(i));
        }
        return str.equals(reverse.toString());
    }
    public static void main(String[] args) {
        //System.out.println(isPalindrome("abba"));
        //System.out.println(isPalindrome2("kayak"));
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a word : ");
        String word = input.nextLine();
        if (isPalindrome2(word)) {
            System.out.println("Your word is Palindromic");
        } else {
            System.out.println("Your word is not Palindromic");
        }

    }
}
