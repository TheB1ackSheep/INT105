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
public class Manager extends Employee {
    private int bonus ;

    public Manager() {
        //super();
    }
    public Manager(int id, String name, int salary, int bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }
    

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() +"\nManager{" + "bonus=" + bonus + '}';
    }
}
