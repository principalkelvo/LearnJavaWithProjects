/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingexerciseclasses2;

/**
 *
 * @author KELVO FRAYAY
 */
public class TimeTable {
    Booking [][] times= new Booking[0][0];
    public TimeTable(int days, int periods){

    }
    public int numberOfDays(){
        return times.length;
    }
    public int numberOfPeriods(){
        return times[0].length;
    }
}
