package hello;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HelloWorld 
{
	public static void main(String[] args) throws IOException
	{
		int value = 0;
		int s = 0;
		
		Map<String, Integer> map = new HashMap<>();
		map.put("incorrect", 1);
		map.put("injury", 9);
		map.put("hazard", 10);
		map.put("fire", 10);
		map.put("damaged", 5);
		map.put("hosptial", 15);
		map.put("pinch", 8);
		map.put("fall", 10);
		map.put("trip", 8);
		map.put("slip", 8);
		map.put("sprain", 4);
		map.put("burn", 10);
		map.put("puncture", 10);
		map.put("explosion", 15);
		map.put("rescue", 10);
		map.put("police", 10);
		map.put("ambulence", 10);
		map.put("death", 15);
		map.put("fatality", 15);
		map.put("serious", 5);
		map.put("arc flash", 9);
		map.put("radiation", 15);
		map.put("danger", 8);
		map.put("confusion", 1);
		map.put("inexperience", 1);
		map.put("head knocker", 2);
		map.put("safety", 1);
		map.put("debree", 5);
		map.put("concern", 2);
		map.put("critical", 3);
		map.put("first aid", 9);
		map.put("fail", 6);
		map.put("issue", 1);
		map.put("crush", 5);
		map.put("harm", 9);
		map.put("stress", 2);
		map.put("suspended", 9);
		map.put("not", 1);
		map.put("mistake", 4);
		map.put("sharp", 5);
		map.put("cut", 4);
		map.put("emergency", 10);
		map.put("dead", 10);
		map.put("foreman", 1);
		map.put("accident", 5);
		map.put("didn't", 1);
		map.put("inadequte", 2);
		map.put("struck", 3);
		
		Scanner sc = new Scanner(new File("src/hello/file.csv"));  
		sc.useDelimiter(",");   //sets the delimiter pattern  idk if i need this
		int i = 0;
		int j = 0;
		while (sc.hasNext())  //returns a boolean value  
		{  	
			String[][] things = new String[5][10];
		
			if(i > 6) {
				things[i][j] = sc.next();
				i++;
			}
			else {
				i = 0;
				j++;
			}
			System.out.print(sc.next());  //find and returns the next complete token from this scanner  
		}   
		sc.close();  //closes the scanner  
		
	
		Scanner k = new Scanner(System.in);
		System.out.println("Input a sentence. ");
		String statement = k.nextLine();
		
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String word = entry.getKey();
            s = entry.getValue();
            
            // Check if the word appears in the sentence
            if (statement.contains(word)) {
                value += s;
                System.out.println(word);
            }
        }
        
        System.out.println(value);
		
		/*System.out.println("Input the file you'd like read: ");
		
		File file = new File(k.nextLine());
		
		String content = new String(Files.readAllBytes(Paths.get(file.getPath())));
		String[] lines = content.split("\\r?\\n");
		
		for(int i = 0; i < lines.length; i++) 
		{
			Statement statement = new Statement(lines[i]);
			statement.setValue(map);
		}
		*/
		
	}
}
