package project.mvc.model.exception;

public class MyErrorException extends RuntimeException {
	private static final long serialVersionUID = 3236327982228006374L;

	public MyErrorException() {
		super();
	}
	
	public MyErrorException(String message) {
		super(message);
	}
}
