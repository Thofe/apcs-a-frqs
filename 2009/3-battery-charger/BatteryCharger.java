
/**
 * Write a description of class BatteryCharger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.lang.Integer;

public class BatteryCharger
{
    private int[] rateTable;
    
    /**
     * Constructs the BatteryCharger class
     * 
     * @param table the rateTable for the class
     */
    public BatteryCharger(int[] table){
        this.rateTable = table;
    }
    
    /**
     * detremines the total cost to carge the battery starting at a given time 
     * 
     * @param startHour the hour the charging starts
     * @param chargeTime how long it will be charged
     * 
     * @return the total cost to charge the battery
     */
    private int getChargingCost(int startHour, int chargeTime){
        int hours = 0;
        int cost = 0;
        
        while (hours != chargeTime){
            cost += rateTable[startHour];
            hours++;
            startHour = (startHour+1)%24;
        }
        
        return cost;
    }
    
    /**
     * Determines the start time to charge the battery at the lowest cost 
     * 
     * @param chageTime the number of time to charge the battery
     * 
     * @return the optimal start time
     */
    public int getChargeStartTime(int chargeTime){
        int minCost = Integer.MAX_VALUE;
        int minHour= 0;
        
        for (int i=0; i<24; i++){
            int cost = getChargingCost(i, chargeTime);
            
            if (cost <= minCost){
                minCost = cost;
                minHour = i;
            }
        }
        
        return minHour;
    }
}   
