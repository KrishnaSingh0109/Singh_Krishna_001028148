/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.Order;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String RestaurentName;
    private String RestaurentManager;
    private Long PhoneNumber;
    private String Address;
    private UserAccount userAccount;
    private ArrayList<Item> itemList;
    private ArrayList<Order> orderList;
    
    public Restaurant(){
        userAccount = new UserAccount();
        itemList = new ArrayList<>();
        orderList = new ArrayList<>();
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getRestaurentName() {
        return RestaurentName;
    }

    public void setRestaurentName(String RestaurentName) {
        this.RestaurentName = RestaurentName;
    }

    public String getRestaurentManager() {
        return RestaurentManager;
    }

    public void setRestaurentManager(String RestaurentManager) {
        this.RestaurentManager = RestaurentManager;
    }

    public Long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(Long PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    
    
    public void createMenu(String itemName, double itemPrice, int totalQuantity){
       Item i = new Item();
       i.setItemName(itemName);
       i.setItemPrice(itemPrice);
       i.setTotalQuantity(totalQuantity);
       
       itemList.add(i);
    }
    
    @Override
    public String toString(){
        return RestaurentName;
    }
} 
