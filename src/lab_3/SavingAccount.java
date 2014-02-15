/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3;

/**
 *
 * @author INT105
 */
public class SavingAccount extends BankAccount {
    private double interestRate = 2.25;
    private final static double TRANSFER_FEE = 20;
    static {
        ACCTYPE = "Saving";
    }

    public SavingAccount() {
    }

    public SavingAccount(Customer cust, double balance) {
        super(cust, balance);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    public static String getAccType() {
        return ACCTYPE ;
    }

    public void addInterest() {
        deposit(interestRate*getBalance());
    }

    @Override
    public void transfer(BankAccount target, double amount) {
        double fee = 0;
        if (target instanceof CurrentDepositAccount ) {
            CurrentDepositAccount cda = (CurrentDepositAccount) target ;
            if ( cda.getLinkSavingsAccount() == this.getAccId())
                fee = TRANSFER_FEE ;
        }
        super.transfer(target, amount+fee);
    }
    
}
