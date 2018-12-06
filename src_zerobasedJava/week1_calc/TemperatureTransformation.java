package week1_calc;


import java.util.Scanner;

public class TemperatureTransformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fahrenheit = 0;
		int celsius = 0;
		Scanner in = new Scanner(System.in);
		fahrenheit = in.nextInt();
		celsius = (int)((fahrenheit-32)*5/9);
		System.out.println(celsius);
	}

}