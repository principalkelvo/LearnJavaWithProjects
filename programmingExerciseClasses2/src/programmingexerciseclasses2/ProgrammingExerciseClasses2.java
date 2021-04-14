/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingexerciseclasses2;

import java.util.ArrayList;

/**
 *
 * @author KELVO FRAYAY
 */
public class ProgrammingExerciseClasses2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //question 1
        double radius; char response;
        System.out.println("Enter radius: ");
        radius= EasyScanner.nextDouble();
        CircularShape circle=new CircularShape(radius);
        System.out.println("Area= "+circle.calculateArea());
        System.out.println("Circumference= "+circle.calculateCircumference());
        System.out.println("Diameter= "+circle.calculateDiameter());
        System.out.println("would you like to enter another radius (Y/N): ");
        response= EasyScanner.nextChar();
        while(response!='Y'){
            System.out.println("Goodbye");
        }
        System.out.println("Enter new radius: ");
        double newRadius=EasyScanner.nextDouble();
        circle.setRadius(newRadius);
        System.out.println("Area= "+circle.calculateArea());
        System.out.println("Circumference= "+circle.calculateCircumference());
        System.out.println("Diameter= "+circle.calculateDiameter());
        System.out.println();
        
        //quiz 2
        
        ArrayList<Student>school= new ArrayList<>();
        school.add(new Student("19827","kelvin"));
        school.add(new Student("24527","njoro"));
        school.add(new Student("17348","owino"));
        school.get(0).enterMarks(90, 80, 63);
        school.get(1).enterMarks(70, 94, 82);
        school.get(2).enterMarks(97, 56, 95);
        
        for(Student item:school){
            System.out.println("Student Admision: "+item.getNumber());
            System.out.println("Student Name: "+ item.getName());
            System.out.println("Student maths marks: "+ item.getMathsMark());
            System.out.println("Student english marks: "+ item.getEnglishMark());
            System.out.println("Student science marks: "+ item.getScienceMark());
            System.out.println("Student Avarage: "+item.calculateAverageMark());
            System.out.println("Fee balance: "+Student.getFee());
            System.out.println();
        }
        System.out.println();
        
        //quiz 3
        String tempNumber;
        String tempName;
        double tempPrice;
        System.out.print("Enter the stock number: ");
        tempNumber = EasyScanner.nextString();
        System.out.print("Enter the name of the item: ");
        tempName = EasyScanner.nextString();
        System.out.print("Enter the price of the item: ");
        tempPrice = EasyScanner.nextDouble();
        StockItem stock= new StockItem(tempNumber,tempName,tempPrice);
        stock.increaseTotalStock(5);
        System.out.println("Stock number: "+stock.getStockNumber());
        System.out.println("Total price: "+stock.calculateTotalPrice());
        System.out.println("sales tax: "+StockItem.getSalesTax());
        System.out.println();
        
        //quiz 4
        Sensor tyre=new Sensor(90);
        tyre.setPressure(-100);
        System.out.println("pressure = "+tyre.getPressure());
        System.out.println();
        //quiz 5**
        //quiz 6 completed
        //quiz 7**
        
    }  
}
