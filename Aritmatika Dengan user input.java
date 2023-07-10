package com.gaming;
import java.util.Scanner;
public class Logika {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukan angka");
        int a = scanner.nextInt();
        System.out.println("Masukan angka berikutnya");
       int b = scanner.nextInt();
        System.out.println();
        int c = (a + b);
        System.out.printf("Hasil dari %d + %d = \n",a,b);
        System.out.println(c);

    }
}
