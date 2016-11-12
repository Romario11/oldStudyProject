package drobu;

public class Controll {
	static Model sum(Model d1, Model d2){
		Model result = new Model();
		
		 result.chuselnuk = d1.chuselnuk*d2.znamennuk+d2.chuselnuk*d1.znamennuk;
			result.znamennuk=d1.znamennuk*d2.znamennuk;
			return result;
		
	}

}
