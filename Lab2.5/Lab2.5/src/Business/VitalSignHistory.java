/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author ranranhe
 */
public class VitalSignHistory {
    
    private String viewOrAbnormal;
    private double maxValue;
    private double minValue;

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public double getMinValue() {
        return minValue;
    }

    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }

    public String getViewOrAbnormal() {
        return viewOrAbnormal;
    }

    public void setViewOrAbnormal(String viewOrAbnormal) {
        this.viewOrAbnormal = viewOrAbnormal;
    }

    private ArrayList<VitalSigns> vitalSignHistory;

    public VitalSignHistory() {
        this.vitalSignHistory = new ArrayList<VitalSigns>();
    }
    
    public VitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return this.vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> history) {
        this.vitalSignHistory = history;
    }

    public void addVital(VitalSigns v) {
        vitalSignHistory.add(v);
    }

    public void deleteVital(VitalSigns v) {
        vitalSignHistory.remove(v);
    }
    
    public ArrayList<VitalSigns> getAbnormalList(double max, double min) {
        ArrayList<VitalSigns> list = new ArrayList<VitalSigns>();
        for (VitalSigns vs : this.getVitalSignHistory()) {
            if (vs.getBloodPressure() < min || vs.getBloodPressure() > max) {
                list.add(vs);
            }
        }
        return list;
    }
}
