package throwDemo;
// CUSTOM EXCEPTION YAZMAK
@SuppressWarnings("serial")
public class BalanceInsufficentException
					extends Exception {
	// Yetersiz Bakiye Hatası
	String message;
	
	public BalanceInsufficentException
					(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
