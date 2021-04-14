/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parttimeemployeetester;


public class PartTimeEmployee extends Employee {//this class is a subclass of employee
    private double hourlyPay;//this attribute is unique to the subclass
    
    //the constructor
    public PartTimeEmployee(String numberIn, String nameIn,double hourlyIn) {
        super(numberIn, nameIn);//call the constructor of the superclass
        hourlyPay= hourlyIn;
    }
    //these methods are also unique to the subclass
    public void setHourlyPay(double hourlyIn){
        hourlyPay= hourlyIn;
    }
    public double getHourlyPay(){
        return hourlyPay;
    }
    public double calculateWeeklyPay(int noOfHoursIn){
        return noOfHoursIn*hourlyPay;
    }
    
}
