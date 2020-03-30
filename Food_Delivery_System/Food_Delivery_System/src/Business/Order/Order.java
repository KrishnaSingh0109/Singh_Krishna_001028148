/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Restaurant.Item;
import java.util.HashMap;

/**
 *
 * @author krish
 */
public class Order {
    private HashMap<Item, Integer> itemList;
    private Item item;
    private int quantityOrdered;
    private double orderTotal;
    private String orderStatus;
    private String comments;
    
    public Order(){
        itemList = new HashMap<>();
        item = new Item();
    }

    public HashMap<Item, Integer> getItemList() {
        return itemList;
    }

    public void setItemList(HashMap<Item, Integer> itemList) {
        this.itemList = itemList;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

   
    
    
}
