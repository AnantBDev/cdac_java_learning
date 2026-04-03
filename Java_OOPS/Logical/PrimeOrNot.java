package Git_Java.cdac_java_learning.Java_OOPS.Logical;

public class PrimeOrNot {
    private int n;
    public static String prime(int n){
        if (n<=1){
            return "Not Prime";
        }
        if (n>1){
            for(int i=2; i<n; i++){
                if (n%i==0){
                    return "Not Prime";
                }
            }
            return "Prime";
        }
        return "Not Prime";
    }
    public static void main(String[] args){
        System.out.println(prime(83));
        System.out.println(prime(24));
    }
}
