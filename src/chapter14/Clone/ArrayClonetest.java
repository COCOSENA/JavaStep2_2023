package chapter14.Clone;

public class ArrayClonetest {

	public static void main(String[] args) {
	
		int[] arr1 = {1, 2, 3, 4, 5} ;
		int[] arr2;
		
		arr2=arr1.clone(); //clone 값 덮어쓰기
		System.out.println("복사된 arr2 배열");
		for(int num: arr2) {
			System.out.print(num + " " );
		}
		System.out.println();
		arr2[3]=0;
		System.out.println("변경 후 arr1 배열" );
		for(int num: arr1) {
			System.out.print(num + " " );
		}
		System.out.println("변경 후 arr2 배열" );
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+ " " );
		}
	}

}