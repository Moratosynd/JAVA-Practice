package edu.smu.java.day052;

public class Date {
	private int year;
	private int month;
	private int day;
	
	public void setYear(int year){
		if(year > 2100) {
			System.out.println("입력한 값이 너무 커요 2100년 이하로 입력하세요" );
			return;
		}
		this.year = year;
	}
	
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("월은 1 ~ 12 까지 입력가능 합니다.");
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
