/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uasmkpl;
import java.util.Scanner;
/**
 *
 * @author oyest
 */
public class UASMkpl {

    public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.println("Selamat datang di Kalkulator Sederhana");
    //     System.out.println("Silakan masukkan dua angka:");

    //     // Minta pengguna memasukkan dua angka
    //     System.out.print("Angka pertama: ");
    //     double angka1 = scanner.nextDouble();

    //     System.out.print("Angka kedua: ");
    //     double angka2 = scanner.nextDouble();

    //     // Menu operasi
    //     System.out.println("Pilih operasi:");
    //     System.out.println("1. Penambahan (+)");
    //     System.out.println("2. Pengurangan (-)");
    //     System.out.println("3. Perkalian (*)");
    //     System.out.println("4. Pembagian (/)");

    //     // Minta pengguna memilih operasi
    //     System.out.print("Masukkan pilihan Anda (1/2/3/4): ");
    //     int pilihan = scanner.nextInt();

    //     double hasil = 0;

    //     // Lakukan operasi sesuai pilihan pengguna
    //     switch (pilihan) {
    //         case 1:
    //             hasil = angka1 + angka2;
    //             break;
    //         case 2:
    //             hasil = angka1 - angka2;
    //             break;
    //         case 3:
    //             hasil = angka1 * angka2;
    //             break;
    //         case 4:
    //             if (angka2 != 0) {
    //                 hasil = angka1 / angka2;
    //             } else {
    //                 System.out.println("Tidak bisa membagi dengan nol.");
    //                 return;
    //             }
    //             break;
    //         default:
    //             System.out.println("Pilihan tidak valid.");
    //             return;
    //     }

    //     // Tampilkan hasil operasi
    //     System.out.println("Hasil: " + hasil);
    // }
        Scanner s = new Scanner(System.in);

        System.out.println("Kalkulator");

        System.out.println("Input:");
        System.out.print("Pertama: ");
        double a = s.nextDouble();

        System.out.print("Kedua: ");
        double b = s.nextDouble();

        System.out.println("Operasi:");
        System.out.println("1. (+)");
        System.out.println("2. (-)");
        System.out.println("3. (*)");
        System.out.println("4. (/)");

        System.out.print("Pilih (1/2/3/4): ");
        int c = s.nextInt();

        double result = 0;

        switch (c) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid.");
                return;
        }

        System.out.println("Result: " + result);

        // Duplicate code
        System.out.println("Operasi:");
        System.out.println("1. (+)");
        System.out.println("2. (-)");
        System.out.println("3. (*)");
        System.out.println("4. (/)");

        System.out.print("Pilih (1/2/3/4): ");
        c = s.nextInt();

        result = 0;

        switch (c) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid.");
                return;
        }

        System.out.println("Result: " + result);
    }
}

   
