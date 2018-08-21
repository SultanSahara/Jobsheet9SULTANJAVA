/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheeet9;
import java.util.Scanner;


public class Method3 {
    public static int hitung(int bil1,int bil2,int bil3){
         return bil1|bil2|bil3;
                
}        
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan I : ");
            int bil1 = input.nextInt();
            
            System.out.print("Masukkan Bilangan II : ");
            int bil2 = input.nextInt();
            
            System.out.print("Masukkan Bilangan III : ");
            int bil3 = input.nextInt();
            
            int a = hitung(bil1,bil2,bil3);
            System.out.print("Nilai terbesar adalah : " +a);
    }
}
