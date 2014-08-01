package jp.x14j064.LaboKadai003;

public class ClubMember extends Student {
String club;
	ClubMember(String name, int age, String address, String clazz,String club) {
		super(name, age, address, clazz);
		this.club = club;
	}

	

	@Override
	void print() {
		super.print();
		System.out.println("•”Šˆ“®"+ club);
	}
}
