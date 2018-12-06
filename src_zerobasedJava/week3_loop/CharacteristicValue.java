package week3_loop;

import java.util.Scanner;

public class CharacteristicValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int digit = 0;
		int unit=0;
		int result=0;
		int binaryToDecimal = 1;
		do{
			unit = number%10;
			number=number/10;
			digit++;
			if(unit%2==digit%2) {
				result = result + binaryToDecimal;
			}
			binaryToDecimal = binaryToDecimal*2;
		}while(number>0);
		System.out.println(result);
	}

}