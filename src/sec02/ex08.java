package sec02;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� ������ �Է��ϼ���.");

		Scanner scanner = new Scanner(System.in);
		String inputString;

		do {
			System.out.println("��->");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("����"));

		System.out.println();
		System.out.println("���α׷� ����");

	}

}
