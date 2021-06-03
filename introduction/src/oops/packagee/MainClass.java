package oops.packagee;

import java.util.*;
//insted of writing "import java.util.Scanner;" we can also write "import java.util.*;" it simple means java.util k andr jo hoga vo mil jayega

import oops.packagee.oops.packagee.models.Student;
import oops.packagee.oops.packagee.models.Teacher;
//if we wanted to import all the classes from he package then insted of writing "import oops.packagee.oops.packagee.models.Student;"
//we can also write like this
//" import oops.packagee.oops. packagee.models.*; "
//"model.* " ka matlab muje model k andar jo bhi kuch he vo sabb chaiye


public class MainClass {

	public static void main(String[] args) {
		Student obj = new Student("mohit");
		Teacher teacher = new Teacher();
		obj.legs = 2;  //now here legs field is visible as it is public in student class
		obj.name = "don"; //now here name field is not visible as it is private in student class
        teacher.getName();  //now getName is not visible because it visible on the classes of the same packge
                             //not parent package    
		obj.getPassword();    //now getPassword is not visible in other classs as it is private[
	Scanner sc = new Scanner(System.in);
	}
}
