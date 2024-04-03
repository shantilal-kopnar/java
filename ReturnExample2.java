class ReturnExample2
{
	public static void main(String[] args)
    {
    	byte a =10;
    	byte b =20;
    	add (b+0,a);
		
	}
	public static void add (byte num1,int num2)
	{
		System.out.println("byte,int");
	}
	public static void add (int num1, int num2)
	{
		System.out.println("int,int");
	}
}