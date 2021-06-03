package lists;

public class Pair <X , Y>  //this is called generic that bascically we are can specify the values that we written in the class acc. to our need  
{
//now bascically X , Y is just a variable noe like boolean , String etc;
	X x;  //
	Y y;
	
	public Pair(X x , Y y) {
	 this.x = x;
	 this.y = y;
	}
	
	public void getDescription() {
		System.out.println(x + " and "+ y);
	}
	
}
