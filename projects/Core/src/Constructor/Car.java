package Constructor;

public class Car {
	
	String Vin;
	String Make;
	String Model;
	
	
	Car(String VinNumber, String MakeOfCar, String ModelOfCar){
		this.Vin = VinNumber;
		this.Make = MakeOfCar;
		this.Model = ModelOfCar;
	}
	
	Car(String MakeOfCar, String VinNumber){
		this.Make = MakeOfCar;
		this.Vin = VinNumber;
	}
	
	
	void start(String name) {
		System.out.println(name + " Starting " + Model +" "+ Make +" " + Vin + " ");
	}
		void start(String name, int age) {
			System.out.println(name + " is " + age + " so he can drive my "  + Model + " " + Make + " [" + Vin );
		}
	

}
