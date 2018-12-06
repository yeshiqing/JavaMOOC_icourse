package week7_function;

//本次输出格式上需要注意，如果输入n为素数，输出格式应为n=n，而不仅仅是n
import java.util.Scanner;

public class PrimeFactor {
	public static boolean isPrime(int i) {
		boolean isPrime = true;
		for(int k=2;k<=Math.sqrt(i);k++) {
			if(i%k==0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String originNum = ""+num;
		String ret = "";
		if(isPrime(num)) {
			ret = originNum + "=" + num;
		}else {
			for(int i=2;i<=num;i++) {
				if(isPrime(i)) {
					while(num%i==0) {
						if(ret.equals("")) {
							ret +=i;
						}else {
							ret += "x"+i;
						}
						num = num/i;
					}
					if(num==1) {
						break;
					}
				}
			}
			ret = (originNum + "=" + ret);
		}
		
		System.out.println(ret);
	}
}