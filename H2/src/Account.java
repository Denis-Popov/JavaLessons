import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

public class Account {
    private final long id;
    private final TransactionManager transactionManager;
    private final Entries entries;

    public Account(long id, TransactionManager transactionManager) {
        this.id = id;
        this.transactionManager = transactionManager;
        this.entries = new Entries();
    }

    /**
     * Withdraws money from account. <b>Should use TransactionManager to manage transactions</b>
     *
     * @param amount amount of money to withdraw
     * @return true
     * if amount &gt 0 and (currentBalance - amount) &ge 0,
     * otherwise returns false
     */
    public boolean withdraw(double amount, Account beneficiary) {
        // write your code here
    }

    /**
     * Withdraws cash money from account. <b>Should use TransactionManager to manage transactions</b>
     *
     * @param amount amount of money to withdraw
     * @return true
     * if amount &gt 0 and (currentBalance - amount) &ge 0,
     * otherwise returns false
     */
    public boolean withdrawCash(double amount) {
        // write your code here
    }

    /**
     * Adds cash money to account. <b>Should use TransactionManager to manage transactions</b>
     *
     * @param amount amount of money to add
     * @return true
     * if amount &gt 0,
     * otherwise returns false
     */
    public boolean addCash(double amount) {
        // write your code here
    }

    /**
     * Adds money to account. <b>Should use TransactionManager to manage transactions</b>
     *
     * @param amount amount of money to add
     * @return true
     * if amount &gt 0,
     * otherwise returns false
     */
    public boolean add(double amount) {
        // write your code here
    }




    public Collection<Entry> history(LocalDate from, LocalDate to) {
        // write your code here
    }

    /**
     * Calculates balance on the accounting entries basis
     * @param date
     * @return balance
     */
    public double balanceOn(LocalDateTime date) {
        // write your code here
    }

    /**
     * Finds the last transaction of the account and rollbacks it
     */
    public void rollbackLastTransaction() {
        // write your code here
    }
}

/**
 * The record of allocating the amount to the account
 * Amount can be either positive or negative depending on originator or beneficiary
 */
public class Entry {
    private final Account account;
    private final Transaction transaction;
    private final double amount;
    private final LocalDateTime time;
}

/**
 * Collection of entries for the account. Use it to save and get history of payments
 */
public class Entries {
    void addEntry(Entry entry) {
        // write your code here
    }

    Collection<Entry> from(LocalDate date) {
        // write your code here
    }

    Collection<Entry> betweenDates(LocalDate from, LocalDate to) {
        // write your code here
    }

    Entry last() {
        // write your code here
    }
}

public class Transaction {
    private final long id;
    private final double amount;
    private final Account originator;
    private final Account beneficiary;
    private final boolean executed;
    private final boolean rolledBack;

    /**
     * Adding entries to both accounts
     * @throws IllegalStateException when was already executed
     */
    public Transaction execute() {
        // write your code here
    }

    /**
     * Removes all entries of current transaction from originator and beneficiary
     * @throws IllegalStateException when was already rolled back
     */
    public Transaction rollback() {
        // write your code here
    }
}


/**
 * Manages all transactions within the application
 */
public class TransactionManager {
    /**
     * Creates and stores transactions
     * @param amount
     * @param originator
     * @param beneficiary
     * @return created Transaction
     */
    public Transaction createTransaction(double amount,
                                         Account originator,
                                         Account beneficiary) {
        // write your code here
    }

    public Collection<Transaction> findAllTransactionsByAccount(Account account) {
        // write your code here
    }


    public void rollbackTransaction(Transaction transaction) {
        // write your code here
    }

    public void executeTransaction(Transaction transaction) {
        // write your code here
    }
}

public class AnalyticsManager {
    private final TransactionManager transactionManager;

    public AnalyticsManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public Account mostFrequentBeneficiaryOfAccount(Account account) {
        // определить самые частые операции в аккаунте
        
    }

    public Collection<Transaction> topTenExpensivePurchases(Account account) {
        //сортировка


        //вывод самых дорогих операций
    }
}
