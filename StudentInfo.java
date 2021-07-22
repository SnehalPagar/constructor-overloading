/*8. Create a class 'Student' with three data members which are name, age and address. 
The constructor of the class assigns default values to name as "unknown", age as '0' 
and address as "not available". It has two functions with the same name 'setInfo'. 
First function has two parameters for name and age and assigns the same whereas the 
second function takes has three parameters which are assigned to name, age and address
 respectively. Print the name, age and address of 10 students.
Hint - Use array of objects */

class StudentInfo
{
	String name[];
	String age[];
	int address[];
	void display(String name[],int age[],String add[])
	{
		for(int i=1;i<name.length;i++)
		System.out.println(name[i]+"    "+add[i]+"    "+age[i]);
	}
	public static void main(String args[])
	{
		StudentInfo  s=new StudentInfo();
		String name[]={"sneha","neha","riya","shriya"};
		int age[]={22,21,20,25};
		String add[]={"dwarka","Sai Nagar","sinnar","nashik"};
		s.display(name,age,add);
	}
}