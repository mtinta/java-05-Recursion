//Title: basic_example2
//Author: Miguel Angel Tinta Aguilar 
//Email: mtinta@unsa.edu.pe
//Date: 02/08/2020
//Description: this program find the sum of all elements of an array
//
//Time-work: 30 minutes
//License: Free Software
package Recursividad;
public class basic_example2 {
public static void main(String[] args) {
	int[] array= {1,2,3,4,5,6,7,8};									//Declaration of the array
	System.out.println(sumar(array,0));								//Printing the result of the method
}

	static int sumar(int a[], int indice) {							//Creating the recursive method with an array and an int value that represent the index position
		if(indice<a.length) {										//initialize the conditional for the basic case
			return a[indice] + sumar(a,indice+1);//RECURSION HERE	//Call the previous value and sums the recursive method
		}
		return 0;									
	}
}