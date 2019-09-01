
package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	
	
	
	public static void main(String[] args) {
		Random rand= new Random();
		//1. make an array of 5 Strings
	    String[] names= {"hello","ho","jospe", "skljfalsdf0"};
	    
	    
	    System.out.println(names[2]);
		
		//2. print the third element in the array
		
		//3. set the third element to a different value'
	    names[2]="slkjdf";
	    System.out.println(names[2]);
	    
	    
		
		//4. print the third element again
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
	    for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	    
	    
		
		//6. make an array of 50 integers
		
	    int[] values= new int[50];
	    
		//7. use a for loop to make every value of the integer array a random number
		for(int i=0; i<50; i++) {
			int x= rand.nextInt(100);
			values[i]=x;
		}
		
		for(int j=0; j<values.length; j++) {
			if(j<49&&values[j]<values[j+1]){
				values[j+1]=values[j];
			}
			
		}
		System.out.println(values[49]);
		
	    
	    
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
