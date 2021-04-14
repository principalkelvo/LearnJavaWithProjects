/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pressuresensor;


public class SafeSensor extends Sensor {
    private double max;
    public SafeSensor(double maxIn) {
        max= maxIn;
        pressure= 10;
    }
    public SafeSensor(double maxIn,double pressureIn){
        max= maxIn;
        pressure= pressureIn;
    }
    @Override
    public boolean setPressure(double pressureIn){
        if(pressureIn<=max && pressureIn>0){
            pressure= pressureIn;
            return true;
        }
        else{
            return false;
        }
    }
    public double getMax(){
        return max;
    }
}
