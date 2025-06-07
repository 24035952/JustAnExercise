/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arithmetic;

/**
 *
 * @author VUSANI
 */

import java.util.*;

public class Arithmetic{
    
    public static void main(String [] args){
        
     Scanner sc = new Scanner(System.in);   
       
     System.out.println("Please enter the value of a: ");
     double a = sc.nextDouble();
     
      System.out.println("Please enter the value of b: ");
     double b = sc.nextDouble();
        
       System.out.println("Please enter the value of c: ");
     double c = sc.nextDouble();  
        
        
     double firstAnswer = (-b + Math.sqrt((b*b) -4*(a*c)))/2*a;
     double secondAnswer = (-b - Math.sqrt((b*b) -4*(a*c)))/2*a;
     
     System.out.println("Your first answer is: " + firstAnswer);
     System.out.println("Your second answer is: " + secondAnswer);
     

        
    }

}