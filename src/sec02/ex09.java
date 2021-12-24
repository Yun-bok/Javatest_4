package sec02;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {

	}

	static void break_test() {
		// break
		// 반본(가장 가까운 한개 종료) or Switch문 종료
		int cnt = Integer.parseInt(sc.nextLine());
		int result = 0;

		for (int i = 1; i <= cnt; i++) {
			System.out.println(i);
			result += i;
			if (result >= 5) {
				break;
			}
		}
		System.out.println(result);
	}
	static void break_test2() {
		int cnt = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=cnt; i++) {
			for(int j=1; j<=i; j++) {
				System.out.println("*");
				
			}
			System.out.println();
		}
	}

}
