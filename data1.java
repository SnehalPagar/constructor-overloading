/*6. Create a class to print an integer and a character using two functions having the 
same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first function are of the form (int n, char c), 
then that of the second function will be of the form (char c, int n).*/

class data
{
	data(int n, char c)
	{
		System.out.println("number:" +n+ " "+ "char:"+c);
	}
	data(char c, int n)
	{
		System.out.println( "char:" +c+ " "+  "number:"+n);
	}

}
public class data1
{
	public static void main(String[]args)
	{
		data d=new data(1,'a');	
		data d1=new data('z',26);	
	}
}