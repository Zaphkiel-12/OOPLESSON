/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3Code;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Name {
    
    private int age;
    boolean isActive;
    private int z;
  
    
    public void myMethod(String fName, int age){
        System.out.println("First name is "+fName+" Age: "+age);
        
    }
    
    public void setAge(int age){
        this.age=age;
    }
    
    public int getAge(){
        return age;
    }
    
    public boolean getSetActive(){
        return isActive;
    }
    
    public int addition(int x, int y){
        z = x + y;
        return z;
    }
    
    public int subtraction(int x, int y){
        z = x - y;
        return z;
    }
    
    public void getFullDetails(String fName, String lName, int age, double grade){
        System.out.println("Full Details: \n" + fName+" "+lName+ "\nAge: "+age+ "\nGrade: "+grade);
        System.out.println("Full Details: " + fName+" "+lName+ "Age: "+age+ "Grade: "+grade);
    }
    
    public void checkAge(int age){
        if(age<18){
            System.out.println("You are minor and go clean your dish");
        }else{
            System.out.println("You are legal to do everything you want");
        }
    }
}
