package sec02;

public class ex02test {

	public static void main(String[] args) {
		//
		//SwitchNoBreakCaseExample();
		//SwitchCharExample();
		SwitchStringExample();
	}
	static void SwitchStringExample( ) {
		String position = "����";
		
		switch(position) {
		case "����":
			System.out.println("700����");
			break;
		case "����":
			System.out.println("500����");
			break;
		default:
			System.out.println("300����");
		}
		
	}
	
	
	static void SwitchCharExample() {
		char grade ='a';
		
		switch(grade) {
		case'A':
		case'a':
		System.out.println("��� ȸ���Դϴ�.");
		break;
		case'B':
		case'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
			default:
				System.out.println("�մ��Դϴ�.");
		}
	}
	
	
	static void SwitchNoBreakCaseExample() {
		int time = (int)(Math.random()*4) +8;
		System.out.println("[����ð�: " + time + "�� ]");
		
		switch(time) {
		case 8:
			System.out.println("����մϴ�.");
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
		case 10:
			System.out.println("������ ���ϴ�.");
		default:
			System.out.println("�ܱ��� �����ϴ�.");
		}
	}

	static void SwitchExample() {
		int num =(int)(Math.random()*6) +1;
		
		switch(num) {
			case 1:
				System.out.println("1���� ���Խ��ϴ�.");
				break;
			case 2:
				System.out.println("2���� ���Խ��ϴ�.");
				break;
			case 3:
				System.out.println("3���� ���Խ��ϴ�.");
				break;
			case 4:
				System.out.println("4���� ���Խ��ϴ�.");
				break;
			case 5:
				System.out.println("5���� ���Խ��ϴ�.");
				break;
			default:
				System.out.println("6���� ���Խ��ϴ�.");
				break;
				
		}
	}

}
