package Sena_Prac;

public class IfExample {

	public static void main(String[] args) {
		
		int num;
		int sum=0;
		
		for(num=0; ;num++) {
			sum+=num;
			if(sum >=500)
				break ;
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}
		}//m



