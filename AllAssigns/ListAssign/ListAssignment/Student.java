package ListAssignment;

import ExerciseDAY5.Employee;

public class Student implements Comparable<Student> {
	private String name;
	private float marks;
	public Student(String name, float marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public int compareTo(Student o) {
		// return this.name.compareTo(o.name);
		if (this.marks < o.marks)
			return 0;
		else
			return 1;

	}

}
