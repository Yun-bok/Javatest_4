package sec02;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 ㅋㅋ를 입력하세요.");

		Scanner scanner = new Scanner(System.in);
		String inputString;

		do {
			System.out.println("ㄴ->");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("ㅋㅋ"));

		System.out.println();
		System.out.println("프로그램 종료");

	}

}
