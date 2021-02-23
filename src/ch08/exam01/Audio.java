package ch08.exam01;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Audio 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("Audio 볼륨을 " + volume + "로 조절합니다.");
	}
	
}
