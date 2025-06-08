/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primenumberloops;

/**
 *
 * @author VUSANI
 */
import java.util.Scanner;

public class PrimeNumbersLoops {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k=0;
                for(int i=1;i<n;i++){
                    
                    if( n%1==0){
                        k++;
                    }
                }
                if (k<=2){
                    System.out.println("Is a Prime number"+ k);
                }
        }
}