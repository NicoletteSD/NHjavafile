/*
 * Author: Nicolette Hill
 * Date: 21 March 2022
 * Overview: To create a Math class 
 */
public class Math1 {

//Main method
public static void main(String[] args) {
	
	int n = 5;
	int h = 10;
	double t = 2;
	double s = 6;
	
//Using Math class to call minimum numbers between n & h
System.out.println("Minimum number of n and h is" +Math.min(n, h));

//Using Math class to call max number between n & h
System.out.println("Maxium number of n and h is" +Math.max(n, h));

//Using floor
System.out.println("floor of n and h is" +Math.floorDiv(n, h));

//using ceil
System.out.println("ceil of n & h is" +Math.ceil(t));

//Using power this double
System.out.println("Power of t & s is" +Math.pow(t, s));



	}
}
