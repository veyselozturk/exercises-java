package throwDemo;
public class Main {
	public static void main(String[] args){
		AccountManager manager = new AccountManager();
		System.out.println("Hesaptaki para = " + manager.getBalance());
		manager.deposit(100);
		System.out.println("Hesaptaki para = " + manager.getBalance());
	//para çekerken içerideki miktarı kontrol edip eksikse hata fırlat
		try {
			manager.withdraw(90);
		} catch (BalanceInsufficentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hesaptaki para = " + manager.getBalance());
		try {
			manager.withdraw(20);
		} catch (BalanceInsufficentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hesaptaki para = " + manager.getBalance());
	}
}
