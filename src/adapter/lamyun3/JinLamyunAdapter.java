package adapter.lamyun3;

public class JinLamyunAdapter implements Lamyun {

	private JinLamyun jinLamyun;	   
	   
	   public JinLamyunAdapter(JinLamyun jinLamyun) {
	      this.jinLamyun = jinLamyun;
	   }
	   
	   @Override
	   public void cook() {
		   jinLamyun.cook();
		      System.out.println("계란추가");
	   }
}
