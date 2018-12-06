package week3_loop;

import java.util.Scanner;

public class CountParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oddCount = 0;
		int evenCount = 0;
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		while(num!=-1){
			if(num%2==1) {
				oddCount++;
			}else {
				evenCount++;
			}
			num = in.nextInt();
		}
		System.out.println(oddCount + " " + evenCount);
	}

}