/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;

import helper.*;

/**
 *
 * @author Student LAB
 */
public class Address {
    private String houseNo;
    private String soi;
    private String road;
    private String district;
    private String province;
    private int zipCode;

    public Address getAddres(){
        this.houseNo = AddressSupplier.getNo();
        this.soi = AddressSupplier.getSoi();
        this.road = AddressSupplier.getRoad();
        this.district = AddressSupplier.getDistrict();
        this.province = AddressSupplier.getProvince();
        this.zipCode = AddressSupplier.getZipCode();
        return this;
    }
    
    public Address() {
        this("","","","","",0);
    }

    public Address(String houseNo, String soi, String road, String district, String province, int zipCode) {
        this.houseNo = houseNo;
        this.soi = soi;
        this.road = road;
        this.district = district;
        this.province = province;
        this.zipCode = zipCode;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public String getSoi() {
        return soi;
    }

    public String getRoad() {
        return road;
    }

    public String getDistrict() {
        return district;
    }

    public String getProvince() {
        return province;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public void setSoi(String soi) {
        this.soi = soi;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" + "houseNo=" + houseNo + ", soi=" + soi + ", road=" + road + ", district=" + district + ", province=" + province + ", zipCode=" + zipCode + '}';
    } 
    
    
}
