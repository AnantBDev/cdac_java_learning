package com.day8.module.Assignment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Account implements Serializable {

    private static final long SerialVersionID = 1L;
    private int accid;
    private String name;
    private double balance;

    public Account(int accid, String name, double balance) {
        this.accid = accid;
        this.name = name;
        this.balance = balance;
    }

    public int getAccid() {
        return accid;
    }

    public void setAccid(int accid) {
        this.accid = accid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accid=" + accid +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void WriteStream(File f,double balance){
        try ( DataOutputStream dout =
                      new DataOutputStream(new FileOutputStream(f)) ) {

            dout.writeDouble(balance);
        }

        // Catch block to handle the exceptions
        catch (IOException ex) {

            // Display message when FileNotFoundException occurs
            System.out.println(ex);
        }


    }


    public static void main(String[] args) {
        File f = new File("account.txt");
        List<Account> accounts = new ArrayList<Account>();
        accounts.add(new Account(445, "aaa", 8000));
        accounts.add(new Account(123, "ss", 7000));
        accounts.add(new Account(334, "PP", 5000));
        accounts.add(new Account(678, "bbb", 9000));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f))) {
            for (Account account : accounts) {
                out.writeObject(account);
            }
            out.flush();
        } catch (IOException e) {
            System.out.println(e);
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f))) {
            File f1 = new File("account_balance.txt");
            while (true) {
                try {
                    Account account = (Account) in.readObject();
                    System.out.println(account.getBalance());
                    WriteStream(f1, account.getBalance());

                } catch (EOFException e) {
                    break;
                }

            }
        } catch (ClassNotFoundException | IOException e) {
            System.out.println(e);
        }

    }
}