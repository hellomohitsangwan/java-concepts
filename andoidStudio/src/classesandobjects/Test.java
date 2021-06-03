package classesandobjects;

public class Test {

	public static void main(String[] args) {
	class no {
		int number;
		
		public boolean isSquare() {
			
			double y = Math.sqrt(number);
		if (y == Math.ceil(y) ) {
			System.out.println("it is perfect sq.");
			return true;
		}
		else {
			System.out.println("not a perfect sq.");
			return false;
		}
		}
		
		 public boolean traingularno() {
			 
			 int x = 1;
			 int tn = 1;
			 while(tn < number) {  
				 x++;
				 tn = tn+ x;
			 }
			 if(number == tn) {
				 System.out.println("traingular no");
				 return true;
			 }
			 else {
				 System.out.println("not traingular no");
				 return false;
			 }
		 }
		 
	}
	  
	//i'll fix the error in the morning.
	no mynumber = new no();
 mynumber.number = 9;
 mynumber.isSquare();
	   mynumber.traingularno();
	   //System.out.println(mynumber.traingularno());
	}

		
	}


