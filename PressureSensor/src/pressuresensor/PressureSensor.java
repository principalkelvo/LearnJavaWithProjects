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
public class PressureSensor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SafeSensor tyre= new SafeSensor(20,10);
        tyre.setPressure(50);
        System.out.println(tyre.getPressure());
    }
    
}
