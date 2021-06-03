package strings;

public class Basics {

	public static void main(String[] args) {
      String cars = "lambborgini,range rover,mercedes,audi";
      String []allcars = cars.split("e"); 
      for(String car : allcars) 
//      ye vala loop for each loop kehlata he iska ques. me iska matlab string naam ka array he,all cars ka
//    	  variabel mene naye variable car me dal diya
      {
    	  System.out.println(car);
      }

	}

}
