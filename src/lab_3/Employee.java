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
public class Employee {
    private int id ;
    private String name ;
    private int salary;

    public Employee() {
        this(999999, "Undefined", 15000);
    }

    public Employee(int id) {
        this(id, "Undefined", 15000);
    }

    public Employee(int id, String name) {
        this(id, name, 15000);
    }

    public Employee(int id, String name, int salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';
    }
}
