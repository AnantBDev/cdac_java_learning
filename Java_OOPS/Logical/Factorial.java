package Git_Java.cdac_java_learning.Java_OOPS.Logical;

public class Factorial{
    private int n;
    private int fact;
    private double temp;
    public static int factorial(int n){
        int fact = 1;
        if (n==0){
            return 0;
        }
        if (n>=1){
            for (int i=1; i<=n; i++){
                fact = fact * i;
            }
            return fact;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        System.out.println(factorial(5));
    }
}
