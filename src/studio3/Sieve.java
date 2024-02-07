package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Up to what number do you want to find the primes?");
		int n = in.nextInt();
		
		boolean array[];
		array = new boolean[n+1];
		
		for(int i = 2; i < n; i++) {
			
			if(array[i] != true) {
				for(int j = i; j*i < n+1; j++) {
					System.out.println(j*i);
					int index = j*i;
					array[index] = true;
				}
			}
		
				
			
			
		}
		for(int i = 0; i < n; i++) {
			if(array[i] == false) {
				System.out.println(array[i]);
			}
		}
		
		
		
		

	}

}
