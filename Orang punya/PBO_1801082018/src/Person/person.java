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
public class person {
    protected String name;
    protected String address;
    
    // Default Constructor///=
    
    public person(){
        System.out.println("Inside Person : Constructor");
        name = "fikri";
        address = "baso";
    }
    
    // Constructor dengan dua parameter //

    public person(String name, String address) {
        this.name = name;
        this.address = address;
        
        
    }
    
    // Method accessor //

    public String getName() {
        System.out.println("Person : getName");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
