/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrometestusingstack;
import java.util.Stack;
/**
 *
 * @author KELVO FRAYAY
 */
public class PalindromeTestUsingStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter any string: ");
        String inputString= EasyScanner.nextString();
        Stack stack = new Stack();
        
        for(int i=0;i<inputString.length();i++){
            stack.push(inputString.charAt(i));
        }
        
        String reverseString = "";
        while(!stack.isEmpty()){
            reverseString= reverseString+stack.pop();
        }
        
        if(inputString.equalsIgnoreCase(reverseString))
            System.out.println("The input string is a palindrome");
        else
            System.out.println("The input string is not a palindrome");
    }
    
}
