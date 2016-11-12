package multiInheritance;

public class Mobile extends Computer {
Phone makePhone(){
	return new Phone(){
		void process(){
			super.process();
			System.out.println("MobilePhone");
		}
	};
}
void process(){
	super.process();
	System.out.println("MobileComputer");
}
}
