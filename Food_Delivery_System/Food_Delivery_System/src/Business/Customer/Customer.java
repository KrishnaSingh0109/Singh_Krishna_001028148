/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
    private String custName;
    private String custAddress;
    private Long custPhoneNumber; 
    private UserAccount userAccount;
    private ArrayList<Order> orderList;
   
    public Customer(){
        userAccount = new UserAccount();
        orderList = new ArrayList<>();
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public Long getCustPhoneNumber() {
        return custPhoneNumber;
    }

    public void setCustPhoneNumber(Long custPhoneNumber) {
        this.custPhoneNumber = custPhoneNumber;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    
    
    
    @Override
    public String toString(){
        return custName;
    }
}
