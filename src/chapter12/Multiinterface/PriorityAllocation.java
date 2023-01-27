package chapter12.Multiinterface;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 순서대로 대기열에서 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill 값이 가장 높은 상담원에게 우선적으로 배분합니다.");
		
	}

	
}