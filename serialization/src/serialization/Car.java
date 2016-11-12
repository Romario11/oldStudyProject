package serialization;

import java.io.*;

public class Car implements Serializable {
	int speed;
	String color;
	transient Engine e;
	
	public Car(int speed, String color, Engine e) {
		this.speed = speed;
		this.color = color;
		this.e = e;
	}
	
	private void writeObject (ObjectOutputStream os) throws IOException {                     
		os.defaultWriteObject();                           
		os.writeInt(e.power); 
		os.writeObject(e.producer);
		os.writeInt(e.d.fuelCount); 
	}
	
	private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {  
		is.defaultReadObject();                             
		e = new Engine (is.readInt(), (String)is.readObject(), new Diesel (is.readInt()));
	}
}