/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchLabel;

/**
 *
 * @author Fikri
 */
public class Break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int [][] number ={{1,2,3},
                   {4,5,6},
                   {7,8,9}};
        
        int searchNum =5;
        boolean foundNum=false;
        
        seachLabel:
        for(int i=0;i<number.length;i++)
        {
            for(int j=0;i<number.length;i++)
            {
                if(searchNum == number[i][j])
                {
                    boolean foundName = true;
                    
                }
            }
        }
        if(foundNum)
        {
            System.out.println(searchNum +"found");
        }
        else
        {
            System.out.println(searchNum+"not found");
        }
    }
    
    }
    

