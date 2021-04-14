/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrometestusingqueue;
import java.util.Queue;
import java.util.LinkedList;
/**
 *
 * @author KELVO FRAYAY
 */
public class PalindromeTestUsingQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter any string: ");
        String inputString= EasyScanner.nextString();
        
        Queue queue= new LinkedList();
        for (int i=inputString.length()-1;i>=0;i--){
            queue.add(inputString.charAt(i));
        }
        
        String reverseString= "";
        while(!queue.isEmpty()){
            reverseString=reverseString+queue.remove();
        }
        if(inputString.equalsIgnoreCase(reverseString))
            System.out.println("The input string is a palindrome");
        else
            System.out.println("The input string is not a palindrome");
    }
    
}
