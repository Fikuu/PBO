/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;
import java.util.Scanner;
/**
 *
 * @author Fikri
 */
public class Contoh1Scanner 
{
   public static void main(String[] args)
   {
       String names[]={"Beach","Biamca","Lace","Belle","Nico","Yza","Gem","Ethan"}; 
       String searchName="Yza";
       Scanner scan=new Scanner(System.in);
       boolean foundName=false;
       
       for(int i=0;i<names.length;i++)
       {
           if(names[i].equals(searchName))
           {
               foundName=true;
           }
               
       }
       if(foundName)
       {
           System.out.println(searchName +"found!");
       }
       else 
       {
           
           System.out.println(searchName +"not found!");
       }
    }
   } 

