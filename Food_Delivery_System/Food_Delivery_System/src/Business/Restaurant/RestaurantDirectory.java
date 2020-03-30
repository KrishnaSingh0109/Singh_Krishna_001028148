/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurentList;

    public RestaurantDirectory() {
        restaurentList = new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getRestaurentList() {
        return restaurentList;
    }

    public void setRestaurentList(ArrayList<Restaurant> restaurentList) {
        this.restaurentList = restaurentList;
    }
    
    public Restaurant createRestaurant(String name,String nameManager, String address, Long phoneNumber, UserAccount userAccount){
        Restaurant r = new Restaurant();
        r.setRestaurentName(name);
        r.setRestaurentManager(nameManager);
        r.setAddress(address);
        r.setPhoneNumber(phoneNumber);
        r.setUserAccount(userAccount);
        restaurentList.add(r);  
        return r;
    }
    
    
}
