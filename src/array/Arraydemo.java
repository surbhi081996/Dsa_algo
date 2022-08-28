package array;

public class Arraydemo {

	// time complexity = O(n), space = O(1)
	public static void main(String[] args) {
		int[] arrays = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int size = arrays.length;
		for (int i = 0; i < size; i++) {
			System.out.println("elements are :" + arrays[i]);
		}
		// time complexity = O(n), space = O(1)
		Student[] student = new Student[3];
		student[0] = new Student(1, "aman");
		student[1] = new Student(2, "ssss");
		student[2] = new Student(3, "sbbbb");
		// student[3] = new Student(4, "sbbbb");

		for (int i = 0; i < student.length; i++) {
			System.out.println("student names are:" + student[i].rollno + " " + student[i].name);
		}

	}

}

class Student {

	int rollno;
	String name;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;

	}

}
