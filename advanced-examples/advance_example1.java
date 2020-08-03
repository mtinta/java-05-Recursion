//Title: advance_example1
//Author: Angelo Jair Vega Figueroa 
//Email: avegafi@unsa.edu.pe
//Date: 02/08/2020
//Description: this program is responsible for show
//all possible combinations of adding a specific number
//Time-work: 74 minutes
//License: Free Software
import java.util.ArrayList;
public class advance_example1 {
	public static void main(String[] args) {
		//Declaration of the variables
		int n = 4;
		//Initialize the ArrayList class
		ArrayList<Integer>numbers = new ArrayList<>();
        //to save the numbers 
		combinations(n,numbers,0);//show all combinations that the system produces
	}
	//Create the recursive method
	public static void combinations(int max, ArrayList<Integer>numbers, int add) {
		
		if(add==max){//when the add is equal to number ,show the numbers found
			System.out.println(numbers);
		}else {
			//Use a for cycle to combination
		for (int i=1;i<=max;i++) {
			add = add + i;
			if(add<=max) {//If the addition is less than or equal than number
				numbers.add(i);//add the used number
				combinations(max, numbers, add);//Initialize the recursive
				//when the recursive finalize
				//we must eliminate the number added
				numbers.remove(numbers.indexOf(i));
			}
			//later, subtract to be the way it was
			add = add-i;
		}
		
		}
	}
	
}
