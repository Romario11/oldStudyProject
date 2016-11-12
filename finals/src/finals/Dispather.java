package finals;

public class Dispather {
	final int x;
	final int y=create();
	
	Dispather(int x){
		this.x=x;
	}
	int create(){
		return 5;
	}
	
	public static void main(String[] args) {
		final Animal a = new Animal();
		a.weight+=4;
	
		//x++;

	}

}
