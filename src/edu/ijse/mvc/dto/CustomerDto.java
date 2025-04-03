/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author Duvindu Adithya
 */
public class CustomerDto {
    
    private String custId;
    private String custTitle;
    private String custName;
    private String dOB;
    private double salary;
    private String custAddress;
    private String city;
    private String province;
    private String postalCode;

    public CustomerDto() {
    }

    public CustomerDto(String custId, String custTitle, String custName, String dOB, double salary, String custAddress, String city, String province, String postalCode) {
        this.custId = custId;
        this.custTitle = custTitle;
        this.custName = custName;
        this.dOB = dOB;
        this.salary = salary;
        this.custAddress = custAddress;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustTitle() {
        return custTitle;
    }

    public void setCustTitle(String custTitle) {
        this.custTitle = custTitle;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "custId=" + custId + ", custTitle=" + custTitle + ", custName=" + custName + ", dOB=" + dOB + ", salary=" + salary + ", custAddress=" + custAddress + ", city=" + city + ", province=" + province + ", postalCode=" + postalCode + '}';
    }
    
  
    
}
