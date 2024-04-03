class ReturnExample3
{
	public static void main(String[] args) 
	{
		byte a =10;
		add(a,20);
		
	}
	public static void add(byte num1,int num2)
	{
		System.out.println("byte, int");
	}
	public static void add(byte num1, int num2)
	{
		System.out.println("byte num1, int num2");
		return 0;
	}
}