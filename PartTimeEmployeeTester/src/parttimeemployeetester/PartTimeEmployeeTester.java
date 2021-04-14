/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parttimeemployeetester;

import java.util.Scanner;

/**
 *
 * @author KELVO FRAYAY
 */
public class PartTimeEmployeeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Scanner keyboardString = new Scanner(System.in);
        String number,name;
        double pay;
        int hours;
        PartTimeEmployee emp;
        //get the details from the user
        System.out.print("Employee Number? ");
        number= keyboardString.nextLine();
        System.out.print("Employee's Name? ");
        name= keyboardString.nextLine();
        System.out.print("Hourly pay? ");
        pay= keyboard.nextDouble();
        System.out.print("Hours Worked this week? ");
        hours= keyboard.nextInt();
        //create a new part-time employee
        emp= new PartTimeEmployee(number,name,pay);
        //display Part-time employees details including the weekly pay
        System.out.println();
        //the next two methods have been inherited from the Employee class
        System.out.println(emp.getName());
        System.out.println(emp.getNumber());
        System.out.println(emp.calculateWeeklyPay(hours));
    }
    
}
