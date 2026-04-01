package Git_Java.cdac_java_learning.Java_OOPS.Logical;

public class Math {
    private int n1;
    private int n2;
    private static float result;

    public static float add(int n1, int n2){
        result = n1 + n2;
        return result;
    }
    public static float mul(int n1, int n2){
        return n1 * n2;
    }
    public static float div(int n1, int n2){
        return n1 / n2;
    }
    public static float sub(int n1, int n2){
        return n1 - n2;
    }
    public static void main(String[] args){     // Main function will be called first 
        System.out.println(add(10, 20));
        System.out.println(sub(10, 20));
        System.out.println(div(20, 10));
        System.out.println(mul(10, 20));
    }
}
