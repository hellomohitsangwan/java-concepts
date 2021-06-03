package abstraction;

public class CarRepair {

	
	public static void repair(Car car) {
		System.out.println("car is reparing");
	}

	public static void main(String[] args) {
		
		Wagnor wagnor = new Wagnor();
		Audi audi = new Audi();
		 
		//Car car = new Car();  // it shows error that we cant make objects of a abstract class
		
		
		//we can also achieve the same by using inehritence but for that we also have to make the objects of parent class i.e Car but using abstraction we don't need oto make objrcts  of parent class
		
		repair(wagnor);
		repair(audi);

	}

}
