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
		while (i <= 10) { // 1 ~ 10 10번 반복
			// i 의 변경값 출력
			System.out.println(i);
			// i +1증가
			i++;// 10번 반복
		}
	}

	static void WhilePrintFrom1To100Example() {
		int sum = 0;

		int i = 1;

		while (i <= 100) { // ~100
			sum += i; // 합
			i++;// i =1 1증가 1~100 100번 반복
		}
		// i = 101이나옴
		System.out.println("1~" + (i - 1) + "합 :" + sum);
	}

	static void WhileKeyControlExample() {
		boolean run =true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode!=10) {
				System.out.println("----------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("----------");
				System.out.println("선태기 ");
				
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
			System.out.println("현재 속도 =" +speed);
		}else if(keyCode ==50) {
			speed--;
			System.out.println("현재 속도 =" +speed);
		}else if(keyCode ==51) {
			run =false;
		}
	
		
		System.out.println("프로그램 종료");
	
	}
	static void dowhile_test() {
		//do{
		//		1.반복영역
		//}while(2.조건식);
		//1(한번은 무조건 실행) -> 2 -> true -> 1실행 ->2 ->false(거짓)-> 반복 종류
		//1.증감식 포함
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
