package sec02;

public class ex05test {

	public static void main(String[] args) {
		//ForFloatCounterExample();
		// ���� ������ ����
		ForMultiplicationTableExample();
		int sum = 0;

		// for���� ����� ���� ���� �� �ʱ�ȭ
		int i = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println("1~" + (i - 1) + "�� : " + sum);

	}

	static void ForFloatCounterExample() {
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
	}
	static void ForMultiplicationTableExample() {
		for(int m=2; m<=9; m++) {//m = 2  2~9 +1
			System.out.println("***" +m+"�� ***");
			for(int n=1; n<=9; n++) {//1~9 +1 -> 9�� �ݺ�
				System.out.println(m+"x"+n+"=" +(m*n));
			}
		}
		
	}

}
