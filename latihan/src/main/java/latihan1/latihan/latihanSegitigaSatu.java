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
public class latihanSegitigaSatu {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int i,j,result,inputTinggi;
        
        System.out.print("masukkan panjang segitiga : ");
        inputTinggi = input.nextInt();
        result = 0;
        
        for(i = 1; i<=inputTinggi; i++){
            result = result+i;
            for(j = 1; j<= i ; j++){
                System.out.print(j);
                  if(j<i){
                      System.out.print(" + ");
                  }
            }
            System.out.println(" = "+result);
        }
    }
    
}
