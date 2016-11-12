package multiInheritance;

public class Dispather {

	public static void main(String[] args) {
		Computer [] c ={new Computer(),new Computer(),new Mobile()};
		
		for(int i = 0;i<c.length;i++){
			c[i].process();
			System.out.println();
		}
		Phone [] p={new Phone(),new Phone(),new Mobile().makePhone()};
		
		
		for(int i = 0;i<p.length;i++){
			p[i].process();
			System.out.println();
		}
	}

}
