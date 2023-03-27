package ch01;

public class MyHouse {
	public static void main(String[] args) {
		AirConditioner airConditioner = new AirConditioner();
		Cleaner cleaner = new Cleaner();
		HairDryer hairDryer = new HairDryer();
		Nintendo nintendo = new Nintendo();
		// 다형성
		connect(airConditioner);
		connect(cleaner);
		
		// 어댑터
		TencoAdapter adapterHairDryer = new TencoAdapter(hairDryer);
		connect(adapterHairDryer);
		TencoAdapter adapterNintendo = new TencoAdapter(nintendo);
		connect(adapterNintendo);
		
	} // end of main

	// 전기 콘센트
	public static void connect(Electrionic220v electrionic220v) {
		electrionic220v.connect();
	}
}// end of class
