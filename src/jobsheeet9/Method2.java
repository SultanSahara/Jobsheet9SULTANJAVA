/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheeet9;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Method2 {
    public static  int hitung (int jarak, int waktu){
    
                    return jarak/waktu;
        }
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
       System.out.print("Masukkan jarak : ");
       int jarak = input.nextInt();
       
       System.out.print("Masukkan waktu tempuh : ");
       int waktu = input.nextInt();
       
       int kecepatan = hitung(jarak,waktu);
       System.out.print("Kecepatan :" + kecepatan +" km/jam");
        
    
        }
   }

