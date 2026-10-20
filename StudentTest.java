package lab3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Student{

	//data
	String name;
	int id;
	
	//constructor
	Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	Student(){
		this.name = "unknown";
		this.id = 0;
	}
	//method
	public void print() {
		System.out.printf("%d %s \n", id, name);
	}

	String getName() {
		return name;
	}
}
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student st1 = new Student ("Pheakna", 123);
		Student st2 = new Student();
		Student st3 = new Student();
		
		System.out.print("Enter name: ");
		String stuName = sc.nextLine();
		System.out.print("Enter ID: ");
		int stuID = sc.nextInt();
		//Student st3 = new Student(name,StuID )
		st3 = new Student(stuName, stuID);
		
		st1.print();
		st2.print();
		st3.print();
		
		System.out.print(st3);
		System.out.print(st3.getName() + " " +st1.getName());
		
		//let store list of students
		List<Student> aistudent = new ArrayList<Student>();
		
		aistudent.add(st1);
		aistudent.add(st2);
		aistudent.add(st3);
		
		aistudent.add( new Student("minea", 123));
		
		System.out.println(aistudent.size());
		
		for(Student s : aistudent) {
			s.print();
		}
		
	}

}
