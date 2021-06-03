package inheritencecasting;

public class MainClass {

	public static void main(String[] args) {
	
	Pitbull p = new Pitbull();
	
	//this is called upper casting 
    dog d = p;   //we can esily do thi bec. we know that pitbull is a dog
    
    
    
    Pitbull p1 = new Pitbull();
     dog d1 = p1;  //   hame up casting kne se phle ye bata hoga k pitbull he vo do g hai;
     //ahme ye d1 piubill banana tha ileye iaisa kra
    Pitbull p2 = (Pitbull)d1;   // isme hame ye batana padega k j dog hai vo sirf pitbull nhii ho skta bac. the dog  may be a  
    //this is called downcasting
    
    
    Pitbull p3 = new Pitbull();
    dog d3 = p3;
   Pitbull p4=(Pitbull)d3;
   //this is calles down casting
   
   
    
 boolean yo = p1 instanceof Pitbull;  //ye hamesa boolean value retur krta he 
                           //iska mtlb he kya p1 Pitbull ka he.

 System.out.println(p1 instanceof dog);   // ultimately p1 instance he dog ka kyunki p1 instance he Pitbull ka aur Pitbull instance e dog ka
    System.out.println(p1 instanceof Pitbull);
    System.out.println(p2 instanceof Pitbull);
    
	}

}
