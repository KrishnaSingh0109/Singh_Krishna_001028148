/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.Order;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String deliveryManName;    
    private UserAccount userAccount;
    private Order order;
    
    
    public DeliveryMan(){
        userAccount = new UserAccount();
        order = new Order();
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    
    public String getDeliveryManName() {
        return deliveryManName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    
    
    
    @Override
    public String toString(){
        return deliveryManName;
    }
}
