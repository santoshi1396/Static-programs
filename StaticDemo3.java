class StaticDemo3{
	
	static
	{
	System.out.println("I am Static1 before  Main");
	}
	static
	{
	System.out.println("I am Static2 Before Main");
	}
	
	public static void main(String[]args)
	{
	
	System.out.println("I am Main");
	}
	static
	{
	System.out.println("I am Static after Main");
	}
	
}