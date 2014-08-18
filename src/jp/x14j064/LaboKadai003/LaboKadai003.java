package jp.x14j064.LaboKadai003;

import java.util.*;

class LaboKadai003 {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("船橋 太郎", 20, "千葉県船橋市"));
		persons.add(new Student("船橋 花子", 22, "千葉県千葉市中央区", "3G1"));
		persons.add(new Teacher("朝賀 先生", 99, "千葉県××市", "ネットワーク科"));
		persons.add(new ClubMember("松本　部長", 20, "ワシントンD.C.", "2G1", "技術部"));

		for (Person person : persons) {
			person.print();
			System.out.println();
		}
	}
}
// }
