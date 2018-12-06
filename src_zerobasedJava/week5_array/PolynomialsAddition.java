package week5_array;

//测试用例 
//0 20 100 2 0 30 //边界100问题
//0 20 100 1 0 30 //系数为1的情况，1作为系数时应该省去
//0 20 100 -1 0 30 //系数为-1的情况（预设的4个测试用例都没有考虑到这个）
//0 1  100 1 99 -2 0 1 //系数为负数的情况会出现x100+-2x99+x1+2问题
//0 1  1 1  0 1  //幂次为1的情况
//0 0 0 0 //多项式系数全部为0

import java.util.Scanner;

public class PolynomialsAddition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 思路：
		 * 由于题目给了『程序要处理的幂最大为100。』限定条件，所以初始化一个范围在100以内的数组。
		 * 系数当做数组的值，幂次当做数组下标进行计算，这样不会出现越界问题。
		 */
		Scanner in = new Scanner(System.in);
		int exp = 0;//幂次exponent
		int coe = 0;//系数coefficient
		int count = 2;//多项式个数,根据题目条件，每个多项式肯定有常数项，以此判断多项式是否读入完毕。
		String result = "";
		
		//构造数组读入多项式，读入结果为两个多项式相加之后的结果
		int[]a = new int[101];
		for(;count>0;count--) {
			do{
				exp = in.nextInt();
				coe = in.nextInt();
				a[exp] += coe;
			}while(exp!=0);
		}
		
		boolean execFor = false;
		boolean isZero = true;
		for(int j=a.length-1;j>-1;j--) { //a[j]是系数,j是幂次
			if(a[j]!=0) {
				isZero = false;
				if(execFor && a[j]>0) {
					result += "+";
				}
				execFor = true;
				
				//依次输出“系数x幂次”，但遇到系数为1和-1要省去"1"，幂次为0时"x”不输出且{幂次}不输出，幂次为1时只输出x不输出幂次
				if(a[j]!=1) {
					if(a[j]==-1) {
						result+="-";
					}else {
						result += a[j];
					}
				}
				if(j!=0) {
					result += "x";
				}
				if(j!=1 && j!=0) {
					result += j;
				}
				
				execFor = true;
			}
		}
		if(isZero) {
			result = "0";
		}
		System.out.println(result);
	}
}