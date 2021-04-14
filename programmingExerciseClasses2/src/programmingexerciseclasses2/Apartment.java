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
public class Apartment {
    ArrayList<Oblong>rooms= new ArrayList<>();
    
    public double getRoomArea(int room){
        for(int i=0;i<rooms.size();i++){
            Oblong tempRoom = rooms.get(i);
            if(tempRoom.equals(room)){
                tempRoom.calculateArea();
                return i;
            }   
        }
        return -999;
    }
    
}
