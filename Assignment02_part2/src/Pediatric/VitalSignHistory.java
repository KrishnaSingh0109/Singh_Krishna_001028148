/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pediatric;

import java.util.ArrayList;

/**
 *
 * @author krish
 */
public class VitalSignHistory {
    
    private ArrayList<Patient> patient;

    public ArrayList<Patient> getPatient() {
        return this.patient;
    }

    public void setPatient(ArrayList<Patient> patient ) {
        this.patient = patient;
    }
    public VitalSignHistory(){
        this.patient=new ArrayList<Patient>();
    }
     
    
}
