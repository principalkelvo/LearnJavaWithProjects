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
public class Booking {
    private String room;
    private String name;
    
    public Booking(String roomIn,String nameIn){
        room= roomIn;
        name= nameIn;
    }
    public String getRoom(){
        return room;
    }
    public String getName(){
        return name;
    }
}
