//Title: advanced_example2
//Author: Miguel Angel Tinta Aguilar 
//Email: mtinta@unsa.edu.pe
//Date: 02/08/2020
//Description: this program find the sum of all elements of an array
//by the method of divide & conquer
//Time-work: 90 minutes
//License: Free Software
package Recursividad;
public class advance_example2 {
public static void main(String[] args) {
	int[] array= {1,2,3,4,5,6,7,8};							//Declaration of the array
	System.out.println(sumaDyV(array,0,array.length-1));	//Printing the result of the method
}
public static int sumaDyV(int[]array, int inicio, int fin) { //Creating the recursive method that uses the array and 2 index values
	
	if(inicio==fin) {										//When the both index are the same the recursion ends
		return array[inicio];								//it doesn't matter wich index value you can use "fin" as well
	}else {													//Recursive part of the method
		int mitad= (inicio+fin)/2;							//Value that divide the array in two 
		int mitad1 = sumaDyV(array,inicio,mitad);			//Valuo of the sum of the first half of the array and calling a recursion
		int mitad2 = sumaDyV(array,mitad+1,fin);			//Value of the sum of the second half of the array and calling a recursion
		return mitad1+mitad2;								//Return the sum of both halfs
	}
}
}