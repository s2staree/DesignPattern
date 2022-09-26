package adapter.lamyun1;

public class App {

	public static void main(String[] args) {
		LamyunPot lp = new LamyunPot();
//		lp.boil(new JinLamyun());
		lp.boil(new JinLamyunAdapter(new JinLamyun()));
	}

}
