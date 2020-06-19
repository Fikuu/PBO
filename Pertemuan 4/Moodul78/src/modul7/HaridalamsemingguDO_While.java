/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;

/**
 *
 * @author Fikri
 */
public class HaridalamsemingguDO_While {
    public static void main(String[] args) {
        String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int a=0;
        int b=0;
        int c=0;
        
        System.out.println("Perulangan Do-While");
        do
        {
            System.out.println(days[c]);
            c++;
        }
        while(c<days.length);
    }
}
