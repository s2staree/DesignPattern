package adapter.lamyun2;

public class JinLamyunAdapter implements Lamyun {
	
	private JinLamyun jinLamyun;
	
	public JinLamyunAdapter(JinLamyun jinLamyun) {
		this.jinLamyun = jinLamyun;
	}

	@Override
	public String cook() {
		System.out.println("계란 추가");
		return jinLamyun.cook();
	}

}
