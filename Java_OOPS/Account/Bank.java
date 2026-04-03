package Git_Java.cdac_java_learning.Java_OOPS.Account;

public class Bank {
    public static void main(String[] args){
        Account acc = new Account(122334, "aaa", 60000);
        acc.calculateInterest();
        Account.displayInterestRate();
    }
}
