//Title: basic_example1
//Author: Angelo Jair Vega Figueroa 
//Email: avegafi@unsa.edu.pe
//Date: 01/08/2020
//Description: This program is responsible for printing the user's desired value 
//of the Fibonacci sequence using the recursive method
//Time-work: 40 minutes
//License: Free Software

import java.util.Scanner;

public class basic_example1 {

	public static void main(String[] args){
		
		//Initialize the Scanner class
		Scanner teclado = new Scanner(System.in);
		System.out.println("what is the value you want?");//Ask what term they want from the sequence
		int x = teclado.nextInt();//Enter the value in the system
		System.out.println(fibonacci(x));//Print the final term on the screen
	}
	//Initialize the recursive method
	public static int fibonacci (int n){
	if (n<2) {//Initialize the conditional for the basic case
	return n;
	} else {//if is not basic case, then use the recursive method
	return fibonacci(n-1) + fibonacci(n-2);//Call the previous value and the previous value of this
	}
	}
}