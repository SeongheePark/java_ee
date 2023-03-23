package ch02;

public class MainTest_ex {

	public static void main(String[] args) {
		INumber num = (a, b) -> {
			return a * b;
		};
		int resultNum = num.multiple(50, 50);
		System.out.println(resultNum);
	}
	
	 

}
