/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1.latihan;

import java.util.Scanner;

/**
 *
 * @author godonggedang
 */
public class segitigaSamaKaki {
    
    public static void main(String []args){
       Scanner input = new Scanner(System.in);
       int i, j, k, tinggi ;
       System.out.print("inputkan tinggi segitiga : ");
       tinggi = input.nextInt();
        
       
       for(i = tinggi; i>=1 ; i--){
           for(j = 1 ; j<= i ; j++){
               System.out.print(" ");
           }
           for(k = tinggi; k>=i ; k--){
               System.out.print(" "+"*");
           }
           System.out.println(" ");
       }
    }
    
}
