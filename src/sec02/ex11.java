package sec02;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static void continue_test() {
		//for - ���������� �̵�
		//while - ���ǽ� �̵�
		int cnt = Integer.parseInt(sc.nextLine());
		int result = 0;
		for(int i =1; i<=cnt; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
