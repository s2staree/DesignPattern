package adapter.lamyun2;

public class JinLamyun implements Lamyun {
	
	private final String NAME = "진라면";
	
	@Override
	public String cook(){
		System.out.println("라면 완성");
		return NAME;
	}
}
