package serialization;

import java.io.*;
import java.util.*;

public class Dispatcher {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		/*Car c1 = new Car (200, "white", new Engine(250, "Mann", new Diesel(7)));
		Car c2 = new Car (180, "black", new Engine(200, "Melitopol", new Diesel(5)));
		
		ArrayList<Car> al = new ArrayList();
		al.add(c1);
		al.add(c2);
		
		File f1 = new File ("D:/Programming/Programs_Java/serialization/f1");
		ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream(f1));
		oos.writeObject(c1);
		oos.writeObject(c2);
//		oos.writeObject(al);
		oos.flush();
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream (new FileInputStream(f1));
		Car c1_New = (Car)ois.readObject();
		Car c2_New = (Car)ois.readObject();
		ois.close();
		
		System.out.println(c1_New.speed + " " + c1_New.color + " " + c1_New.e.power + " " + c1_New.e.producer + " " + c1_New.e.d.fuelCount);
		System.out.print(c2_New.speed + " " + c2_New.color + " " + c2_New.e.power + " " + c2_New.e.producer + " " + c2_New.e.d.fuelCount);*/
		
		
		Dog d = new Dog(140, 120);
		
		File f1 = new File ("D:/Programming/Programs_Java/serialization/f1");
		ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream(f1));
		oos.writeObject(d);
		oos.flush();
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream (new FileInputStream(f1));
		Dog d_New = (Dog)ois.readObject();
		ois.close();
		
		System.out.println(d_New.price + " " + d_New.weight);
		
		
		
		
		
		
		
		
		
		
	}
}