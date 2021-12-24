package sec02;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		//Q3();
		//Q4();
		
		
		// TODO Auto-generated method stub
		// 1부터 입력받은 숫자까지의 짝수와 홀수의 합을 출력하시오.
		//짝수:??? 홀수:???
		//수를 입력받아 5의 배수인지 아닌지를 출력해주는 프로그램을 만들기
		// 7
		//과자의 개당가격은 2000원이다. 10개 초과하면 개당 1500원의
		//가격으로 과자를 구매할수있다 과자의 갯수를 입력받아 금액을 출력하세요
		//10 20000 22 16500
		
		//1부터7까지의 숫자를 받아서 해당하는 요일을 출력해주세요
		//출력물 1월 2화
		
		/*
		 * q1
		 * 
		 *  *
		 *  **
		 *  ***
		 *  ****
		 * 
		 * Q2 다음출력문이나오게 ㄱ
		 *       *
		 *      **
		 *     ***
		 *    ****
		 * q3
		 *  ****
		 *  ***
		 *  **
		 *  *
		 * 
		 * q4
		 * 
		 *  ****
		 *   ***
		 *    **
		 *     *
		 * 
		 */
	}
	static Scanner sc = new Scanner(System.in);
	static void Q4() {
		System.out.println("1~7까지 숫자를 기입:");
		int num3 = Integer.parseInt(sc.nextLine());
		switch(num3) {
		case 1:
			System.out.println("1번은 월요일");
			break;
		case 2:
			System.out.println("2번은 화요일");
			break;
		case 3:
			System.out.println("3번은 수요일");
			break;
		case 4:
			System.out.println("4번은 목요일");
			break;
		case 5:
			System.out.println("5번은 금요일");
			break;
		case 6:
			System.out.println("6번은 토요일");
			break;
		case 7:
			System.out.println("7번은 일요일");
			break;
		default:
			System.out.println("해당 요일은 없습니다.");
			
			
		}

		
		
		
		
		
	}//5의 배수인지 아닌지
	static void Q2() {
		System.out.println("숫자입력");
	int fucking = Integer.parseInt(sc.nextLine());
//		if(fu i< {
			System.out.println("5의배수임");
	//	}else {????
			System.out.println();
		}
				
				
				
				
				
	
				
	}//과자2k10개 넘으면1.5k
	static void Q3() {
		int snak;
		int result;
		System.out.println("과자:");
		int sum = Integer.parseInt(sc.nextLine());
		
		if(sum<=10) {
			result = sum*2000;
		}else {
			snak =10;
			snak = snak*2000;
		sum = sum - 10;
	result = snak+sum*1500;
		}
		System.out.println("과자갯수출력:" +result);
	}//// 1부터 입력받은 숫자까지의 짝수와 홀수의 합을 출력하시오??
	static void Q1() {
		int num9 =0;
		int num8 =0;
		System.out.println("1짝수입력");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("2홀수입력");
		int num = Integer.parseInt(sc.nextLine());
		for(int numA =)//(짝수 %1,2)) 짝홀 받고
			System.out.println(numA + numB);                        //합
		
	}


}
