/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pediatric;

import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Collections.list;
import java.util.Date;

/**
 *
 * @author krish
 */
public class Patient {
    
     /*private int age;
     private int respiratoryRate;
     private int heartRate;
     private int systolicBloodPressure;
     private double weightInKilos;
     private double weightInPounds;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(int systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public double getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(double weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }
    */
    
//     public boolean isPatientNormal(int age, int respiratoryRate, int heartRate, int systolicBloodPressure, double weightInKilos, double weightInPounds){
//     
//         boolean isPatientNormal = true;
//         if(age<30){
//            
//            if( (respiratoryRate>=30 &&respiratoryRate<=50)&& (heartRate>=120&&heartRate<=160)&& (systolicBloodPressure>=50&&systolicBloodPressure<=70)&& (weightInKilos>=2&&weightInKilos<=3)&&(weightInPounds>=4.5&&weightInPounds<=7) ){
//               
//            }else{
//                isPatientNormal= false;
//            }
//            
//        }else if(age>=30&&age<360){
//                     
//            if( (respiratoryRate>=20 &&respiratoryRate<=30)&& (heartRate>=80&&heartRate<=140)&& (systolicBloodPressure>=70&&systolicBloodPressure<=100)&& (weightInKilos>=4&&weightInKilos<=10)&&(weightInPounds>=9&&weightInPounds<=22) ){
//                
//            }else{
//                isPatientNormal = false;
//            }
//           
//        }else if(age>=360&&age<1080){
//                        
//            if( (respiratoryRate>=20 &&respiratoryRate<=30)&& (heartRate>=80&&heartRate<=130)&& (systolicBloodPressure>=80&&systolicBloodPressure<=110)&& (weightInKilos>=10&&weightInKilos<=14)&&(weightInPounds>=22&&weightInPounds<=31) ){
//                
//            }else{
//                isPatientNormal = false;
//            }
//        
//        }else if(age>=1080&&age<2160){
//                        
//            if( (respiratoryRate>=20 &&respiratoryRate<=30)&& (heartRate>=80&&heartRate<=120)&& (systolicBloodPressure>=80&&systolicBloodPressure<=110)&& (weightInKilos>=14&&weightInKilos<=18)&&(weightInPounds>=31&&weightInPounds<=40) ){
//                
//            }else{
//                isPatientNormal = false;
//            }
//        
//        }else if(age>=2160&&age<4680){
//                        
//            if( (respiratoryRate>=20 &&respiratoryRate<=30)&& (heartRate>=70&&heartRate<=110)&& (systolicBloodPressure>=80&&systolicBloodPressure<=120)&& (weightInKilos>=20&&weightInKilos<=42)&&(weightInPounds>=41&&weightInPounds<=92) ){
//                
//            }else{
//                isPatientNormal = false;
//            }
//        
//        }else if(age>=4680){
//                        
//            if( (respiratoryRate>=12 &&respiratoryRate<=20)&& (heartRate>=55&&heartRate<=105)&& (systolicBloodPressure>=110&&systolicBloodPressure<=120)&& (weightInKilos>50)&&(weightInPounds>110) ){
//                
//            }else{
//                isPatientNormal = false;
//            }
//        
//        }
//         
//         return isPatientNormal;
//    
//     }
     
     public boolean isPatientNormal(int ageInMonths, int respiratoryRate, int heartRate, int systolicBloodPressure, double weightInKilos, double weightInPounds){
     boolean isPatientNormal = true;
         if(ageInMonths<1){
            
            if( (respiratoryRate>=30 &&respiratoryRate<=50)&& (heartRate>=120&&heartRate<=160)&& (systolicBloodPressure>=50&&systolicBloodPressure<=70)&& (weightInKilos>=2&&weightInKilos<=3)&&(weightInPounds>=4.5&&weightInPounds<=7) ){
               
            }else{
                isPatientNormal= false;
            }
            
        }else if(ageInMonths<12){
                     
            if( (respiratoryRate>=20 &&respiratoryRate<=30)&& (heartRate>=80&&heartRate<=140)&& (systolicBloodPressure>=70&&systolicBloodPressure<=100)&& (weightInKilos>=4&&weightInKilos<=10)&&(weightInPounds>=9&&weightInPounds<=22) ){
                
            }else{
                isPatientNormal = false;
            }
           
        }else if(ageInMonths<36){
                        
            if( (respiratoryRate>=20 &&respiratoryRate<=30)&& (heartRate>=80&&heartRate<=130)&& (systolicBloodPressure>=80&&systolicBloodPressure<=110)&& (weightInKilos>=10&&weightInKilos<=14)&&(weightInPounds>=22&&weightInPounds<=31) ){
                
            }else{
                isPatientNormal = false;
            }
        
        }else if(ageInMonths<72){
                        
            if( (respiratoryRate>=20 &&respiratoryRate<=30)&& (heartRate>=80&&heartRate<=120)&& (systolicBloodPressure>=80&&systolicBloodPressure<=110)&& (weightInKilos>=14&&weightInKilos<=18)&&(weightInPounds>=31&&weightInPounds<=40) ){
                
            }else{
                isPatientNormal = false;
            }
        
        }else if(ageInMonths<166){
                        
            if( (respiratoryRate>=20 &&respiratoryRate<=30)&& (heartRate>=70&&heartRate<=110)&& (systolicBloodPressure>=80&&systolicBloodPressure<=120)&& (weightInKilos>=20&&weightInKilos<=42)&&(weightInPounds>=41&&weightInPounds<=92) ){
                
            }else{
                isPatientNormal = false;
            }
        
        }else if(ageInMonths>=166){
                        
            if( (respiratoryRate>=12 &&respiratoryRate<=20)&& (heartRate>=55&&heartRate<=105)&& (systolicBloodPressure>=110&&systolicBloodPressure<=120)&& (weightInKilos>50)&&(weightInPounds>110) ){
                
            }else{
                isPatientNormal = false;
            }
        
        }
         
         return isPatientNormal;
     }
     }
