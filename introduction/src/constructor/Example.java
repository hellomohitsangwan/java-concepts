package constructor;
class vehicle {    
	
	int wheel,lights;
	String color;
	 
	//constructors are used to initalize the state variable like in this case wheel , color, etc. ,by default they have their default value so to give them a velue we uses a constructor
	//the syntax is a constructor is very similar a method but unlike the method it don't have a return and teh name is same as the ame of class;
	
	vehicle() {
		wheel = 4;
		color = "red";
	}
	
}
public class Example {
   
	public static void main(String[] args) {
		vehicle car = new vehicle();
		vehicle car2 = new vehicle();
		//jese he new k piche vehicle class he to vo vehicle vala constructor call krega 
		//aur ye sare vehicle k objects me hmesa 4 wheel ur red color he rahega 
      System.out.println(car.color +car.wheel + car2.wheel);
     
	}

}
