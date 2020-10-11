package HomeWork;

import java.util.Scanner;

public class Account {
    public long id;
    private static double balance;

    public Account(long id) {
        this.id = id;
    }

    /**
     * Withdraws money from account balance
     *
     * @param amount amount of money to withdraw
     * @return true
     * if amount &gt 0 and (balance - amount) &gt 0,
     * otherwise returns false
     */
    public static boolean withdraw(double amount) {
        if(balance - amount >= 0 && amount != 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    /**
     * Adds money to account balance
     *
     * @param amount amount of money to add on account
     * @return true if amount &gt 0, otherwise returns false
     */
    public static boolean add(double amount) {
        // write your code here
        if (amount!=0) {
            balance += amount;
            return true;
        }
        return false;
    }
}

