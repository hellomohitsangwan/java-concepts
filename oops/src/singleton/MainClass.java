package singleton;

public class MainClass {

	public static void main(String[] args) {
		//jab bhii obj. bnta he to contuctor call hota he
		
		 AppConfig obj1 = AppConfig.getInstance();
		 AppConfig obj2 = AppConfig.getInstance(); //ye sare obj same he hai.ek baar me he obj. mil ra he
		 AppConfig obj3 = AppConfig.getInstance();
	//	   AppConfig obj2 = new AppConfig();
		 
	}

	

}
