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
        
        //Test Case
        
        System.out.println("------------------------------------Test Cases------------------------------------");
        boolean vitalSigns5 = vitalSign.isPatientNormal(0, 35, 130, 60, 2.2, 5);   
        System.out.println("Newborn Patient's Vital Sing is Normal :" + vitalSigns5);
        boolean vitalSigns1 = vitalSign.isPatientNormal(11, 25, 90, 100, 4, 10);   
        System.out.println("Infant Patient's Vital Sing is Normal :" + vitalSigns1);
        boolean vitalSigns2 = vitalSign.isPatientNormal(24, 25, 90, 100, 12, 24);  
        System.out.println("Toddler Patient's Vital Sing is Normal :" + vitalSigns2);
        boolean vitalSigns3 = vitalSign.isPatientNormal(60, 25, 90, 100, 16, 35); 
        System.out.println("Preschooler Patient's Vital Sing is Normal :" + vitalSigns3);
        boolean vitalSigns6 = vitalSign.isPatientNormal(165, 25, 90, 100, 22, 44); 
        System.out.println("School Age Patient's Vital Sing is Normal :" + vitalSigns6);
        boolean vitalSigns4 = vitalSign.isPatientNormal(170, 18, 90, 115, 60, 120);
        System.out.println("Adolescent Patient's Vital Sing is Normal :" + vitalSigns4);
        System.out.println("---------------------------------End Of Test Cases--------------------------------");
        
        
        //End Of Test Case
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Please Enter Your Date of Birth in YYYY-MM-DD Format");
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
        System.out.println("Month ::"+months);
        int days = calendar.get(Calendar.DATE);
        months +=1;
        LocalDate localDate1 = LocalDate.of(years,Month.of(months),days);  //LocalDate.of(years, months, days);
        LocalDate now = LocalDate.now();
        
        Period period = Period.between(localDate1, now);
        years = period.getYears();
        months = period.getMonths();
        days = period.getDays();
        
        
//        int years = myscanner.nextInt();
//        int months = myscanner.nextInt();
//        int days = myscanner.nextInt();
        
//        int age = (((years*12)+months)*30)+days;
        
        int ageInMonths = (years*12)+months;
        
        
        System.out.println("Please Enter Your Respiratory Rate...");
        
        int respiratoryRate = myscanner.nextInt();
        
        System.out.println("Please Enter Heart Rate...");
        
        int heartRate = myscanner.nextInt();
        
        System.out.println("Please Enter Systolic Blood Pressure...");
        
        int systolicBloodPressure = myscanner.nextInt();
        
        System.out.println("Please Enter Weight In Kilos...");
        
        double weightInKilos = myscanner.nextDouble();
        
        System.out.println("Please Enter Weight In Pounds...");
        
        double weightInPounds = myscanner.nextDouble();
        
        boolean vitalSigns = vitalSign.isPatientNormal(ageInMonths, respiratoryRate, heartRate, systolicBloodPressure, weightInKilos, weightInPounds);
        
        
        System.out.println("Is Patient Vital Sing is Normal :" + vitalSigns);
        
    }
    
    
        
       
        
    
}
