package jp.x14j064.LaboKadai003;
public class Person {

	String name;
	int age;
	String address;
	Person(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
		
	}

	
	void print() {
		System.out.println("���O:" + name);
		System.out.println("�N��F" + age);
		System.out.println("�Z���F" + address);
	}

}
