package serialization;

import java.io.*;

public class Dog extends Animal implements Serializable {
	int price;

	public Dog(int weight, int price) {
		super(weight);
		this.price = price;
	}
}
