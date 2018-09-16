package java_programs;

public class Jagged_Array {

	public static void main(String[] args) {

		// Program to demonstrate 2-D jagged array in Java 
		
		    
		    { 
		        // Declaring 2-D array with 2 rows 
		        int arr[][] = new int[4][]; 
		  
		        // Making the above array Jagged 
		  
		        // First row has 1 columns 
		        arr[0] = new int[1]; 
		  
		        // Second row has 2 columns 
		        arr[1] = new int[2]; 
		     
		        // Third row has 3 columns 
		        arr[2] = new int[3]; 
		        
		     // Fourth row has 4 columns 
		        arr[3] = new int[4]; 
		  
		        // Initializing array 
		        int count = 0; 
		        for (int i=0; i<arr.length; i++) 
		            for(int j=0; j<arr[i].length; j++) 
		                arr[i][j] = count++; 
		  
		        // Displaying the values of  Jagged array 
		        System.out.println("Contents of Jagged Array"); 
		        for (int i=0; i<arr.length; i++) 
		        { 
		            for (int j=0; j<arr[i].length; j++) 
		                System.out.print(arr[i][j] + " "); 
		            System.out.println(); 
		        } 
		    } }}