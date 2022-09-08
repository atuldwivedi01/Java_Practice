import java.util.Arrays;

public class numberSystem{
    public static void main(String [] args){
        // System.out.println("checking");
        System.out.println("Number of Digit : "+countDigit(100));
        System.out.println("Factorial of a number : "+fact(14));
        System.out.println("Number of Digit in factorial of the number : "+noOfDigitInFact(14));
        System.out.println("Number of trailing zero in factorial of the number : "+noOfTrailingZeroesFact(14));
        System.out.println("GCD of the two number : "+gcd(15, 12));
        System.out.println("LCM of the two number : "+lcm(15, 12));
        System.out.println("Check If the Given Number is Prime  "+11 +" : "+isPrime(11));
        System.out.println("Check If the Given Number is Prime  "+11 +" : "+isPrimeE(11));
        System.out.println("Print Prime Factors : ");
        // primeFactor(24);
        primeFactorE(27);
        sieveOfEratoshenses(100);
        System.out.println("Computing Power : "+computePower(2,4));
    }
    public static int countDigit(long n){
        int res;
        res=(int)Math.log10(n)+1;
        return res;
    }
    public static long fact(int n){
        long res=1;
        for (int i=2;i<=n;i++){
            res=res*i;
        }
        return res;
    }
    public static long noOfDigitInFact(int n){
        return (countDigit(fact(n)));
    }
    public static int noOfTrailingZeroesFact(int n){
        int res=0;
        for (int i=5;i<=n;i=i*5){
            res+=Math.floor(n/i);
            System.out.println(res);
        }
        return res;
    }
    public static long gcd(int a, int b){
        if (b==0){
            return a;
        }
        else 
        return gcd(b,a%b);
    }
    public static long lcm(int a , int b){
        long res;
        res = (a*b)/gcd(a,b);
        return res;
    }
    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0)
            return false;
        }
        return true;
    }
    // Efficient Solution 3 times Faster than above. 
    public static boolean isPrimeE(int n){
        if(n==1){
            return false;
        }
        if (n==2 || n==3){
            return true;
        }
        if (n%2==0 || n%3==0){
            return false;
        }
        for (int i=5;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true; 
    }
    public static void primeFactor(int n){
        if (n<=1){
            System.out.println("No Prime Factors!");
        }
        for (int i=2;i*i<=n;i++){
            while (n%i==0){
                System.out.println(i);
                n/=i;
            }
        }
        if (n>1){
            System.out.println(n);
        }
    }
    public static void primeFactorE(int n){
        if (n<=1){
            System.out.println("No Prime Factors!");
        }
        while (n%2==0){
            System.out.println(2);
            n/=2;
        }
        while (n%3==0){
            System.out.println(3);
            n/=3;
        }
        for (int i=5;i*i<=n;i++){
            while(n%i==0){
                System.out.println(i);
                n/=i;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }
    public static void sieveOfEratoshenses(int n){
        if (n<=1){
            System.out.println("No Prime number less than "+ n);
            return;
        }
        else {
            boolean [] a=new boolean[n+1];
            
            Arrays.fill(a, true);
            for (int i=2;i*i<=n;i++){
                if( a[i]){
                    for (int j=i*i;j<=n;j=j+i){
                        a[j]=false;
                    }
                }
            }
            System.out.println("Prime number less than "+n);
            for (int i=2;i<=n;i++){
                if (a[i]){
                    System.out.println(i);
                }
            }
        }
    }
    public static long computePower(long x, long n){
        if (n==0){
            return 1;
        }
        long temp=computePower(x, n/2);
        temp=temp*temp;
        if(n%2==0)
            return temp;
        else 
            return temp*x;

    }
}