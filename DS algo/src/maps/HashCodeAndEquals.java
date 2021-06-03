package maps;
import java.util.*;
public class HashCodeAndEquals {

	public static void main(String[] args) {
			
		Pen pen1 = new Pen(64 , "black");
		Pen pen2 = new Pen(64 , "black");
		
		//agar vo memoru me same reference ko point nhii kr re to vo alag alag hai
		System.out.println(pen1 == pen2);
		
		System.out.println(pen1);  //ye hame address type return kr ra hai k vio memory me kaha located hai
		System.out.println(pen2);
		System.out.println(pen1.equals(pen2));
		
		
		Set <Pen> pens = new HashSet<>();
		pens.add(pen1);
		pens.add(pen2);
		
	    System.out.println(pens);  //it will not treat them equal bec. they don't have unique hashcode so we have to override the hashcode method in order to treat them equal
				//when we overrifde the method then the hashCode will becomes same acc. to our own hashCode implementation
	}
}

class Pen {
	String color;
	int price;
	
	public Pen(int price , String color) {
		this.color = color;
		this.price = price;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}


	
	
//	//our these two methods will not handle allthe case sso for that in eclipse there is pre defined equals and hashCode function all we need is that we have to go to sourse and genrate both methods
//	@Override
//	public boolean equals(Object obj) {
//		Pen that = (Pen) obj;
//		boolean isEqual = this.price == that.price && 
//				this.color.equals(that.color);
////				this.color == that.color;  //or we can also write like this also
//		
//		return isEqual;
//	}
//	@Override
//	public int hashCode() {
//		return price + color.hashCode();
//	}
	
	
	
	
}
