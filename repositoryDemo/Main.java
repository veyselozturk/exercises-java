package repositoryDemo;

public class Main {

	public static void main(String[] args) {
		// repository veri tabanı işlemlerinde kullanılır.
		Validator validator = new Validator();
		Customer customer = new Customer();
		validator.validate(customer);
	}

}
