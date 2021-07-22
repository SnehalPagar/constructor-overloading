/*5. Create a class named 'PrintNumber' to print various numbers of different datatypes by creating 
different functions with the same name 'printn' having a parameter for each datatype.*/

class PrintNumber
{
	PrintNumber(int a,int b)
	{
	System.out.println("sum of two integer is:" +(a+b));
	}
        PrintNumber(float x,float y)
	{
	System.out.println("sum of two float is:" +(x*y));
	}
	PrintNumber(double p,double q)
	{
	System.out.println("sum of two double is:" +(p+q));
	}
	PrintNumber(String c,String d)
	{
	System.out.println("String fullsentence:" +(c+d));
	}
}
public class printn
{
	public static void main(String args[])
	{
	PrintNumber s=new PrintNumber(40,20);
	PrintNumber s1=new PrintNumber(0.5,0.6);
	PrintNumber s2=new PrintNumber(200,300);
	PrintNumber s3=new PrintNumber("Good"," night");
	}
}