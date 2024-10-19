package hello;

import java.util.Scanner;

public class HelloWorld 
{
	public static void main(String[] args)
	{
		
		Scanner k = new Scanner(System.in);
		System.out.println("Input a thing: ");
		Statement statement = new Statement(k.next());
		
	}
}
