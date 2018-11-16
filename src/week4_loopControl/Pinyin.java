package week4_loopControl;

import java.util.Scanner;

public class Pinyin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//第一次提交报错，题目要求末尾不含空格。
		//第二次提交用例一未通过，我想到了边界验证的问题，未考虑0
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		String pinin = "";
		String prefix = "";
		if(a<0) {
			prefix = "fu ";
			a = -a;
		}
		
		do{
			switch(a%10) {
			case 1:
				pinin = "yi " + pinin;
				break;
			case 2:
				pinin = "er " + pinin;
				break;
			case 3:
				pinin = "san " + pinin;
				break;
			case 4:
				pinin = "si " + pinin;
				break;
			case 5:
				pinin = "wu " + pinin;
				break;
			case 6:
				pinin = "liu " + pinin;
				break;
			case 7:
				pinin = "qi " + pinin;
				break;
			case 8:
				pinin = "ba " + pinin;
				break;
			case 9:
				pinin = "jiu "+ pinin;
				break;
			case 0:
				pinin = "ling "+ pinin;
				break;
			}
			a=a/10;
		}while(a!=0);
		System.out.println((prefix + pinin).trim());
	}

}