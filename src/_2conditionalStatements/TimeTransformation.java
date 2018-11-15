package _2conditionalStatements;

import java.util.Scanner;

public class TimeTransformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bjt;
		int utc;
		Scanner in = new Scanner(System.in);
		bjt = in.nextInt();
		int hour = bjt/100;
		int minute = bjt%100;
//		System.out.println(hour);
//		System.out.println(minute);
		if(hour<8) {
			utc = (24-(8-hour))*100+minute;
		}
		else {
			utc = (hour-8)*100+minute;
		}
		System.out.println(utc);;
	}

}


