package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Greatest value: ");
		int n = in.nextInt();
		
		boolean[] dataSet = new boolean[n];
		
		
//		int specific = 7;
		
		for(int specific = 2; specific <= n; specific++) 
		{
		//prove whether a given specific number is prime or not 
		boolean is_prime = true;
		for (int i = 2; i  < specific ; i++) {
			if (specific % i==0)
			{
				is_prime = false;
				//System.out.println("is prime?"+ is_prime)
				break;
			}
			is_prime = true;
			}	
		
		
			System.out.println(specific + "is prime?"+ is_prime);
			dataSet[specific -1 ] = is_prime;
		
		}
		
		
//		for (int i=0; i<n; i++)
		{
		//System.out.println(dataSet[i]);
		}
	}
}
