package sec02;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		

	}
	static Scanner sc = new Scanner(System.in);
	static void for_test() {
		//for (1.�ʱ�ȭ��; 2.���ǽ�; 4.������) {
		/*               3�ݺ�����
		 * }
		 * 1->2->��->3����->4->2->��->3����->4->2->����(false) �ݺ� ��
		 */
		int cnt = Integer.parseInt(sc.nextLine());//�ݺ�Ƚ��
		int result = 0;
		for(int i = 1; i<=cnt; i++) {
			System.out.println("i");
			result += i;
		}
		System.out.println(result);
		//1����~�Է¹��� ���ڰ����� ���� ���ϴ� �ݺ���
	}
	

}
