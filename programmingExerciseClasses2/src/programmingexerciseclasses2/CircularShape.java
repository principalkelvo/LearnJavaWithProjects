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
public class CircularShape {
    private double radius;
    
    public CircularShape(double radiusIn){
        radius= radiusIn;
    }
    public void setRadius(double radiusIn){
        radius= radiusIn;
    }
    public double getRadius(){
        return radius;
    }
    public double calculateArea(){
        return (3.142*radius*radius);
    }
    public double calculateCircumference(){
        return (2*3.142*radius);
    }
    public double calculateDiameter(){
        return 2*radius;
    }
}
