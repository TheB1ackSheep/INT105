/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_3;

import java.util.Date;

/**
 *
 * @author INT105
 */
public class Person {
    private String name;
    private String surname;
    private Date birthDate;

    public Person() {
        this("N/A");
    }

    public Person(String name) {
        this(name, "N/A");
    }

    public Person(String name, String surname) {
        this(name, surname, new Date(1980, 01, 01));
    }

    public Person(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
