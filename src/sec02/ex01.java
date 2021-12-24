package sec02;

import java.util.Scanner;

public class ex01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("1. if, 2. switch");
		
		int num = Integer.parseInt(sc.nextLine()); //num1 입력
		
		if (num==1) {
			System.out.println("num은 1이다"); //num1 첫번째 선택지
			System.out.println("계좌관리 프로그램");
			System.out.println("1.은 계좌생성, 2.계좌삭제 3.입금, 4.출금, 5 계좌조회");
			int num2 = Integer.parseInt(sc.nextLine()); //num2 입력
			
			if(num2==1) {   //num2 두번째 선택지
				System.out.println("계좌생성");
			}else if(num2==2) {
				System.out.println("계좌삭제");
			}else if(num2==3) {
				System.out.println("입금"); //num2==1,2,3,4등 여러개로 만들수있다
			}else if(num2==4) {
				System.out.println("출금");
			}else if(num2==5) {
				System.out.println("계좌조회");
			}
			
		}else if(num==2){
			System.out.println("num은 1이아니다");
			System.out.println("switch");
		}
		

	}

}
