package Ch04_2;
import java.util.Iterator;
public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 1000까지 합을 구하는 for문을 작성하시오.
		int sum = 0;
		for (int i = 1;i<1001;i++) {
			sum = sum + i;// 누적합계
		}
		System.out.println("sum = " + sum);
	}

}
