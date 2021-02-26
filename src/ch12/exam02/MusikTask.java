package ch12.exam02;

public class MusikTask extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("뮤직을 연주합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
