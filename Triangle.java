
package com.ub.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Triangle {

	
	// Function for finding maximum sum 
	static int maxSum(int t[][], int a, int b) 
	{ 
		// for loop for bottom-up calculation 
		for (int i = a - 1; i >= 0; i--) 
		{ 
			for (int j = 0; j <= i; j++) 
			{ 
				// for each element, compare two numbers next to each other just below the element 
				// comparing and finding the maximum number
				if (t[i + 1][j] > t[i + 1][j + 1]) 
					t[i][j] += t[i + 1][j]; 
				else 
					// adding the maximum of the two numbers to the element
					t[i][j] += t[i + 1][j + 1]; 
			} 
		} 
	
		// return the top element 
		// which stores the maximum sum 
		return t[0][0]; 
	}

	
		
	public static void main(String[] args) 
		    throws FileNotFoundException 
		{ 
		  // Creating a file reference object
			File file = new File("C:\\Users\\shash\\Downloads\\triangle.txt");
			
			// Creating a scanner object to access data from the file
			Scanner sc = new Scanner(file); 
			
			//Creating a two dimensional array
		    int[][] triangle = new int[100][100];
			for (int i = 0; i < 100; i++) 
			{
				for (int j = 0 ; j < i +1 && sc.hasNext() ;j++)
				{
					triangle[i][j] = sc.nextInt();
				}
			}
			//For loop used to display the matrix 
			/*for (int i = 0; i < 99; i++) 
			{
				for (int j = 0 ; j < 99 ;j++)
				{
					System.out.print(triangle[i][j]+" ");
					
				}
				System.out.println();
			}*/
			
			System.out.print(Triangle.maxSum(triangle, 99, 99));
		   
		}
		}

	

