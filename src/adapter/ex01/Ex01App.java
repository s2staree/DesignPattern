package adapter.ex01;

public class Ex01App {

	public static void main(String[] args) {

		CustomerService cs = new CustomerService(new EmailAdapter());
		cs.acceptClaim("마음에 안 들어");

	}

}
