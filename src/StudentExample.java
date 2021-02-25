
public class StudentExample {

	public static void main(String[] args) {

		Student s = new Student();
		s.setId(1);
		s.setName("ABC");

		College c = new College();
		c.setCollegeId(1);
		c.setCollegeName("CVR");

		s.setCollege(c);

		// s.setCollege(new College(1,"CVR"));

		System.out.println(s);

		int i = s.getId();
		System.out.println("Student id: " + i);
	}

}
