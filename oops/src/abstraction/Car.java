package abstraction;
//abstract ham us parent class me lagayege jaha hame uske bache meaningfulll haii vhaa lagayege hamm..
public abstract class Car {  //ham class k ek method ko abstract banate hai to usii type pr jhame clas k bhuii abstract banana padega
//	is class ko abstract banane se hae gayda ye huaa haii k ab is class k koii obect nhii bana saktaa.beac car to bas ek concept hi us ke object bnana meaning fulll nhi hoga isleye uske childrens k object banayege
public abstract void accelerate(); // abstract liknse se ha eus function k impletation nhi likhne hoti a uski implementation uska child lkhega(h Hame method override karne padege)
public abstract void breaking(); 

// ek abstract class k andar non-abstract methods bhii ho skte haii aur unhe kehte haii concrete methods
public void honking () {
	System.out.println("car is honking!!");
}
}
