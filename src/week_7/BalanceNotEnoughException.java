/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_7;

/**
 *
 * @author INT105
 */
public class BalanceNotEnoughException extends Exception {

    public BalanceNotEnoughException() {
        super("Balance not enough !!!");
    }

    public BalanceNotEnoughException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "BalanceNotEnoughException : "+getMessage();
    }
    
    
    
}
