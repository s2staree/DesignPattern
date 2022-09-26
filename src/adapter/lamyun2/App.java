package adapter.lamyun2;

public class App {

	public static void main(String[] args) {
		JinLamyunAdapter jla = new JinLamyunAdapter(new JinLamyun());
		jla.cook();
	}

}
