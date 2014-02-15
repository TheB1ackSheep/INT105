/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week_5;

import week_2.*;

/**
 *
 * @author Student LAB
 */
public class Employee implements Comparable<Employee> {
    private static int GENERATE_ID = 20001;
    private long empId;
    private String empName;
    private String empSurname;
    private String empPosition;
    private double empSalary;
    private double empBonus;

    public Employee() {
        this("no name","no surname","new employee", 0,0);
    }

    public Employee(String empName, String empSurname) {
        this(empName,empSurname,"new employee", 0,0);
    }

    public Employee(String empName, String empSurname, String empPosition) {
        this(empName,empSurname,empPosition, 0,0);
    }

    public Employee(String empName, String empSurname, String empPosition, double empSalary, double empBonus) {
        this.empName = empName;
        this.empSurname = empSurname;
        this.empPosition = empPosition;
        this.empSalary = empSalary;
        this.empBonus = empBonus;
        genEmployeeId();
    }
    
    private void genEmployeeId() {
        empId = GENERATE_ID++ ;
    }
    
    public long getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public double getEmpBonus() {
        return empBonus;
    }

    public void setEmpBonus(double empBonus) {
        this.empBonus = empBonus;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName=" + empName + ", empSurname=" + empSurname + ", empPosition=" + empPosition + ", empSalary=" + empSalary + ", empBonus=" + empBonus + '}';
    }

    

    @Override
    public int compareTo(Employee o) {
        return (int)(this.empId-o.empId);
    }
}
