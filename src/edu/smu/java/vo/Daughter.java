package edu.smu.java.vo;

public class Daughter extends Father{

	@Override
	public int makemoney(int time) {
		// TODO Auto-generated method stub
		return super.makemoney(time) + 1000;
	}
	// 확장
	public String makeup(int time) {
		return time + " 시간 화장했어요";
	}
	
}
