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
public class jamPasir {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i, j, k, tinggiJamPasir;
        System.out.print("msukkan tinggi jam pasir : ");
        tinggiJamPasir = input.nextInt();

        for (i = tinggiJamPasir; i >= 1; i--) {
            for (j = tinggiJamPasir; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(" " + "*");
            }
            System.out.println();
        }

        for (i = tinggiJamPasir-1; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (k = tinggiJamPasir; k >= i; k--) {
                System.out.print(" " + "*");
            }

            System.out.println(" ");
        }
    }

}
