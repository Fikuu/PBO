/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_1801082018;

/**
 *
 * @author Fikri
 */
public class StudentExample1 
{
    public static void main(String[] args) 
    {
        StudentRecord andi = new StudentRecord ();
        StudentRecord ali = new StudentRecord ("Ali");
        StudentRecord ani = new StudentRecord ("Ani","Padang");
        
        andi.print("");
        ali.print("");
        ani.print("");
        
    }
    
}
