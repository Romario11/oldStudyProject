package group;

public class Dispather {

	public static void main(String[] args) {
		final Students s1=new Students("ira",5);
	final	Students s2=new Students("valik",4);
	final	Students s3=new Students("olga",3);
	final	Students s4=new Students("roman",2);
	final	Students [] group={s1,s2,s3};
	for(int i=0;i<group.length;i++){
		System.out.println(group[i].name);
	}
		
		
		

	}

}
