package polimorphism;

public class Dispather {

	public static void main(String[] args) {
		Straus s = new Straus();
		Penguin p = new Penguin();
		Hawk h = new Hawk();
		Crokozjablik c= new Crokozjablik();
		Bird [] b = new Bird [4];
		
		b[0]=s;
		b[1]=p;
		b[2]=h;
		b[3]=c;
		
		//Hawk h1=(Hawk)b[0];// помилка часу виконання найгірша помилка
		
		for(int i=0; i<b.length ;i++){
			b[i].move();
		}
		System.out.println(s.legLength);
		System.out.println(((Straus)b[0]).legLength);
	}

}
