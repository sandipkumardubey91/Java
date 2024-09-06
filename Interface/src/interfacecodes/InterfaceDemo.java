package interfacecodes;

interface Computer
{
	   void compileCode();
	
}

class Laptop implements Computer
{
	public void compileCode()
	{
		System.out.println("5 errors......");
	}
}
class Desktop implements  Computer
{
	public void compileCode()
	{
		System.out.println("5 errors......, faster");
	}
	
}

class Developer
{
	
	void buildingApp(Computer obj)
	{
		System.out.println("Building App.");
		obj.compileCode();
	}
}



public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Computer obj = new Laptop();
		Computer obj = new Desktop();
		Developer d =new Developer();
		
		d.buildingApp(obj);
		
	}

}
