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
		if(o instanceof Dog){ // ���� ���� � � ����� ��� ���� ���������
		return this.name.equals(((Dog)o).name);
		}else{
			return false;
		}
	}
	
}