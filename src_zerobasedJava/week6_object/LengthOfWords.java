package week6_object;

import java.util.Scanner;

public class LengthOfWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s;
		String result="";
		do {
			s = in.next();
			if(s.charAt(s.length()-1)!='.') {
				result += s.length() + " ";
			}else {
				result += s.length()-1;
			}
		}while(s.charAt(s.length()-1) != '.');
		if(!result.equals("0")) {
			System.out.println(result.trim());			
		}
	}
}