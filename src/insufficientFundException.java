
public class insufficientFundException extends Exception {

	public insufficientFundException(Throwable cause) {
		
		super("Insufficient balance", cause);
	
	}
}
