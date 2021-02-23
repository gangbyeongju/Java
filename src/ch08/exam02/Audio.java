package ch08.exam02;

public class Audio implements RemoteControl {
	//Field
	private int volume;
	
	//Constructor
	
	//Method
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
		if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		System.out.println("Audio 볼륨을 " + this.volume + "로 조절합니다.");
	}
	
}
