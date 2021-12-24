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
		//while( 1. 조건식) {
		//       2.반복영역
		//}
		//1-참 ->2실행 ->1-> 참 2실행 ->1 ->거짓(false) 반복끝
		//일반적으로 while 위에 조건식에 사용될 변수선언
		//2반복영역에서 증감식 (변수의 값을 변경)
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
			System.out.println("1.계좌생성, 2.계좌삭제, 3.종료");
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				System.out.println("계좌생성");
				break;
			case 2:
				System.out.println("계좌삭제");
				break;
			case 3:
				System.out.println("종료");
				boolean_val = false;
			}
		}
		
	}

}
