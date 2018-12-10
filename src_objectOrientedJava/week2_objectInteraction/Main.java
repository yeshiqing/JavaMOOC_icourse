package week2_objectInteraction;

public class Main {
	public static void main(String[] args) {

		java.util.Scanner in = new java.util.Scanner(System.in);

		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());

		clock.tick();

		System.out.println(clock);

		in.close();
	}
}

class Display {
	private int value = 0;
	private int limit = 0;

	public Display(int limit) {
		this.limit = limit;
	}
	public boolean increase() {
		this.value++;
		if(value == limit) {
			this.value = 0;
			return true;
		}
		return false;
	}
	public int getValue() {
		return this.value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}

class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display second = new Display(60);
	
	public Clock(int hour, int minute, int second) {
		this.hour.setValue(hour);
		this.minute.setValue(minute);
		this.second.setValue(second);
	}
	
	public void tick() {
		if(this.second.increase()) {
			if(this.minute.increase()){
				this.hour.increase();
			}
		}
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", this.hour.getValue(), this.minute.getValue(), this.second.getValue());
	}
}