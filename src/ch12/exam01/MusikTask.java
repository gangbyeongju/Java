package ch12.exam01;

public class MusikTask implements Runnable {
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
