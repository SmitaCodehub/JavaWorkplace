
//IS-A, HAS-A

class Calcu                  //Super , Parent , Base Class
{
	public  int add(int i, int j)
	{
		return i+j;
	}
	
}

class CalcuAdv extends Calcu               //Sub, Child, Derived Class
{
	public  int sub(int i, int j)          //CalcuAdv inherits Calcu Single level Iheritance
	{
		return i-j;
	}
	
}

class CalcuVAdv extends CalcuAdv                 //CalcuVAdv inherits CalcuAdv and Calcu multi level Iheritance
{
	public  int mul(int i, int j)
	{
		return i*j;
	}
	
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result1;
		int result2;
		int result3;
		
		CalcuVAdv c1 =new CalcuVAdv();
		result1=c1.add(9, 2);
		result2=c1.sub(9,2);
		result3=c1.mul(9,2);
		System.out.println("ADD "+result1);
		System.out.println("SUB "+result2);
		System.out.println("MUL "+result3);
		
		
	}

}
