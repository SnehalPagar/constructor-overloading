/*4. Create a class named 'Programming'. While creating an object of the class, 
if nothing is passed to it, then the message "I love programming languages" should be printed. 
If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
For example, while creating the object if we pass "cpp", then "I love cpp" should be printed.*/

class Programming
{
	Programming()
	{
		System.out.println("I love programming languages");
	}
	Programming(String a)
	{
		System.out.println("I love "+a);
	}

}
public class Programming1
{
	public static void main(String args[])
	{
		Programming p=new Programming();
		Programming p1=new Programming("cpp");
	}
}