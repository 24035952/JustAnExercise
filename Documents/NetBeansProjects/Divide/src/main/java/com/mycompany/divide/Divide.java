/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divide;

/**
 *
 * @author VUSANI
 */
import java.util.Scanner;

public class Divide{
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);	
		
		System.out.println("Please enter any number: ");
		double number = sc.nextDouble();
		
		double newNumber = number/0;
		System.out.println("The new number divided by 0 is " + newNumber);
		
	}

	
}