/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingexerciseclasses;

import java.util.ArrayList;

/**
 *
 * @author KELVO FRAYAY
 */
public class ProgrammingExerciseClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //question 1 self test
    Oblong oblong1 = new Oblong(3.0, 4.0);
    Oblong oblong2 = new Oblong(5.0, 6.0);
    System.out.println("The area of oblong1 is " + oblong1.calculateArea());
    System.out.println("The area of oblong2 is " + oblong2.calculateArea());
    System.out.println();
    
    //quiz 2
    BankAccount acc1= new BankAccount("1524","Samuel");
    BankAccount acc2= new BankAccount("1234","David");
    acc1.deposit(200);
    acc2.deposit(100);
    
    boolean ok= acc1.withdraw(150);
    if(ok){
        System.out.println("WITHDRAWAL SUCCESSFUL");
    }
    else{
        System.out.println("INSUFFICIENT FUNDS");
    }
    
    //balance
    System.out.println("acc1 balance: "+ acc1.getBalance());
    System.out.println("acc2 balance: "+ acc2.getBalance());
    System.out.println();
    
    //question 4
    final String PASSWORD = "java"; // set password
    String guess; // to hold user’s guess
    System.out.print("Enter password: ");
    guess= EasyScanner.nextString();
    if(guess.equals(PASSWORD)){
        System.out.println("CORRECT PASSWORD");
    }
    else{
        System.out.println("INCORRECT PASSWORD");
    }
    System.out.println();
    
    //quiz 6 array
    System.out.println("how many rooms do you want: ");
    int size= EasyScanner.nextInt();
    Oblong[] rooms= new Oblong[size];
    for(int i=0;i<rooms.length;i++){
        System.out.print("enter length for oblong"+(i+1)+": ");
        double length= EasyScanner.nextDouble();
        System.out.print("enter height for oblong"+(i+1)+": ");
        double height= EasyScanner.nextDouble();
        rooms[i] = new Oblong(length,height);
    }
    System.out.println("Enter no. of room you want to get its area: ");
    int room= EasyScanner.nextInt();
    System.out.println("area of room"+room+": "+ rooms[(room-1)].calculateArea());
    System.out.println();
    //arraylist quiz 7
    System.out.println("how many rooms do you want: ");
    int size2= EasyScanner.nextInt();
    ArrayList<Oblong>rooms2= new ArrayList<>();
    for(int i=0;i<size2;i++){
        System.out.print("enter length for oblong"+(i+1)+": ");
        double length= EasyScanner.nextDouble();
        System.out.print("enter height for oblong"+(i+1)+": ");
        double height= EasyScanner.nextDouble();
        rooms2.add(new Oblong(length,height));
    }
    System.out.println("Enter no. of room you want to get its area: ");
    int area= EasyScanner.nextInt();
    System.out.println("area of room"+area+": "+ rooms2.get((area-1)).calculateArea());
    System.out.println();
    //area of room"+room+" "+ rooms[(room-1)].calculateArea()
    //Programming Exercises 2
    String codeName,confirm;
    do{System.out.print("please enter your code name: ");
    codeName= EasyScanner.nextString();
    while(codeName.length() < 6){
        System.out.println("INVALID CODENAME");
        System.out.print("please enter your code name: ");
        codeName= EasyScanner.nextString();
    }
    System.out.print("Confirm your Code name: ");
    confirm= EasyScanner.nextString();
    while(confirm.equals(codeName) != true){
        System.out.println("CODENAME MIS-MATCH");
        System.out.print("Confirm your Code name: ");
        confirm= EasyScanner.nextString();
    }
    System.out.println("CODENAME CONFIRMED");
    
    }
    while(codeName.startsWith("agent")!= true && 
            codeName.charAt(codeName.length()-1)== 'X'!= true);
    
    System.out.print("This code is valid");
    System.out.println(codeName);
    
    System.out.println();
    
    //quiz 3 String comparison repeat *trim*
    String str1,str2;
    int comparison;
    System.out.print("enter a string: ");
    str1= EasyScanner.nextString();
    System.out.print("enter another string: ");
    str2= EasyScanner.nextString();
    comparison= str1.compareToIgnoreCase(str2);
    if(comparison<0){
        System.out.println(str1+" comes before "+str2);
    }
    else if(comparison>0){
        System.out.println(str2+" comes before "+str1);
    }
    else{
        System.out.println("they are equal");
    }
    
    // quiz 4
    String number,name,name2,number2;
    char response;
    BankAccount [] bank= new BankAccount[2];
    System.out.print("Please enter your name: ");
    name = EasyScanner.nextString();
    System.out.print("Please enter your account number: ");
    number = EasyScanner.nextString();
    System.out.print("Please enter your name: ");
    name2 = EasyScanner.nextString();
    System.out.print("Please enter your account number: ");
    number2 = EasyScanner.nextString();
    bank [0]= new BankAccount(name,number);
    bank [1]= new BankAccount(name2,number2);
    
    System.out.println("please enter acoount number to deposit: ");
    String accountNumber=EasyScanner.nextString();
    do{System.out.println("please enter amount to deposit: ");
    double amount=EasyScanner.nextDouble();
    if(accountNumber.equals(number)){
        bank [0].deposit(amount);
        System.out.println("you deposited "+amount+"Ksh");
    }
    else if(accountNumber.equals(number2)){
        bank [1].deposit(amount);
        System.out.println("you deposited "+amount+"Ksh");
    }
    else{
        System.out.println("Account not found.");
    }
    System.out.print("Would you like to make another deposit? (Y/N)");
    response=EasyScanner.nextChar();
    System.out.println();
    } while(response=='y'|| response=='Y');
    for(BankAccount item:bank){
        System.out.println("Account number: "+item.getAccountNumber());
        System.out.println("Account name: "+item.getAccountName());
        System.out.println("Current balance: "+item.getBalance());
        System.out.println();
    }
    
    
    
    }   
}
