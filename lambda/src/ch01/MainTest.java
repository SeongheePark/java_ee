package ch01;

public class MainTest {

	public static void main(String[] args) {

		// 1. 인터페이스가 있고 2. 어떻게 구현될지 식을 재정의 한다 (람다표현식)
		IAdd iAdd = (x, y) -> {
			return x + y;
		};
		IAdd sub = (x, y) -> {
			return x - y;
		};
		System.out.println(iAdd.cal(10, 10));
		System.out.println(sub.cal(50, 2));

		// 람다식 정의 모습
		IPrint iPrint = (a, b) -> {
			System.out.println(a + ":" + b);
		};
		// 람다식 활용 모습
		iPrint.myPrint("홍길동", "ddd");

		IPrint2 print2 = () -> {
			return "반가워!";
		};
		String temp = print2.print();
		System.out.println(temp);

		new Thread(() -> {
		}).start();

	}

}

// 람다 표현식 만들기
// 인터페이스 먼저 정의 
// 주의 ! 함수형 인터페이스라고 한다 (인터페이스 안에 추상메서드는 반드시 한개여야한다)
interface IPrint {
	void myPrint(String str, String token);
}

interface IPrint2 {
	String print();
}
