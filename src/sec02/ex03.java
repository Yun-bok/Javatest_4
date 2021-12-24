package sec02;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		

	}
	static Scanner sc = new Scanner(System.in);
	static void for_test() {
		//for (1.초기화식; 2.조건식; 4.증감식) {
		/*               3반복영역
		 * }
		 * 1->2->참->3실행->4->2->참->3실행->4->2->거짓(false) 반복 끝
		 */
		int cnt = Integer.parseInt(sc.nextLine());//반복횟수
		int result = 0;
		for(int i = 1; i<=cnt; i++) {
			System.out.println("i");
			result += i;
		}
		System.out.println(result);
		//1부터~입력받은 숫자가지의 합을 구하는 반복문
	}
	

}
