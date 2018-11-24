package week7_function;

import java.util.Scanner;

public class PerfectNum {
	public static boolean isPerfect(int i) {
		boolean isPerfect = true;
		int sum = 0;
		for(int j=1;j<i;j++) 
		{
			if(i%j==0)
			{
				sum += j;
			}
			if(sum>i) {
				isPerfect = false;
				break;
			}
		}
		if(sum != i) {
			isPerfect = false;
		}
		
		return isPerfect;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		String result = "";
		for(int i=n;i<=m;i++) 
		{
			if(isPerfect(i)) 
			{
				result += " "+i;
			}
		}
		if(result.equals("")) 
		{
			System.out.println("");
		}
		else {
			System.out.println(result.trim());
		}
	}
}