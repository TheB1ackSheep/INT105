/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;

import java.util.Date;
import lab_1.Customer;

/**
 *
 * @author Student LAB
 */
public class BankAccount {
    private long accId;
    private double balance;
    private Date dateCreated;
    private Customer cust;
    private final static String ACCTPYE = "";
    public static long inc = 1000000001;

    public BankAccount() {
        this(0d,new Date(),new Customer());
    }

    public BankAccount(double balance, Date dateCreated, Customer cust) {
        this.balance = balance;
        this.dateCreated = dateCreated;
        this.cust = cust;
        this.accId = genAccountId();
    }
    
    public long genAccountId(){
        return inc++;
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

    public Customer getCust() {
        return cust;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }
    
    public String getAccType(){
        return ACCTPYE;
    }
    
    public void deposit(double amount){
        if(amount > 0)
            this.balance += amount;
    }
    
    public void withdraw(double amount){
        if(amount > 0 && amount <= this.balance)
            this.balance -= amount;
    }
    
    public void transfer(BankAccount target,double amount){
        if(amount > 0 && amount <= this.balance){
            target.balance += amount;
            this.balance -= amount;
        } 
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accId=" + accId + ", balance=" + balance + ", dateCreated=" + dateCreated + ", cust=" + cust + '}';
    }
    
    
    
    
    
    
}
