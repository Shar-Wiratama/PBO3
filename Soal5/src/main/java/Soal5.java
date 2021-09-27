/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal5;
/**
 *
 * @author KASI UKPPU
 */
import java.util.Scanner;
public class string {
    public static void main (String[] args){
        String A, B;
        int panjang, i;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukkan kata ke-1: ");
        A = keyboard.nextLine();
        System.out.println("Masukkan kata ke-2: ");
        B = keyboard.nextLine();
        
        panjang=A.length() + B.length();
        System.out.println ("Jumlah huruf: " +panjang);
       
        System.out.println("Lexychography: ");
        if ( A.compareTo(B)>0 ){
            System.out.println("Yes ");
        }else{
            System.out.println("No ");
        }
        A = (A.substring(0,1)).toUpperCase() +A.substring(1);
        B = (B.substring(0,1)).toUpperCase() +B.substring(1);
        System.out.println ("Kedua kata jika digabung adalah: ");
        System.out.println(A + " " + B);
    }
}