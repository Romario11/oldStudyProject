package arrayLists;

class Dog{
	String name;

	public Dog(String name) {
	
		this.name = name;
	}

	@Override
	public String toString() {
		return  this.name;
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Dog){ // якщо обєкт о є догом тоді буде порівняння
		return this.name.equals(((Dog)o).name);
		}else{
			return false;
		}
	}
	
}