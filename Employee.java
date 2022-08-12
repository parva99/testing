package project2.src.employee;
//
//import com.core.demo.employee;
//
//public class Employee 
//{
//	
//	void main string 
//
//}
//
//
//public int Setname(string a)
//{
//	string empname;
//	empname=a;
//	System.out.println("employee name is"+ empname);
//	
//}
//public static void main(String[] args)
//{
//	employee emp=new employee();
//	int aa=emp.add();
//	System.out.println(aa);
//}


public class Employee
{
	public int add()
	{
		int a=40, b=20;
		int c=a+b;
		System.out.println("addition is"+c);
		return c;
		
	}
	public static void main(String[] args)
	{
		Employee emp=new Employee();
		int aa=emp.add();
		System.out.println(aa);
	}
}
