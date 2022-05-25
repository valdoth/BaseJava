package pratique.exceptions;

public class RationalException extends IllegalArgumentException {

	private static final long serialVersionUID = 1L;

	public RationalException() {
		this("Denominator cannot be null");
	}

	

	public RationalException(String message) {
		super(message);
	}

	/*
	public RationalException(String message, Throwable cause) {
		super(message, cause);
	}
	public RationalException(Throwable cause) {
		super(cause);
	}
	*/
	
	// other methods
	
}