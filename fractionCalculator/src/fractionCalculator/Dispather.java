package fractionCalculator;

public class Dispather {

	public static void main(String[] args) {
	Fraction f1 = new Fraction(2,5) ;
	Fraction f2 = new Fraction(1,3);
	Fraction summa = Controller.add(f1, f2);
	Fraction substract = Controller.substract(f1, f2);
	Fraction multiplie = Controller.multiplie(f1, f2);
	Fraction devide = Controller.devide(f1, f2);
	View.display(summa);
	View.display(substract);
	View.display(multiplie);
	View.display(devide);
	
	}

}
