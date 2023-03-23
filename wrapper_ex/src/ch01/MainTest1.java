package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		Integer num = new Integer(20); // 박싱
		// int n = num; // Type mismatch 안됨.. -> 자동 언박싱(auto boxing)
		int n = num.intValue(); // 언박싱

		System.out.println(n);
		System.out.println("===========");

		Integer num2 = 30; // 자동 박싱 --> new 안해줘도 알아서 박싱해줌
		int result = num2; // 자동 언박싱
		System.out.println(num2);
	}

}
