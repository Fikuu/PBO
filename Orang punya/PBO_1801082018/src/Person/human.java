/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author Fikri
 */
public class human extends LivingThing{
    public void walk(){
        System.out.println("Humamn walks ..");
    }
    
    public static void main(String[] args) {
        human h = new human();
        h.breath();
        h.eat();
        h.walk();
    }
}
