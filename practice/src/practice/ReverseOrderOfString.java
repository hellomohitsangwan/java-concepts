package practice;
import java.util.Scanner;
public class ReverseOrderOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the line");
		String s =sc.nextLine(); //take input of line from the user
          int i = s.length() - 1; //ham isme for loop line k last k start krege to last vali vali posn. hmne i me store krali
          String r = ""; //ye vo string he jisme ham store kaarayege reversed string
		while(i>=0) 
		{ 
			while(i >= 0 && s.charAt(i) == ' ' ) i--; //agar string k end me spaces hoge to vha tk mit jaye     
			int j = i; //vha pr hm j start krege 
			if(i<0) //ye hamne isleye lagayi he agar string sirf ek word hota to veh aur piche na agle loop me vhi ruk jaye 
			{
				break;
			}
			while(i>=0 && s.charAt(i) != ' ') i--; //j start krne k bd i ham vha tk chlayege jha taak space nhi mil jata 
			//mtlb jha pr ek pura word khatam ho jata he 
			if(r.isEmpty()) {
			r = r.concat(s.substring(i+1,j+1)) ;}
			else
			//taki ham words k bich me spaces dal sake
			{
				r = r.concat(" "+s.substring(i+1,j+1)) ;
			}
			
			
		}
		System.out.println(r);
	}
static String reverse(String r) {
	
	
	return r;
}
}
