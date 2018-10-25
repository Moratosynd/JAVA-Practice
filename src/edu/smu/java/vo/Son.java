package edu.smu.java.vo;
	
public class Son extends Father{
	public int value = 30;
	// 일반상속
//	public String cleanning(int time) {
//		return time+" 시간 청소했어요";
//	}
	// 재정의(상속을 기반으로)
	public int makemoney(int time) {
		return time * value;
	}
	// 확장
	public String enjoy(int time) {
		return time+" 시간 놀았어요";
	}
}
