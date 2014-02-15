/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3;

import helper.NameSupplier;
import java.util.Date;


/**
 *
 * @author Student LAB
 */
public class BankAccount {

    private long accId;
    private double balance;
    private Date dateCreated;
    private Customer cust;
    protected static String ACCTYPE = "";
    private static long ACCOUNT_ID = 1000000001;

    public BankAccount() {
        this(new Customer(NameSupplier.getName(), 
                NameSupplier.getSurname()));
    }

    public BankAccount(Customer cust) {
        this(cust, 100);
    }

    public BankAccount(Customer cust, double balance) {
        this.balance = balance;
        this.cust = cust;
        dateCreated = new Date();
        genAccountId();
    }

    private void genAccountId() {
        accId = ACCOUNT_ID++;
    }

    public long getAccId() {
        return accId;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }
    public void withdraw(double amount) {
        if (balance - amount >= 0)
            balance -= amount ;
    }
    
    public void deposit(double amount) {
        if (amount > 0)
            balance += amount ;
    }
    
    public void transfer(BankAccount target, double amount){
        if (balance - amount >= 0) {
            this.withdraw(amount);
            target.deposit(amount);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accId=" + accId + ", balance=" + balance + ", dateCreated=" + dateCreated + ", cust=" + cust + '}';
    }
}
