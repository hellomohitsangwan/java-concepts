package singleton;

public class AppConfig {

	private AppConfig() {
		
	}
	//making sstic class
	//now ise kuch khass nhi hota bs apna default constructor pivate krna hota eh
	//uske baad ststic ka ek obj banana he aur uska ek function jo obj return kare.
	private static AppConfig obj = new AppConfig();
	public static AppConfig getInstance() {
		
		return obj;
		
		
        //ham isme cond. bhi laga skte he agar hame ek he obj banwana ho to 
		//if else ka use krke,for eg.-
//		
//		" private static AppConfig obj = null;
//		public static AppConfig getInstance() {
//			if(obj == null) {
//				obj = new AppConfig();
//			}
//			return obj; "
//		
    }
}
