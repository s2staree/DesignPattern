package adapter.lamyun1;

public class JinLamyun implements Lamyun {
	
	private final String NAME = "진라면";
	
	@Override
	public String cook(){
		System.out.println("계란 추가");
		return NAME;
	}
}
