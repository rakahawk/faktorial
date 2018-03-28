package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner oke = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        int a = oke.nextInt();


        int l = 0;
        int tingkat = 10;

        for(int i=0;i<=a;i++){
            for(int k=a;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=l;j++){
                System.out.print("+");
            }
            l+=2;

            System.out.println("");

        }
        l -= 4;
        a = a*2;
        for (int i = 0; i < a; i++) {
            System.out.print("+");
        }
        System.out.println();

        for(int i=(a-1);i>=1;i--){

            for(int k=i;k<=(a-1);k++){
                System.out.print(" ");
            }
            for(int j=l;j>=1;j--){
                System.out.print("+");
            }
            l-=2;

            System.out.println("");
        }
        
    }
}
