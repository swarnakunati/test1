package demo;

class Abc
{
	void swarna()
	{
	System.out.println("new class");
	}
}
class Xyz extends Abc
{
	void latha()
	{
		System.out.println("hello world");
	}
}
public class Mytest{

	public static void main(String[] args) {
		Xyz x=new Xyz();
		x.latha();
		x.swarna();


	}

}
