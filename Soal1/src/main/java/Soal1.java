/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;

import java.util.Scanner;

public class datatype{
    public static void main (String[] args){
        int k, i;
        long n;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan jumlah berapa kali melakukan input: ");
        k =  keyboard.nextInt();
        
        for (i=0; i<k; i++){
            try{
                System.out.println("\n Masukkan nilai: ");
                n = keyboard.nextLong();
                
                System.out.println("\n");
                System.out.println(n+ " can be fitted in: ");
                if(n>=-128 && n <= 127)System.out.println("* byte");
                if(n>=-32768 && n <= 32767)System.out.println("* short");
                if(n>=-2147483648 && n <= 2147483647)System.out.println("* int");
                if(n>=-9223372036854775808L && n <= 9223372036854775807L)System.out.println("* long");
            }catch(Exception outOfRange){
                System.out.println("\n");
                System.out.println(keyboard.next()+" can't be fitted anywhere");
            }
        }
    }
}