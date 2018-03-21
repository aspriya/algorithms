import java.util.*;

class Student{
	int indexNo;
	String name;
	int age;

	public Student(int indexNo, String name, int age){
		this.indexNo = indexNo;
		this.name = name;
		this.age = age;
	}
}

public class ArrayList3{
	public static void main(String[] args){
		Student s1 = new Student(134136, "Ashan", 27);
		Student s2 = new Student(135113, "Sripali", 25);
		Student s3 = new Student(134129, "Gayan", 26);

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);

		// 1st method to iterate through a collection object - by creating a iterator
		Iterator itr = students.iterator();
		while(itr.hasNext()){
			Student s = (Student)itr.next();
			System.out.println(s.indexNo+ " " + s.name + " "+ s.age);
		}

		// 2nd method to iterate a collection object - by a for-each loop
		// for(Student obj:students){
		// 	System.out.println(obj.indexNo + " " + obj.name + " " + obj.age);
		// }
	}
}