package sec02;

import java.io.IOException;

public class ex07 {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//WhilePrintFrom1To100Example();
		//WhileKeyControlExample();
		dowhile_test();

	}

	static void WhilePrintFrom1To10Example() {
		int i = 1;
		while (i <= 10) { // 1 ~ 10 10�� �ݺ�
			// i �� ���氪 ���
			System.out.println(i);
			// i +1����
			i++;// 10�� �ݺ�
		}
	}

	static void WhilePrintFrom1To100Example() {
		int sum = 0;

		int i = 1;

		while (i <= 100) { // ~100
			sum += i; // ��
			i++;// i =1 1���� 1~100 100�� �ݺ�
		}
		// i = 101�̳���
		System.out.println("1~" + (i - 1) + "�� :" + sum);
	}

	static void WhileKeyControlExample() {
		boolean run =true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode!=10) {
				System.out.println("----------");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("----------");
				System.out.println("���±� ");
				
			}
		
		}
	
		try {
			keyCode = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		if(keyCode==49) {
			speed++;
			System.out.println("���� �ӵ� =" +speed);
		}else if(keyCode ==50) {
			speed--;
			System.out.println("���� �ӵ� =" +speed);
		}else if(keyCode ==51) {
			run =false;
		}
	
		
		System.out.println("���α׷� ����");
	
	}
	static void dowhile_test() {
		//do{
		//		1.�ݺ�����
		//}while(2.���ǽ�);
		//1(�ѹ��� ������ ����) -> 2 -> true -> 1���� ->2 ->false(����)-> �ݺ� ����
		//1.������ ����
		int cnt = Integer.parseInt(sc.nextLine());
		int i = 1, result = 0;
		do {
			System.out.println(i);
			result += i;
			i++;
			
		}while(i<=cnt);
		System.out.println(result);
		
		
	}
	
}
