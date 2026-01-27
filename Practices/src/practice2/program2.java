package practice2;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student p1 = new Student("24B032128","Islam");
		
		StartTriangle t = new StartTriangle(3);
//		System.out.println(t.toString());
		Time time = new Time(23, 10, 3);
		Time t1 = new Time(5, 5, 1);
		time.add(t1);
		System.out.println(time.toUniversal());
	}

}

class Student{
	private String name;
	private String ID;
	private int yearOfStudy;
	
	public Student(String id, String name) {
		this.ID = id;
		this.name = name;
	}
	
	public void increment() {
		this.yearOfStudy += 1;
	}
	
	
}

class StartTriangle{
	
	private int width;
	
	public StartTriangle(int width) {
		this.width = width;
	}
	
	public String toString() {
		
		String a = "";
		
		for(int i = 1; i <= this.width; i++) {
			for(int j = 1; j <= i; j++) {
				a += "[*]";
			}
			a += "\n";
		}
		
		return a;
	}
	
}

class Time{
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		if(hour > 23 || minute > 59 || second > 59) {
			System.out.println("Invalid value");
			return;
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	
	public String toUniversal() {
		String a = this.toString(this.hour, this.minute, this.second);
		return a;
		
	}
	
	public String toStandart() {
		String a = this.toString(this.hour % 12, this.minute, this.second);
		return a;
	}
	
	public void add(Time time) {
		
		int tHour = time.hour + this.hour;
		int tMinute = time.minute + this.minute;
		int tSecond = time.second + this.second;
		
		if(tHour > 23 || tMinute> 59 || tSecond > 59) {
			System.out.println("Invalid value");
			return;
		}
		
		this.hour += time.hour;
		this.minute += time.minute;
		this.second += time.second;
		
		
	}
	
	private String toString(int hour, int minute, int second) {
		String tHour;
		String tMinute;
		String tSecond;
		
		if(hour < 10) {
			tHour = "0" +  String.valueOf(hour);			
		}else {
			tHour = String.valueOf(hour);
		}
		
		if(minute < 10) {
			tMinute = "0" +  String.valueOf(minute);
		}else {
			tMinute = String.valueOf(minute);
		}	
		
		if(second < 10) {
			tSecond = "0" +  String.valueOf(second);
		}else {
			tSecond = String.valueOf(second);
		}
		return tHour + ':' + tMinute + ':' + tSecond;
	}
}
