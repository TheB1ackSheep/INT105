/*
 * Copyright (C) 2014 INT105
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package lab_4;

import lab_3.Customer;
import helper.*;
import java.util.Date;
import lab_2.Address;

/**
 *
 * @author INT105
 */
public class Transaction {
    private BankAccount[] accout;

    public Transaction() {
        accout = new BankAccount[10];        
        for(int i=0;i<accout.length;i++){
            if(i%2==0)
                accout[i] = new SavingAccount(new Customer(NameSupplier.getName(), NameSupplier.getSurname(), new Address().getAddres(), new String[]{""}, "", new Date()), Math.random()*15000);
            else
                accout[i] = new CurrentDepositAccount(new Customer(NameSupplier.getName(), NameSupplier.getSurname(), new Address().getAddres(), new String[]{""}, "", new Date()), Math.random()*15000);    
        }
    }

    @Override
    public String toString() {
        String tmp = "";
        for(BankAccount b : accout)
            tmp += b+"\n";
        return tmp;
    }
    
    
    
    
}
