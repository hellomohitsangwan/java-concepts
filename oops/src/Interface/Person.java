package Interface;

public class Person implements Youtuber , Student {

	public static void main(String[] args) {
		
		Person person =  new Person();
		
		person.study();
		person.makeVideo();
		
		Youtuber object = new Youtuber(); 
		
		//now we cant do this bec. we know that youtuber is now not a class its a interface noew and it dosen'y have any constructer unlike the class o it shoes the error
		Youtuber obj2 = person;  //bec. person is youtuber
		obj2.makeVideo();
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("person is studying ");
	}

	@Override
	public void makeVideo() {
		// TODO Auto-generated method stub
		System.out.println("person is making video");
	}

	@Override
	public void makeMoreVideo() {
		// TODO Auto-generated method stub
		
	}

}
