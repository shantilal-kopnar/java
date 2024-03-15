  import java.util.Scanner;
 class  CheckTheCharacter 
 {
 	public static void main(String[] args) 
 	{
 	Scanner sc= new Scanner(System.in);
 	System.out.println("Enter the char");
 	Char ch =sc.next().charAt(0);
 	System.out.println(((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?((ch>='A'&&ch<='z')?"Upper Case Alphabet":"Lower Case Alphabet")):"nat alphabet");

 	}


 }