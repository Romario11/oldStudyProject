package overriding;

public class Dog  {
String breed;
int price;
Dog(String breed,int price){
	this.breed=breed;
	this.price=price;
}
public String toString(){
	return breed +" "+price;
}
public boolean equals (Object o){
	return this.breed.equals(((Dog)o).breed)&&this.price==((Dog)o).price;
}
//public boolean equals (Object o){
	//return this.price==((Dog)o).price;
//}
}
