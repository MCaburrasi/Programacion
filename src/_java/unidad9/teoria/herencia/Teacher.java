package _java.unidad9.teoria.herencia;

public class Teacher extends Person{
	private int numCourses;
	private String[] courses;
	private final int MAX_COURSE = 5;

	public Teacher(String name, String address) {
		super(name, address);
		this.courses = new String[MAX_COURSE];
	}

	public boolean addCourse(String course){
		boolean can = false;
		if (numCourses < 5){
			courses[numCourses] = course;
			can = true;
		}
		return can;
	}

	public boolean removeCourse(String course){
		boolean can = false;
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course)) {
				courses[i] = "";
				can = true;
			}
		}
		return can;
	}

	@Override
	public String toString() {
		return "Teacher: " + super.toString();
	}
}
