package project.mvc.model.exception;

public class MyErrorException extends RuntimeException {

	public MyErrorException() {
		super();
	}
	
	public MyErrorException(String message) {
		super(message);
	}
}
