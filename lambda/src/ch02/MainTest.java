package ch02;

public class MainTest {

	public static void main(String[] args) {

		IMaxNumber maxInt = new IMaxNumber() {
			// 인터페이스지만 익명 구현 클래스로 만듬
			@Override
			public int getMax(int a, int b) {
				if (a < b) {
					return a;
				}
				return b;
			}
		};
		IMaxNumber lambdaMaxInt = (x, y) -> {
			return x > y ? x : y;
		};
		System.out.println(lambdaMaxInt.getMax(50, 100));
	}

}

class MaxNumber implements IMaxNumber {

	@Override
	public int getMax(int a, int b) {

		return 0;
	}

}
