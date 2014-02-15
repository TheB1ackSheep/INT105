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

package week_5;

import java.util.Iterator;
import helper.*;

/**
 *
 * @author INT105
 */
public class Employees implements Iterator<Employee>,Iterable<Employee>{
    private int index = -1;
    Employee[] e = new Employee[10];
    public Employees(){
        for(int i=0;i<e.length;i++){            
            e[i] = new Employee(NameSupplier.getName(), NameSupplier.getSurname(),NameSupplier.getPosition(), 
                    (int)(Math.random()*100000)+15000, (int)(Math.random()*5000)+2000);                   
                
        }
        
    }

    @Override
    public boolean hasNext() {
        return index<e.length-1;
    }

    @Override
    public Employee next() {
        return e[++index];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<Employee> iterator() {
        this.index = -1;
        return this;
    }
    
   
    
    
}
