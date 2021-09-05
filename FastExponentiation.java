package com.recursion;

public class FastExponentiation {
	
	public static void main(String args[]) {
		
		//find 2 to the power n 
		int n = 5;
		System.out.println("2 to the power "+n+" = "+exponent(n));
	}
	
	public static int exponent(int n) {
		
		if(n == 0) {
			return 1;//2 to the power 0 is 1
		}
		
		int ans = exponent(n/2);
		if(n%2 == 0)
			return ans*ans;
		return 2*ans*ans;
	}

}
