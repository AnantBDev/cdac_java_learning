package Git_Java.cdac_java_learning.Java_OOPS.Account;

public class Account {
    private int accid;
    private String name;
    private double balance;
    private static float intrate;
    
    static{
        intrate = 7.5f;     // JUST FOR PURPOSE (OPTIONAL), HOW TO DECLARE STATIC VARIABLE
    }

    // CONSTRUCTOR
    public Account(int accid, String name, double balance){
        this.accid = accid;
        this.name = name;
        this.balance = balance;
    }
    
    public void calculateInterest(){
        double interest = (balance * intrate * 0.4) / 100;
        System.out.println("Interest earned: " + interest);
    }

    public static void displayInterestRate(){
        System.out.println("Current Rate of Interest for: " + intrate);
    }

    public String toString(){
        return "Interest rate : " + intrate;
    }
}