package sec02;

public class ex01test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// IfExample();
		// IfElseExample();
		// IfElseIfElseExample();
		//IfDiceExample();
		IfNestedExample();
	}

	static void IfNestedExample() {
		int score = (int) (Math.random() * 20) + 81;
		System.out.println("����: " + score);

		String grade; //grade��� ���ڿ� ����
		//���� �������� ���� ������ �ش� if,else������ ������ �� ���͸��� �ȴٴ°�
		//ex) 90���� ũ�� A+�� ���� , 85���� ������ B�� ����
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}

		}else {
			if(score>=85) {
				grade = "B+";
			}else {
				grade = "B";
			}
		}
		System.out.println("����: " + grade);
	}

	static void IfDiceExample() {
		int num = (int) (Math.random() * 6) + 1;// ���������ϴ� Math �ڵ�

		if (num == 1) {
			System.out.println("1���� ���Խ��ϴ�.");
		} else if (num == 2) {
			System.out.println("2���� ���Խ��ϴ�.");
		} else if (num == 3) {
			System.out.println("3���� ���Խ��ϴ�.");
		} else if (num == 4) {
			System.out.println("4���� ���Խ��ϴ�.");
		} else if (num == 5) {
			System.out.println("5���� ���Խ��ϴ�.");
		} else {
			System.out.println("6���� ���Խ��ϴ�.");
		}
	}

	static void IfElseIfElseExample() {
		int score = 75;

		if (score >= 90) { // 90���� �ɷ����� �� �κп����� �ް� ����� ���� ����������
			System.out.println("������ 100~90 �Դϴ�.");
			System.out.println("����� A �Դϴ�.");
		} else if (score >= 80) {
			System.out.println("������ 80~89 �Դϴ�.");
			System.out.println("����� B �Դϴ�.");
		} else if (score >= 70) {
			System.out.println("������ 70~79 �Դϴ�.");
			System.out.println("����� C �Դϴ�.");
		} else if (score >= 60) {
			System.out.println("������ 70�̸��Դϴ�.");
			System.out.println("����� D �Դϴ�");
		}
	}

	static void IfElseExample() {
		int score = 85;

		if (score >= 90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
		} else {
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B �Դϴ�.");
		}

	}

	static void IfExample() {
		int score = 80;

		if (score >= 90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
		}

		if (score < 90)
			System.out.println("������ 90���� �۽��ϴ�.");
		System.out.println("����� B �Դϴ�.");
	}
}
