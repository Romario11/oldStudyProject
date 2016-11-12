package fractionCalculator;

public class Controller {
	static Fraction add (Fraction f1 , Fraction f2){
		Fraction result = new Fraction();
		result.denominator = f1.denominator*f2.denominator;
		result.numerator = f1.numerator*f2.denominator+
				f2.numerator*f1.denominator;
		
		
		return result;
		
	}
	static Fraction substract (Fraction f1 , Fraction f2){
		Fraction result = new Fraction();
		result.denominator = f1.denominator*f2.denominator;
		result.numerator = f1.numerator*f2.denominator-
				f2.numerator*f1.denominator;
		
		
		return result;
		
	}
	static Fraction multiplie (Fraction f1 , Fraction f2){
		Fraction result = new Fraction();
		result.denominator = f1.denominator*f2.denominator;
		result.numerator = f1.numerator*f2.numerator;
		
		
		return result;
		
	}
	static Fraction devide (Fraction f1 , Fraction f2){
		Fraction result = new Fraction();
		result.denominator = f1.denominator*f2.numerator;
		result.numerator = f1.numerator*f2.denominator;
		
		
		return result;
		
	}
	

}
