package _java.unidad9.teoria.herencia;

public class Student extends Person{
	private int numCourses;
	private String[] courses;
	private int[] grades;
	private final int MAX_COURSES = 30;

	public Student(String name, String address) {
		super(name, address);
		this.courses = new String[MAX_COURSES];
		this.grades = new int[MAX_COURSES];
		numCourses = 0;
	}

	public void addCourseGrade(String course, int grade){
		if (numCourses < MAX_COURSES){
			courses[numCourses] = course;
			grades[numCourses] = grade;
			numCourses++;
		}
	}

	public void printGrades() {
		for (int i = 0; i < numCourses; i++) {
			System.out.println(courses[i] + ": " + grades[i]);
		}
	}

	public double getAverageGrade(){
		int total = 0;
		for (int i = 0; i < numCourses; i++) {
			total += grades[i];
		}
		return (double) total / numCourses;
	}

	@Override
	public String toString() {
		return "Student: " + super.toString();
	}
}
