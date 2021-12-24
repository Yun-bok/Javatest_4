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
		System.out.println("점수: " + score);

		String grade; //grade라는 문자열 제시
		//이제 랜덤으로 값이 나오면 해당 if,else문으로 빠진다 즉 필터링이 된다는것
		//ex) 90보다 크니 A+로 들어간다 , 85보다 작으니 B로 간다
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
		System.out.println("학점: " + grade);
	}

	static void IfDiceExample() {
		int num = (int) (Math.random() * 6) + 1;// 난수생성하는 Math 코드

		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}

	static void IfElseIfElseExample() {
		int score = 75;

		if (score >= 90) { // 90에서 걸렸으면 이 부분에서만 받고 멈춘다 밑은 가지도않음
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A 입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다.");
		} else if (score >= 60) {
			System.out.println("점수가 70미만입니다.");
			System.out.println("등급은 D 입니다");
		}
	}

	static void IfElseExample() {
		int score = 85;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}

	}

	static void IfExample() {
		int score = 80;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}

		if (score < 90)
			System.out.println("점수가 90보다 작습니다.");
		System.out.println("등급은 B 입니다.");
	}
}
