package jp.x14j064.LaboKadai003;

import java.util.*;

class LaboKadai003 {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("�D�� ���Y", 20, "��t���D���s"));
		persons.add(new Student("�D�� �Ԏq", 22, "��t����t�s������", "3G1"));
		persons.add(new Teacher("���� �搶", 99, "��t���~�~�s", "�l�b�g���[�N��"));
		persons.add(new ClubMember("���{�@����", 20, "���V���g��D.C.", "2G1", "�Z�p��"));

		for (Person person : persons) {
			person.print();
			System.out.println();
		}
	}
}
// }
