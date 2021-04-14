/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pressuresensor;

/**
 *
 * @author KELVO FRAYAY
 */
public class Sensor {
    protected double pressure;
    
    public Sensor(){
        pressure= 0;
    }
    public Sensor(double pressureIn){
        pressure= pressureIn;
    }
    public boolean setPressure(double pressureIn){
        if (pressureIn<0){
            return false;
        }
        else{
            pressure= pressureIn;
            return true;
        }
    }
    public double getPressure(){
        return pressure;
    }
}
