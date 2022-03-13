package epamqa.palindrome;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("-121: " + isPalindromeInt(-121));
        System.out.println("121: " + isPalindromeInt(121));
        System.out.println("5: " + isPalindromeInt(5));
    }


    public static boolean isPalindromeInt(int x) {
        int original = x;
        int reverse = 0;
        for (int i = 0; i <= x; i++) {
            int remain = x % 10;
            x = x / 10;
            reverse = reverse * 10 + remain;
        }
        return reverse == original;
    }
}
