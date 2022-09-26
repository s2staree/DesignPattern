package adapter.ex01;

// 고객의 클레임 받기
// 사과 이메일 보내기
// 이메일 답장을 DB에 저장하기

public class CustomerService {
	
	private EmailSend email;

	public CustomerService(EmailSend email) {
		this.email = email;
	}

	public void acceptClaim(String msg) {
		
		// 1. 클레임 받기
		String acceptMsg = msg;
		System.out.println("클레님 내용 : " + acceptMsg);
		
		// 2. 이메일 보내기
		sendEmail();
	}
	
	public void sendEmail() {
		String result = email.send();
		insertResultEmail(result);
	}
	
	public void insertResultEmail(String result) {
		System.out.println("답장을 DB에 저장했습니다 : " + result);
	}
}
