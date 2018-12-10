package week1_class;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Fraction a = new Fraction(in.nextInt(), in.nextInt());

		Fraction b = new Fraction(in.nextInt(), in.nextInt());

		a.print();

		b.print();

		a.plus(b).print();

		a.multiply(b).plus(new Fraction(5, 6)).print();

		a.print();

		b.print();

		in.close();

	}

}

class Fraction {
	int a;// 分子
	int b;// 分母

	int gcd(int num, int deno) { // 找到最大公约数(greatest common divisor)
		int max = Math.max(num, deno);
		int divisor = 1;
		for (int i = max; i > -1; i--) {
			if (num % i == 0 && deno % i == 0) {
				divisor = i;
				break;
			}
		}
		return divisor;
	}
	
	double toDouble() //将分数转换为double
	{
        return a * 1.0 / b;
	}

	Fraction(int a, int b) {
		int d = gcd(a, b);
		this.a = a / d;
		this.b = b / d;
	}

	Fraction plus(Fraction r) {
		int a = this.a * r.b + this.b * r.a;
		int b = this.b * r.b;
		return new Fraction(a, b);
	}

	Fraction multiply(Fraction r) {
		int a = this.a*r.a;
		int b = this.b*r.b;
		return new Fraction(a, b);
	}

	void print() {
		String result = a + "/" + b;
		if(a==b) {
			result = "1";
		}
		System.out.println(result);
	}
}