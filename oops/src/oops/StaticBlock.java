package oops;

public class StaticBlock {
	//ye static block he iska order jo sbse phle vala static blockk hoga phle vo
	//run hoga uske baad dusra ar uske baad aur.ye main se bhii phle run hotaa he.
	//iska use - agar hame khii pr koi statement ohe ru kani ho to use krte he
	static {
		System.out.println("static 1");
	}
	
   static {
	   System.out.println("static 2");
   }	
   
   public static void main(String[] args) {
	System.out.println("main 1");
       
	}  
   static { 
	   System.out.println("static 3");
   }

}
 