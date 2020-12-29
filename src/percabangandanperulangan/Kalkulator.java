/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangandanperulangan;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
    double result = 0 ;
System.out.println("==== Aplikasi  kalkulator Sederhana ====");
System.out.println("Pilihan Operasi ; \n"
                     + "1. Penjumlahan\n"
                     + "2. Pengurangan\n"
                     + "3. Perkalian\n"
                     + "4. Pembagian\n");
System.out.println("Masukkan Pilihan: ");
Scanner operation = new Scanner (System.in);
int option = operation.nextInt();

// input bilangan
System.out.print("masukkan bilngan 1: ");
Scanner val1 = new Scanner(System.in);
double bil1 = val1.nextInt();

System.out.print("masukkan bilngan 2: ");
Scanner val2 = new Scanner(System.in);
double bil2 = val2.nextInt();

// switch case operation 

switch(option) {
    
    case 1:
        System.out.println("\nPenjumlahan");
        result = bil1 + bil2;
        System.out.format("Hasil: %.2f\n", result);
        break;
    
    case 2:
        System.out.println("\nPengurangan");
        result = bil1 - bil2;
        System.out.format("Hasil: %.2f\n", result);
        break;
        
    case 3:
        System.out.println("\nPerkalian");
        result = bil1 * bil2;
        System.out.format("Hasil: %.2f\n", result);
        break;
    case 4:
        System.out.println("\nPembagian");
        result = bil1 / bil2;
        System.out.format("Hasil: %.2f\n", result);
        break;
}
    }
    
}
