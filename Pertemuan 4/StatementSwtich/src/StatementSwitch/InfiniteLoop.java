/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatementSwitch;

/**
 *
 * @author Fikri
 */
public class InfiniteLoop 
{
    public static void main(String[] args) 
    {
        int pil=0;
        boolean status=false;
        
        do
        {
            if(pil==1)
            {
                System.out.println("Runnig");
                status=true;     
        }
        else
        {
            System.out.println("Stop"); 
            status=false;
        }
    }while(status);
            
}
}
