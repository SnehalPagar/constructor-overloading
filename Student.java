/*1.Write a program to print the names of students by creating a Student class. 
If no name is passed while creating an object of the Student class, then the name should be "Unknown", 
otherwise the name should be equal to the String value passed while creating the object of the Student class.*/
class Student
{
	Student()
	{
 		System.out.println("unknown");
	}
	Student(String a)
	{
 		System.out.println(a);
	}
	public static void main(String args [])
	{
		Student s=new Student();
		Student s1=new Student("snehal");
	}
}