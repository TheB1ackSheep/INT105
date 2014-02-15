/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_4;

import lab_3.*;

/**
 *
 * @author INT105
 */
public class CurrentDepositAccount extends BankAccount {
    
    private long linkSavingsAccount;
    static {
        ACCTYPE = "Current Deposit Account";
    }

    public CurrentDepositAccount() {
    }

    public CurrentDepositAccount(Customer cust) {
        super(cust);
    }

    public CurrentDepositAccount(Customer cust, double balance) {
        this(cust, balance, 0);
    }

    public CurrentDepositAccount(Customer cust, double balance, long linkSavingsAccount) {
        super(cust, balance);
        this.linkSavingsAccount = linkSavingsAccount;
    }

    public static String getACCTYPE() {
        return ACCTYPE;
    }

    public long getLinkSavingsAccount() {
        return linkSavingsAccount;
    }

    public void setLinkSavingsAccount(long linkSavingsAccount) {
        this.linkSavingsAccount = linkSavingsAccount;
    }
    
}
