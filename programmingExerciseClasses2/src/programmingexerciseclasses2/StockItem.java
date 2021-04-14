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
public class StockItem {
    private String stockNumber;
    private String name;
    private double price;
    private int totalStock;
    private static double salesTax;
    
    public StockItem(String numberIn,String nameIn,double priceIn){
        stockNumber=numberIn;
        name= nameIn;
        price= priceIn;
        totalStock= 0;
        salesTax=10;
    }
    public void setPrice(double priceIn){
        price= priceIn;
    }
    public void increaseTotalStock(int newStock){
        totalStock= newStock + totalStock;
    }
    public String getStockNumber(){
        return stockNumber;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getTotalStock(){
        return totalStock;
    }
    public double calculateTotalPrice(){
        return price*totalStock;   
    }
    public static void setSalesTax(double taxIn){
        salesTax= taxIn;
    }
    public static double getSalesTax(){
       return salesTax;
    }
}
