/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parttimeemployeetester;

/**
 *
 * @author KELVO FRAYAY
 */
public class Employee {
    private String number;
    private String name;
    
    public Employee(String numberIn, String nameIn){
        number= numberIn;
        name= nameIn;
    }
    
    public void setName(String nameIn){
        name= nameIn;
    }
    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }
}
