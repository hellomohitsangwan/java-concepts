package oops;

import oops.A.C;

public class StaticKeyword {

	public static void main(String[] args) { 
		
		
 //System.out.println(Math.PI);
   //here "Math." isme bhut sare function jisse hmme code likh nhi pdta ham 
   //do no. ka max. bhi nikal sakte he
		
		// B objb = new B();
	
	A obja = new A();
	A.B objb = obja.new B();   //hame aise banana padega B ka obj. 
	        //ya phir hame upar impor krani padege "import oops.A.B;"
	       //mtlb B lane k liye phle A lana jarurui he
	
	//lekin C class kyuki he to uske liye hame ye sb krne k jrurat nhiii he
	C objc= new A.C();  //hame isme C ka obj. banate hue "obj.a" nhi ikhna pada
	    //simply yehe frak hota he static keywor dme
	
	}

}
//we cannot declare a top class as static class but we can declare a 
//nested class as static.
//staic class ka matlab us class ko ham aise treat kr skte he jese
//vo bhar padi huii ho,vo nested na ho i.e if we wated toc reate the objects
//of that class then we don't have to make first the objects of its parent class / main class