package sec02;

import java.util.Scanner;

public class ex06test {
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		

	}
	
	static void for_test () {
		int cnt = Integer.parseInt(sc.nextLine());
		int result;
		
	}
	static void while_test() {
		//while( 1. ���ǽ�) {
		//       2.�ݺ�����
		//}
		//1-�� ->2���� ->1-> �� 2���� ->1 ->����(false) �ݺ���
		//�Ϲ������� while ���� ���ǽĿ� ���� ��������
		//2�ݺ��������� ������ (������ ���� ����)
		int cnt = Integer.parseInt(sc.nextLine());
		int i = 1, result = 0;
		while(i<=cnt) {
			System.out.println(i);
			result += i;
			i++;
		}
		System.out.println(result);
	}
	static void while_test2() {
		boolean boolean_val = true;
		while(boolean_val) {
			System.out.println("1.���»���, 2.���»���, 3.����");
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				System.out.println("���»���");
				break;
			case 2:
				System.out.println("���»���");
				break;
			case 3:
				System.out.println("����");
				boolean_val = false;
			}
		}
		
	}

}
