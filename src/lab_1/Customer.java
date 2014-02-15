package lab_1;

import java.util.Arrays;
import java.util.Date;
import lab_2.Address;

/**
 * Created with IntelliJ IDEA.
 * User: Falook G.
 * Date: 1/11/14
 * Time: 10:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Customer {
    public static long inc = 10000;
    private long custId;
    private String custName;
    private Address custAdd;
    private String[] custPhone;
    private String custEmail;
    private Date custtBirth;

    public Customer(){
        this("",new Address(),new String[]{},"",new Date());
    }
    public Customer(String name,Address add,String[] phone,String email,Date birth){
        if( name.trim().length() >0)
            this.custName = name;
        if(add != null)
            this.custAdd = add;
        if(phone.length > 0)
            this.custPhone = phone;
        if(email.trim().length() > 0)
            this.custEmail = email;
        this.custtBirth = birth;
        this.custId = genCustomerId();
    }
    public long genCustomerId(){
        return ++Customer.inc;
    }

    public long getCustId() {
        return custId;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public Address getCustAdd() {
        return custAdd;
    }
    public void setCustAdd(Address custAdd) {
        this.custAdd = custAdd;
    }
    public String[] getCustPhone() {
        return custPhone;
    }
    public void setCustPhone(String[] custPhone) {
        this.custPhone = custPhone;
    }
    public String getCustEmail() {
        return custEmail;
    }
    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }
    public Date getCusttBirth() {
        return custtBirth;
    }
    public void setCusttBirth(Date custtBirth) {
        this.custtBirth = custtBirth;
    }

    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custAdd='" + custAdd + '\'' +
                ", custPhone=" + Arrays.toString(custPhone) +
                ", custEmail='" + custEmail + '\'' +
                ", custtBirth=" + custtBirth +
                '}';
    }
}
