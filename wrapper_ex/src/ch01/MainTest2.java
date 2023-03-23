package ch01;

public class MainTest2 {

	public static void main(String[] args) {
		// 문자열 데이터 타입 -> 기본 데이터 타입으로 변환하는 방법을 알아야 한다
		// wrapper class 사용

		String str = "127";
		String str2 = "10.5";
		String str3 = "true";

		byte b = Byte.parseByte(str); // -128 ~ 127 byte 공간에 넣을 수 있다!
		System.out.println(b);

		int i = Integer.parseInt(str);
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println(bool);

		short s = Short.parseShort(str);
		System.out.println(s);

		long l = Long.parseLong(str);
		System.out.println(l);
		float f = Float.parseFloat(str2);
		System.out.println(f);
		double d = Double.parseDouble(str2);
		System.out.println(d);
	}

}
