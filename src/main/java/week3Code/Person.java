/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3Code;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Person implements Interface{
    
    private String name, address;
    private int age;
    private boolean isDancing;
    
    Person(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    
    public void walking(){
        System.out.println("Walking");
    }

    @Override
    public void dancing() {
        System.out.println("Dancing");
    }

    @Override
    public boolean isDancing() {
        return isDancing;
    }
    
}
