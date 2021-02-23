package ch08.exam01;

public class Television implements RemoteControl {
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	};
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	};
	public void setVolume(int volume) {
		System.out.println("TV 볼륨을 " + volume + "로 조정합니다.");
	};
}
