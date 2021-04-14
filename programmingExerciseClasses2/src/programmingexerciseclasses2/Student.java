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
public class Student {
    private String studentNumber;
    private String studentName;
    private int markForMaths;
    private int markForEnglish;
    private int markForScience;
    private static double fee;
    
    public Student(String number,String name){
        studentName = name;
        studentNumber= number;
        markForMaths= -0;
        markForEnglish= -0;
        markForScience= -0;
        fee= 3000;
    }
    
    public String getName(){
        return studentName;
    }
    public String getNumber(){
        return studentNumber;
    }
    public void enterMarks(int maths,int english,int science){
        markForMaths= maths;
        markForEnglish= english;
        markForScience= science;
    }
    public int getMathsMark(){
        return markForMaths;
    }
    public int getEnglishMark(){
        return markForEnglish;
    }
    public int getScienceMark(){
        return markForScience;
    }
    public double calculateAverageMark(){
        return(markForMaths+markForEnglish+markForScience)/3.0;
    }
    public static double getFee(){
        return fee;
    }
    public static void setFee(double feeIn){
        fee= feeIn;
    }
}
