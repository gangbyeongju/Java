package ch08.exam02;

public interface RemoteControl {
	//상수  //public static final 생략
	String COMPANY = "삼성";
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	
	//메소드(객체 사용 설명)  //public abstract 생략
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
