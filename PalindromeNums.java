public class PalindromeNums {

    public static boolean isPalindrome(int x) {

       // Handle negative numbers and numbers ending with 0 (except 0 itself)
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            reversed = (reversed * 10) + (x % 10);
            x /= 10;
        }

        // Check if the number is palindrome
        return x == reversed || x == reversed / 10;
                
    }

    public static void main(String[] args){

        int number = 121;

        boolean result = isPalindrome(number);

        System.out.println(result);

    }
    
}
