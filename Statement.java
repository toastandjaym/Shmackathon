package hello;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Statement {
	String statement, pointname, qualifier, atrisknotes, followup, datetime;
	Classification classification;
	int observationnum, value;
	//String[] badinjuries = {"struck", "caught between", "confined space", "explosion", "steam", "arc flash", "toxic chemicals", "radiation", "suspended load", "trench", "excavation", "electrical contact"};
	
	public Statement() {
		
	}
	
	public Statement(String s) {
		statement = s;
		String[] parts = statement.split("\\?");
		System.out.println(Arrays.toString(parts));
		observationnum = Integer.parseInt(parts[0]);
		System.out.println(observationnum);
		datetime = parts[1];
		System.out.println(datetime);
		pointname = parts[2];
		System.out.println(pointname);
		qualifier = parts[3];
		atrisknotes = parts[4];
		followup = parts[5];
		
	}
	
	public void setValue(Map<String, Integer> m) {
		// Iterate over the map, checking for each word in the sentence
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            String word = entry.getKey();
            int s = entry.getValue();
            
            // Check if the word appears in the sentence
            if (statement.contains(word)) {
                value += s;
            }
        }
	}
	
	public int getValue() {
		return value;
	}

	public boolean highEnergyPresent() {
		
		return false;
	}
	
	public boolean highEnergyIncident() {
		
		return false;
	}
	
	public boolean directControl() {
		
		return false;
	}
	
	public boolean seriousInjury() {
		
		return false;
	}
	
}
