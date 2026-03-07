/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3Code;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class NameMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Name n = new Name();
//        n.myMethod("Ed", 20);
//        n.myMethod("Dela", 21);
//        n.myMethod("Cruz", 22);
//          n.setAge(120);
//          System.out.println(n.getAge());
//          System.out.println(n.isActive);
          n.getFullDetails("Ed", "Dela Cruz", 20, 3.0);
          n.checkAge(17);
    }
    
}
