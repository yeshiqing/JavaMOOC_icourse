package week3_container;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

class City{
	private ArrayList<String> cities = new ArrayList<String>();
	
	public City() {
		
	}
	
	public void add(String s) {
		cities.add(s);
	}
	
	public String getName(int index) {
		return cities.get(index);
	}
	
	public int getSize() {
		return cities.size();
	}
	
	public int getIndex(String city) {
		for(int i=0;i<cities.size();i++) {
			if(cities.get(i).equals(city)){
				return i;
			}
		}
		return -1;
	}
	
	public String[] list() {
		String[] a = new String[cities.size()];
		return cities.toArray(a);
	}
	public String toString() {
		String s = "";
		for(String c : cities) {
			s += " " + c;
		}
		return s;
	}
}

class CityDistances{
	private HashMap<String, int[]> cityDistances = new HashMap<String, int[]>();
	private City city = null;
	
	public CityDistances(City city) {
		this.city = city;
	}
	public void add(String city, int[] d) {
		cityDistances.put(city, d);
	}
	public int getDist(String city1, String city2) {
		int[] d = cityDistances.get(city1);
		int i = city.getIndex(city2);
		return d[i];
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		City city = new City(); 
		CityDistances cityDistances = new CityDistances(city);
		
		int cityCount = 0;
		String str = null;
		do {
			str = in.next();
			if(!str.equals("###")){
				cityCount++;
				city.add(str);
			}
		}while(!str.equals("###"));
		
		
		int n = 0;//the input number
		int i = 0;//the index of the input number
		int[] dis = new int[cityCount];
		do {
			n = in.nextInt();
			dis[i%cityCount]=n;
			if(i%cityCount==cityCount-1) {
				cityDistances.add(city.getName(i/cityCount), dis);
				dis = new int[cityCount];
			}
			i++;
		}while(i<=(int)(Math.pow(cityCount, 2)-1));
		
		String city1 = in.next();
		String city2 = in.next();
		int distance = cityDistances.getDist(city1, city2);
		
		System.out.println(distance);
	}
}
