package week6_object;
// 测试用例 $GPRMC,024813.640,A,3158.4608,N,11848.3737,E,10.05,324.27,150706,,,A*50

import java.util.Scanner;

public class GPS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String gps = "";
		Character status;
		int checkValue;
		int checkVal;
		String utc = "";
		String bjt = "";
		
		while(!gps.equals("END")){
			gps = in.nextLine();
			if(gps.startsWith("$GPRMC")) {
				status = gps.charAt(gps.indexOf(',',gps.indexOf(',')+1)+1);//状态值 注意这里如果写作gps.charAt(18);会不成功，很好奇它的测试用例？
				utc = gps.substring(7, 13);
				checkValue = Integer.parseInt(gps.substring(gps.indexOf("*")+1), 16); //校验值
				
				checkVal = gps.charAt(1);
				for(int i=2;i<gps.indexOf("*");i++) {
					checkVal ^= gps.charAt(i);
				}
				checkVal = checkVal%65536;// 算出异或值
				
				if(checkVal == checkValue && status=='A') {
					String utcH = utc.substring(0, 2);
					String utcM = utc.substring(2, 4);
					String utcS = utc.substring(4, 6);
					if(Integer.parseInt(utcH)<16){
						bjt = "" + (Integer.parseInt(utcH) + 8) + ":" + utcM + ":" + utcS;
					}else {
						bjt = "0" + (Integer.parseInt(utcH) + 8 - 24) + ":" + utcM + ":" + utcS;
					}
				}
			}
		}
		
		
		System.out.println(bjt);
	}
}