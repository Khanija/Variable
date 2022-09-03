package hello.world;

public class Variable 
{
	public void StudentAge()
	{
		int age = 0;
		age = age+20;
		System.out.println("Student age is:"+age);
	}
 
	public static void main(String[] args) 
	{
		Variable temp = new Variable();
		temp.StudentAge();
		
	}
}
