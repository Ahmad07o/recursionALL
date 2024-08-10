public class Main {
    public static void main(String[] args) {
        // System.out.println(factorial(7));
        String s="Madam";
        int length=s.length();
        if(isPalaindrome(s,length)==1)
            System.out.println(s + "is palindrom");
        else
            System.out.println(s + "is not a palindrome");
    }
    public static int factorial(int num)
    {
        if(num==1)
            return 1;
        else
            return num*factorial(num-1);
    }
    public static int isPalaindrome(String s,int len)
    {
        if(len==1)
        {
            return 1;
        }
        else if (s.charAt(0)!=s.charAt(len-1)) {
            return 0;
        }
        else
            return isPalaindrome(s.substring(1,len-1),len-2);
    };
}