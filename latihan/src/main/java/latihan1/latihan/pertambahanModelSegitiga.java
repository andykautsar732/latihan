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
public class pertambahanModelSegitiga {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i, j, result, tinggiSegitiga;
        System.out.print("Masukkan Tinggi Segitiga : ");
        result = 0;
        tinggiSegitiga = input.nextInt();
        for(i =1 ; i<= tinggiSegitiga ; i++){
            result = result + i;
            for(j = 1; j<= i ; j++){
                System.out.print(j);
                if(j < i){
                    System.out.print("+");
                }
            }
            System.out.println("="+result);
        }
    }
    
}
