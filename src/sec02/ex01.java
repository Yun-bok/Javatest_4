package sec02;

import java.util.Scanner;

public class ex01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("1. if, 2. switch");
		
		int num = Integer.parseInt(sc.nextLine()); //num1 �Է�
		
		if (num==1) {
			System.out.println("num�� 1�̴�"); //num1 ù��° ������
			System.out.println("���°��� ���α׷�");
			System.out.println("1.�� ���»���, 2.���»��� 3.�Ա�, 4.���, 5 ������ȸ");
			int num2 = Integer.parseInt(sc.nextLine()); //num2 �Է�
			
			if(num2==1) {   //num2 �ι�° ������
				System.out.println("���»���");
			}else if(num2==2) {
				System.out.println("���»���");
			}else if(num2==3) {
				System.out.println("�Ա�"); //num2==1,2,3,4�� �������� ������ִ�
			}else if(num2==4) {
				System.out.println("���");
			}else if(num2==5) {
				System.out.println("������ȸ");
			}
			
		}else if(num==2){
			System.out.println("num�� 1�̾ƴϴ�");
			System.out.println("switch");
		}
		

	}

}
