package ch10.exam06;

public class NoAccountException extends RuntimeException {
	public NoAccountException() {};
	public NoAccountException(String message) {
		super(message);
	};
}
