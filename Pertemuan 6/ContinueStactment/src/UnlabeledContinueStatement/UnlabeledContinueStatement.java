/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnlabeledContinueStatement;

/**
 *
 * @author Fikri
 */
public class UnlabeledContinueStatement 
{
    public static void main(String[] args)
    {
        String names[] ={"Beach","Bianca","Lance","Beach"};
        
        int count=0;
        
        for(int i=0;i<names.length;i++)
        {
            if(!names[i].equals("Bianca"))
            {
                continue;
            }
            count++;
        }
        System.out.println("the are "+count+" Beahs in the list");
        
    
    
    
}
}
