/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week_2;

/**
 *
 * @author Student LAB
 */                      
public class TestEmployee {
     private static int NO_OF_EMP = 10;
    public static void main(String[] args) {
        Employee[] emps = new Employee[NO_OF_EMP];
        for(int i=0; i<NO_OF_EMP; i++) {
            emps[i] = new Employee();
            emps[i].setEmpName(helper.NameSupplier.getName());
            emps[i].setEmpSurname(helper.NameSupplier.getSurname());
            emps[i].setEmpPosition(helper.NameSupplier.getPosition());
            emps[i].setEmpSalary((int) ((Math.random()+1) *15000));
            emps[i].setEmpBonus(emps[i].getEmpSalary()* (Math.random()+1));
        }
        
        for(Employee e : emps) {
            System.out.println(e);
        }
    }
}
