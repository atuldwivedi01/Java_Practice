public class recursion {
    public static void main(String [] args){
        System.out.println("Sum of n natural number : "+getSum(100));
        System.err.println("Check if the given string is palindrome or not : "+isPalindrome("abababa", 0, "abababa".length()-1));
        System.out.println("Sum of the digits of a number : "+sumDigits(1044));
    }
    public static int getSum(int n){
        if (n==0)
            return 0;
        return getSum(n-1)+n;
    }
    public static boolean isPalindrome(String str, int start, int end){
        if (start>=end)
            return true;
        return (str.charAt(start)==str.charAt(end)&& isPalindrome(str, start+1, end-1));
    }
    public static int sumDigits(int n){
        if (n<10)
            return n;
        return sumDigits(n/10)+n%10;
    }
}
