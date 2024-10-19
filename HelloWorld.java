package hello;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class HelloWorld 
{
	public static void main(String[] args) throws IOException
	{
		
		Scanner k = new Scanner(System.in);
		System.out.println("Input the file you'd like read: ");
		
		File file = new File(k.nextLine());
		
		String content = new String(Files.readAllBytes(Paths.get(file.getPath())));
		String[] lines = content.split("\\r?\\n");
		
		Statement statement = new Statement();
		
	}
}
