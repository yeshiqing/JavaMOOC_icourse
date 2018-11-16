package week4_loopControl;

import java.util.Scanner;

public class SumOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 该题目的收获：我一开始写思路较乱，我是先画的流程图，然后开始写
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		int count =0; //第几个素数
		int sum =0;
		for(int num=2;;num++) {
			if(count>=m) {
				break;
			}else {
				//判断是否为素数
				boolean isPrime = true; 
				for(int i=2;i<num;i++) {
					if(num%i==0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime) {
					count++;
				}
				if(count>=n&&count<=m && isPrime) {
					sum+=num;
				}
			}
		}
		System.out.println(sum);
			
	}

}



