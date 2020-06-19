/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabelContinueStatement;

/**
 *
 * @author Fikri
 */
public class LabelContinueStatement 
{
    public static void main(String[] args)
    {
        for(int i=0;i<5;i++)
        {
            outerLoop:
            for(int j=0;j<5;j++)
            {
                System.out.println("Inside for(j) loop"+j);
                if(j==2) continue outerLoop; 
                {   
                    
                }
            }
            System.out.println("Inside for(i) loop");
        }
        
    }
    
}
