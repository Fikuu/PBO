
package November262019;


public class Human extends LivingThing{
    public void walk(){
        System.out.println("Human walks...");
    }
    
    public static void main(String[] args) {
        Human human = new Human();
        human.breath();
        human.eat();
        human.walk();
    }
   
}
