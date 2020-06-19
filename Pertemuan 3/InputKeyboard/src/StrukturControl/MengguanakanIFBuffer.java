/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrukturControl;
import java.io.*;
/**
 *
 * @author LABP1KOMP
 */
public class MengguanakanIFBuffer 
{
     public static void main (String[] args)
     {
         BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
         int bil;
         
         try
         {
             System.out.println("Inputkan");
             bil=Integer.parseInt(input.readLine());
             
             if(bil>60)
             {
                 System.out.println("Anda Lulus");
             }
         }
         catch(IOException e)
         {
             System.out.println("Mati lah ang ndk lulus ang do");
         }
                 
     }
}
