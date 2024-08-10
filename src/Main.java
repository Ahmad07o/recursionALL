public class Main {
    public static void main(String[] args) {
        // System.out.println(factorial(7));
        String s = "racecar";
        int length = s.length();
        /* if(isPalindrome(s,length)==1)
            System.out.println(s + " is palindrom");
         else
            System.out.println(s + " is not a palindrome");


        System.out.println(countDigit(220, 2));
        System.out.println(handShake(5));
        int x = 48;
        int y = 18;
        System.out.println("GCD of " + x + " and " + y + " is: " + GCD(x, y));
        System.out.println(power(2,5));*/
        String str = "Hello";
        int len = str.length();
        System.out.println("Reversed string: " + reverse(str, len));
    }

    public static int factorial(int num) {
        if (num == 1)
            return 1;
        else
            return num * factorial(num - 1);
    }

    public static int isPalindrome(String s, int len) {
        if (len <= 1) {
            return 1; // A string of length 1 or empty string is a palindrome
        } else if (s.charAt(0) != s.charAt(len - 1)) {
            return 0; // If the first and last characters don't match, it's not a palindrome
        } else {
            return isPalindrome(s.substring(1, len - 1), len - 2); // Check the remaining substring
        }
    }

    public static int countDigit(int n, int digit) {
        if (n == 0) {
            return 0;
        }
        int lastChar = n % 10;

        if (lastChar == digit) {
            return 1 + countDigit(n / 10, digit);
        } else
            return countDigit(n / 10, digit);


    }

    public static int handShake(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        else
            return n-1+handShake(n-1);
    }
    public static int GCD(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return GCD(y, x % y);
        }
    }
    public static int power(int base,int exponent)
    {
        if(exponent==0){
            return 1;
        }
        else{
            return base *power(base,exponent-1);
        }
    }

    public static String reverse(String s, int len) {
        if (len <= 1) {
            return s; // Base case: a string of length 0 or 1 is its own reverse
        } else {
            return s.charAt(len - 1) + reverse(s.substring(0, len - 1), len - 1);
        }
    }
}





