package edu.sum.java.day5;

public class Date {
	int year;
	int month;
	int day;
	
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
