package adapter.ex01;

// 가짜 객체 만들기
public class EmailAdapter implements EmailSend {

	@Override
	public String send() {

		return "고맙습니다";
	}
}
