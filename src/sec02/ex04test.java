package sec02;

public class ex04test {
	public static void main(String[] args) {
		ForSumFrom1to100Example();
	}
	
	static void ForPrintFrom1To10Example() {
		
		for(int i=1; i<=10;i++) {
			System.out.println(i);
		}
	}
	
	static void ForSumFrom1to100Example() {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
