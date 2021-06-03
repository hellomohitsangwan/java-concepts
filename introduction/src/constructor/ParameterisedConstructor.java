package constructor;
  class moto {
int wheels,headlights;
String color;
	
//	moto(int noOfWheel)
//	//this is called parameterised constructor in this we are making diff. objects we of same class
//	//then we use this constructor.
//{
//	wheels = noOfWheel;
//	headlights = 2;
//	
//} 
	//we can also write like this if we dont want to introduce noofwheels new variable
	moto(int wheels) {
		this.wheels = wheels;
		headlights = 2;
	}
  moto(int wheels, String color)
  //this is called constructor overloading, simiar to mehod overloading
  {
	  this.wheels = wheels;
	  this.color = color;
  }
}

public class ParameterisedConstructor {

	public static void main(String[] args) {
		
    moto car = new moto(4);
    moto bike = new moto(2);
    System.out.println(car.wheels +" " +bike.headlights+" "+bike.headlights+" "+car.headlights);
    
	}

}
