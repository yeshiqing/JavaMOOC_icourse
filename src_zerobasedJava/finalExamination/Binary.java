package finalExamination;

//思路：2进制的首位是符号位。若为0，则全部位数为0；若为负数，则首位为1
//题干中有错误，“18，在一个32位的计算机内部被表达为00000000000000000000000000010010。”
import java.util.Scanner;

public class Binary {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String result = "";
		int digit = 0;
		if(num>0) 
		{
			while(num>=2) {
				result = num%2+ result;
				num = (int)(num/2);
			}
			result = num + result;
			digit = 32 - result.length();
		}
		else if(num==0) 
		{
			digit = 32;
		}
		else
		{
			digit = 0;
		}
		System.out.println(digit);
	}
}