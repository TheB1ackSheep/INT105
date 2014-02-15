/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3;


import java.util.Date;
import lab_2.Address;

/**
 *
 * @author Student LAB
 */
public class Customer extends Person {

    private long custId;
    private Address custAdd;
    private String custPhone[];
    private String custEmail;
    private static long CUSTOMER_ID = 10001;
    public Customer() {
        this("no name", "no surname");
    }

    public Customer(String custName, String custSurname) {
        this(custName, custSurname, new Address(), new String[2], "no email", new Date());
    }

    public Customer(String custName, String custSurname, Address custAdd, String[] custPhone, String custEmail, Date custBirth) {
        super(custName, custSurname);
        this.custAdd = custAdd;
        this.custPhone = custPhone;
        this.custEmail = custEmail;
        genCustomerId();
    }

    private void genCustomerId() {
        this.custId = CUSTOMER_ID++ ;
    }

    public long getCustId() {
        return custId;
    }

    public String getCustName() {
        return super.getName();
    }

    public void setCustName(String custName) {
        super.setName(custName) ;
    }

    public String getCustSurname() {
        return super.getSurname();
    }

    public void setCustSurname(String custSurname) {
        super.setSurname(custSurname);
    }

    public String[] getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String[] custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustPhone(int index) {
        if (index < custPhone.length)
            return custPhone[index];
        else
            return null;
    }

    public void setCustPhone( int index, String phoneNo) {
        if (index>0 && index <custPhone.length)
            this.custPhone[index] = phoneNo;
    }
    
    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public Date getCustBirth() {
        return super.getBirthDate();
    }

    public void setCustBirth(Date custBirth) {
        super.setBirthDate(custBirth);
    }
    
    @Override
    public String toString() {
        return "Customer{" + "custId=" + custId + ", custName=" + 
                getCustName() + ", custSurname=" + getCustSurname() + 
                ", custPhone=" + getcustPhone() + ", custEmail=" + custEmail + '}';
    }

    public Address getCustAdd() {
        return custAdd;
    }

    public void setCustAdd(Address custAdd) {
        this.custAdd = custAdd;
    }

    private String getcustPhone() {
        StringBuilder phone = new StringBuilder();
        if (custPhone != null) {
            for(String s : custPhone)
                if (s !=null)  {
                    if (! s.isEmpty()) 
                        phone.append(", ");
                    phone.append(s);
                }
        }
        return phone.toString();
    }
    
}
