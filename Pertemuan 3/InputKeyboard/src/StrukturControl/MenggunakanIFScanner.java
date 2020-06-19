/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrukturControl;

import java.util.Scanner;

/**
 *
 * @author LABP1KOMP
 */
public class MenggunakanIFScanner 
{
        public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int bil;
        
        System.out.println("Inputkan :");
        bil=Integer.parseInt(scan.nextLine());
        
        if(bil>60)
        {
            System.out.println("anda lulu");
        }
        else
        {
            System.out.println("anda tidak lulus");
        }
    }
    
}

