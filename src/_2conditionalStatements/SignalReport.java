package _2conditionalStatements;

import java.util.Scanner;

public class SignalReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		int s;
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		r = input / 10;
		s = input % 10;
//		System.out.println(r);
//		System.out.println(s);
		String readability = null;
		String strength = null;

		switch (r) {
		case 1:
			readability = "Unreadable";
			break;
		case 2:
			readability = "Barely readable, occasional words distinguishable";
			break;
		case 3:
			readability = "Readable with considerable difficulty";
			break;
		case 4:
			readability = "Readable with practically no difficulty";
			break;
		case 5:
			readability = "Perfectly readable";
			break;
		}

		switch (s) {
		case 1:
			strength = "Faint signals, barely perceptible";
			break;
		case 2:
			strength = "Very weak signals";
			break;
		case 3:
			strength = "Weak signals";
			break;
		case 4:
			strength = "Fair signals";
			break;
		case 5:
			strength = "Fairly good signals";
			break;
		case 6:
			strength = "Good signals";
			break;
		case 7:
			strength = "Moderately strong signals";
			break;
		case 8:
			strength = "Strong signals";
			break;
		case 9:
			strength = "Extremely strong signals";
			break;
		}

		System.out.println(strength + ", " + readability.toLowerCase() + ".");
	}

}