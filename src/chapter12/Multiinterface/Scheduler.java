package chapter12.Multiinterface;

public interface Scheduler {
	
	//다음 고객의 콜 가져오기
	public void getNextCall();
	//상담원에게 콜 전달
	public void sendCallToAgent();
	
}

//인터페이스 스케줄 - 설계도면 