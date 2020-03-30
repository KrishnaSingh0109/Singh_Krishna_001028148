/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Order.Order;
import Business.Restaurant.Restaurant;

/**
 *
 * @author krish
 */
public class OrderWorkRequest extends WorkRequest{
    private int orderQuantity;
    private Order order;
    private DeliveryMan deliveryManName;
    private Customer customer;
    private Restaurant restaurant;
    
    
    public OrderWorkRequest(){
        order = new Order();
        deliveryManName = new DeliveryMan();
        customer = new Customer();
        restaurant = new Restaurant();
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    
    
    

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    
    

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public DeliveryMan getDeliveryManName() {
        return deliveryManName;
    }

    public void setDeliveryManName(DeliveryMan deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    @Override
    public String toString(){
        return Integer.toString(orderQuantity);
    }
    
    
    
    
}
