package sec02;

public class ex10 {

	public static void main(String[] args) {
		//BreakExample();
		BreakOutterExample();

	}
	static void BreakExample() {
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
	public void BreakOutterExample() {
		//'A' -65
		//'a' -97
		Outter:for(char upper ='A'; upper<='Z'; upper++);
		for(char lower='a'; lower<='z'; lower++) {
			System.out.println(upper+ "-" + lower);
			if(lower=='g') {
				break Outter;
			}
		}
		System.out.println("프로그램 실행 종류");
	}
}