/*
 * Author: Nicolette Hill
 * Date: 6 March 2022
 * Overview: To learn and understand the functions Java step by step
 * Practice While loop   
 */

import java.util.Scanner;


public class Main2 {

public static void main(String[] args) {

//how to implement the value through the scanner by printing "type a number"
Scanner sc = new Scanner(System.in);
System.out.println("Type a number: ");

//variable will run through the scanner 
int x = sc.nextInt();



//while loop will stop at 10 because "x" is not equal to 10
 while(x != 10) {
	System.out.println("Type 10...");
	System.out.println("Type a number: ");
	x = sc.nextInt();

	
}

	
	





}
}
