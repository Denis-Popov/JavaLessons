package HomeWork;
import java.util.Scanner;

public class Customer {
    private String name;
    private String lastName;
    private Account account;

    public Customer(String name, String lastName) {

        Scanner nm = new Scanner(System.in);
        System.out.println("Введите имя Клиента: ");
        this.name = nm.next();

        System.out.println("Введите фамилию Клиента: ");
        this.lastName = nm.next();

        if (openAccount(account.id, name, lastName)) {
            System.out.println("Клиенту " + fullName(name, lastName) + " создан аккаунт!");
        }else {
            System.out.println("У клиента " + fullName(name, lastName) + " уже есть открытый аккаунт.");
        }

        if (closeAccount(name,lastName, account.id)){
            System.out.println("Клиенту " + fullName(name, lastName) + " закрыт аккаунт");
        }else {
            System.out.println("У клиента " + fullName(name, lastName) + " нет открытых аккаунтов.");
        }
    }

    /**
     * Opens account for a customer (creates Account and sets it to field "account").
     * Customer can't have greater than one opened account.
     *
     * @param accountId id of the account
     * @return true if account hasn't already created, otherwise returns false and prints "Customer fullName() already has the active account"
     */
    public boolean openAccount(long accountId) {
        if (accountId>1) {
            return false;
        }else{
            accountId += 1;
            return true;
        }
    }

    /**
     * Closes account. Sets account to null.
     *
     * @return false if account is already null and prints "Customer fullName() has no active account to close", otherwise sets account to null and returns true
     */
    public boolean closeAccount(long accountId) {
        // write your code here
        if (accountId==0){
            return false;
        }else{
            return true;
        }

    /**
     * Formatted full name of the customer
     * @return concatenated form of name and lastName, e.g. "John Goodman"
     */

    public String fullName() {
        if (name != null && lastName != null) {
            return name + " " + lastName;
        }
    }



    /**
     * Delegates withdraw to Account class
     * @param amount
     * @return false if account is null and prints "Customer fullName() has no active account", otherwise returns the result of Account's withdraw method
     */
    public boolean withdrawFromCurrentAccount(double amount) {
        // write your code here
    }

    /**
     * Delegates adding money to Account class
     * @param amount
     * @return false if account is null and prints "Customer fullName() has no active account", otherwise returns the result of Account's add method
     */
    public boolean addMoneyToCurrentAccount(double amount) {
        // write your code here
    }
}

public class Account {
    private final long id;
    private double balance;

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
    public boolean withdraw(double amount) {
        if(balance - amount >= 0) {
            balance -= amount;
            return true;
        }else{
            return false;
        }
    }

    /**
     * Adds money to account balance
     *
     * @param amount amount of money to add on account
     * @return true if amount &gt 0, otherwise returns false
     */
    public boolean add(double amount) {
        // write your code here
        balance+=amount;
        return true;
    }
}

