package serialization;

public class Engine {
	int power;
	String producer;
	Diesel d;

	public Engine(int power, String producer, Diesel d) {
		this.power = power;
		this.producer = producer;
		this.d = d;
	}
}