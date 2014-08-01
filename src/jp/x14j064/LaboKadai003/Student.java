package jp.x14j064.LaboKadai003;

public class Student extends Person{
String clazz;
	Student(String name, int age, String address,String clazz) {
		super(name, age, address);
		this.clazz = clazz;
	}

	

	@Override
	void print() {
		super.print();
		System.out.println("ƒNƒ‰ƒXF" + clazz);
	}
}
