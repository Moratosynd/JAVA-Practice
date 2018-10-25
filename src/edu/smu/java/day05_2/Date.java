package edu.smu.java.day052;

public class Date {
	private int year;
	private int month;
	private int day;
	
	public void setYear(int year){
		if(year > 2100) {
			System.out.println("�Է��� ���� �ʹ� Ŀ�� 2100�� ���Ϸ� �Է��ϼ���" );
			return;
		}
		this.year = year;
	}
	
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("���� 1 ~ 12 ���� �Է°��� �մϴ�.");
			return; 
		}
		this.month = month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	Date(){}
	
	Date(int _year, int _month, int _day){
		year = _year;
		month = _month;
		day = _day;
	}
	
	

	@Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
	
}
