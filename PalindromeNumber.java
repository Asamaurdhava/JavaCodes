public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        boolean really = false;
        int reversed = 0; int remainder = 0;

        while (x != 0) {
            remainder = x % 10;
            reversed = reversed * 10 + remainder;
            x /= 10;
        }

        if (x == reversed) {
            really = true;
        }


        return really;
        
    }

    public static void main(String[] args){

        int number = 121;
        boolean result;

        result = isPalindrome(number);

        System.out.println(result);

    }
}
