public class helloWorld {
public static void main(String[] args) {
    System.out.println("Hello World!!!!");
    System.out.println(countDigit(1323232));
}
public static int countDigit(int n){
    int res=0;
    res=(int)Math.floor(Math.log10(n))+1;
    return res;
}
}