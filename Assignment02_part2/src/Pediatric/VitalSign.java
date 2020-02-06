/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pediatric;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author krish
 */
public class VitalSign extends Patient{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        VitalSign vitalSign = new VitalSign();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter number of patients you want to add.\n");
        int n= sc.nextInt();
    
        ArrayList<Patient> patientList = new ArrayList<Patient>();
        for(int i=0; i<n;i++){
            Patient patient = new Patient();
            Scanner myscanner = new Scanner(System.in);
            System.out.println("\nPlease Enter Your Name.\n");
            patient.setName(myscanner.nextLine());
            System.out.println("\nPlease Enter Your Date of Birth in YYYY-MM-DD Format.\n");
            String dob = myscanner.nextLine();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date;
            Calendar calendar = Calendar.getInstance();
            try{
                date = simpleDateFormat.parse(dob);
                calendar.setTime(date); 
            }catch(ParseException p){
                System.out.println(dob +" is not in YYYY-MM-DD Fromat");
            }

            int years = calendar.get(Calendar.YEAR);
            int months = calendar.get(Calendar.MONTH);            
            int days = calendar.get(Calendar.DATE);
            months +=1;
            LocalDate localDate1 = LocalDate.of(years,Month.of(months),days);
            LocalDate now = LocalDate.now();

            Period period = Period.between(localDate1, now);
            years = period.getYears();
            months = period.getMonths();
            days = period.getDays();

            int ageInMonths = (years*12)+months;
            patient.setAge(ageInMonths);


            System.out.println("\nPlease Enter Your Respiratory Rate...\n");

            patient.setRespiratoryRate(myscanner.nextInt());

            System.out.println("\nPlease Enter Heart Rate...\n");

            patient.setHeartRate(myscanner.nextInt());

            System.out.println("\nPlease Enter Systolic Blood Pressure...\n");

            patient.setSystolicBloodPressure(myscanner.nextInt());

            System.out.println("\nPlease Enter Weight In Kilos...\n");

            patient.setWeightInKilos(myscanner.nextDouble());

            System.out.println("\nPlease Enter Weight In Pounds...\n");

            patient.setWeightInPounds(myscanner.nextDouble());
            patientList.add(patient);
            //vitalSignHistory.setPatient(patient);
        }
        printPatient(patientList);
        Scanner myscanner = new Scanner(System.in);
//        System.out.println("\nPlease Enter Patient's Name to check vital signs for.\n");
//        String searchName = myscanner.nextLine();
//        ArrayList<Patient> searchedPatientsLists = searchPatients(patientList, searchName);
//        
//        System.out.println("\nPlease Enter Which of These Vistal Sign you want to check.\n");
//        System.out.println("-Respiratory Rate");
//        System.out.println("-Heart Rate");
//        System.out.println("-Systolic Blood Rate");
//        System.out.println("-check Weight in Kilos");
//        System.out.println("-check Weight in Pounds\n");
//        String vsign = myscanner.nextLine(); 
//        String newSign = searchedVitalString(vsign);
//        boolean isNormal = isThisVitalSignNormal(newSign, searchedPatientsLists);
//        System.out.println("\nPatient "+searchName+"'s "+newSign+" is Normal : "+isNormal);
         
        
    }
    
    public static String searchedVitalString(String vsign){
        String newStr="";
        if(vsign.contains("respirtory")){
            newStr += "Repiratory Rate";
        }else if(vsign.contains("heart")){
            newStr += "Heart Rate";
        }else if(vsign.contains("systolic")||vsign.contains("blood")||vsign.contains("pressure")){
            newStr += "Systolic Blood Pressure";
        }else if(vsign.contains("kilo")){
            newStr += "Weight in Kilos";
        }else if(vsign.contains("pound")){
            newStr += "Weight in Pounds";
        }
        return newStr;
    }
    
    public static ArrayList<Patient> searchPatients(ArrayList<Patient> patientsList, String name) {
        
        ArrayList<Patient> searchedPatientsLists = new ArrayList<Patient>();
        
        for(Patient p : patientsList){
            if(p.getName().toLowerCase().equals(name.toLowerCase())){
                searchedPatientsLists.add(p);
            }
        }
        printPatient(searchedPatientsLists);
        
        return searchedPatientsLists;
    }
    
     
    private static void printPatient(ArrayList<Patient> patientsList){
        for(Patient p : patientsList){
            
                System.out.println("-----------------------------Patient "+p.getName()+" History-----------------------------\n");
                
                System.out.println("Name  ::  " +p.getName());
                System.out.println("Age  ::  " +p.getAge());
                System.out.println("Respiratory Rate  ::  " +p.getRespiratoryRate());
                System.out.println("Heart Rate  ::  " +p.getHeartRate());
                System.out.println("Systolic Blood Pressure  ::  " +p.getSystolicBloodPressure());
                System.out.println("Wieght in Kgs  ::  " +p.getWeightInKilos());
                System.out.println("Weight in Pounds  ::  " +p.getWeightInPounds());
            
        }
    }
    
    private static boolean isThisVitalSignNormal(String vsign, ArrayList<Patient> searchedPatientsLists){
        vsign=vsign.toLowerCase();
        boolean isNormal = true;
        Patient p;
        p = searchedPatientsLists.get(searchedPatientsLists.size()-1);
        if(p.getAge()<1){
                
                if(vsign.contains("respirtory")){
                    if(p.getRespiratoryRate()>=30 &&p.getRespiratoryRate()<=50){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("heart")){
                    if(p.getHeartRate()>=120&&p.getHeartRate()<=160){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("blood")){
                    if(p.getSystolicBloodPressure()>=50&&p.getSystolicBloodPressure()<=70){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("kilo")){
                    if(p.getWeightInKilos()>=2&&p.getWeightInKilos()<=3){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("pound")){
                    if(p.getWeightInPounds()>=4.5&&p.getWeightInPounds()<=7){
                    }else{
                        isNormal=false;
                    }
                }
           
            
        }else if(p.getAge()<12){
            
            if(vsign.contains("respirtory")){
                    if(p.getRespiratoryRate()>=20 &&p.getRespiratoryRate()<=30){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("heart")){
                    if(p.getHeartRate()>=180&&p.getHeartRate()<=140){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("blood")){
                    if(p.getSystolicBloodPressure()>=70&&p.getSystolicBloodPressure()<=100){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("kilo")){
                    if(p.getWeightInKilos()>=4&&p.getWeightInKilos()<=10){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("pound")){
                    if(p.getWeightInPounds()>=9&&p.getWeightInPounds()<=22){
                    }else{
                        isNormal=false;
                    }
                }
                  
           
        }else if(p.getAge()<36){
                        
            if(vsign.contains("respirtory")){
                    if(p.getRespiratoryRate()>=20 &&p.getRespiratoryRate()<=30){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("heart")){
                    if(p.getHeartRate()>=80&&p.getHeartRate()<=130){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("blood")){
                    if(p.getSystolicBloodPressure()>=80&&p.getSystolicBloodPressure()<=110){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("kilo")){
                    if(p.getWeightInKilos()>=10&&p.getWeightInKilos()<=14){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("pound")){
                    if(p.getWeightInPounds()>=22&&p.getWeightInPounds()<=31){
                    }else{
                        isNormal=false;
                    }
                }
        
        }else if(p.getAge()<72){
                        
            if(vsign.contains("respirtory")){
                    if(p.getRespiratoryRate()>=20 &&p.getRespiratoryRate()<=30){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("heart")){
                    if(p.getHeartRate()>=80&&p.getHeartRate()<=120){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("blood")){
                    if(p.getSystolicBloodPressure()>=80&&p.getSystolicBloodPressure()<=110){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("kilo")){
                    if(p.getWeightInKilos()>=14&&p.getWeightInKilos()<=18){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("pound")){
                    if(p.getWeightInPounds()>=31&&p.getWeightInPounds()<=40){
                    }else{
                        isNormal=false;
                    }
                }
        
        }else if(p.getAge()<166){
                        
            if(vsign.contains("respirtory")){
                    if(p.getRespiratoryRate()>=20 &&p.getRespiratoryRate()<=30){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("heart")){
                    if(p.getHeartRate()>=70&&p.getHeartRate()<=110){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("blood")){
                    if(p.getSystolicBloodPressure()>=80&&p.getSystolicBloodPressure()<=120){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("kilo")){
                    if(p.getWeightInKilos()>=20&&p.getWeightInKilos()<=42){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("pound")){
                    if(p.getWeightInPounds()>=41&&p.getWeightInPounds()<=92){
                    }else{
                        isNormal=false;
                    }
                }
        
        }else if(p.getAge()>=166){
                        
             if(vsign.contains("respirtory")){
                    if(p.getRespiratoryRate()>=12 &&p.getRespiratoryRate()<=20){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("heart")){
                    if(p.getHeartRate()>=55&&p.getHeartRate()<=105){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("blood")){
                    if(p.getSystolicBloodPressure()>=110&&p.getSystolicBloodPressure()<=120){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("kilo")){
                    if(p.getWeightInKilos()>50){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("pound")){
                    if(p.getWeightInPounds()>110){
                    }else{
                        isNormal=false;
                    }
                }
        
        }
            return isNormal;
        }
        
       
        
    
}
