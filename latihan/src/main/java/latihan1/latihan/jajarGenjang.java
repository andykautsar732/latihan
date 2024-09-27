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
public class jajarGenjang {
    
    public static void main(String []args){
       Scanner input = new Scanner(System.in);
       int i, j, k, tinggi ;
       System.out.print("inputkan tinggi belah ketupat : ");
       tinggi = input.nextInt();
        
       
       for(i = 1; i<=tinggi ; i++){
           for(j = 1 ; j<= i ; j++){
               System.out.print(" ");
           }
           for(k = 1; k<=tinggi ; k++){
               System.out.print(" "+"*");
           }
           System.out.println(" ");
       }
    }
    
}
