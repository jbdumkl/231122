package Ch04_2;

public class ForTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// *****
		// *****
		// *****
		// 위의 별모양을 이중 for문을 사용하여 출력하시오.
		for (int i=1; i<=3;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println(); // 다음줄로 내려주는 역할 만
		}

		// *
		// **
		// ***
		// ****
		// *****

		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(); // 다음줄로 내려주는 역할만 함
		}
		
//		String str=null;
//		System.out.print(str);
//		int[] arr = null;
//		System.out.println(arr[0]);
		
		String a = "홍길동";
		String b = "홍길동";
		String c = new String("홍길동");
		
		if (a == c) {
			System.out.print("참");
		} else {
			System.out.print("거짓");
		}
	}

}
