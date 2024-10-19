package hello;

public class Statement {
	String statement, pointname, qualifier, atrisknotes, followup, datetime;
	Classification classification;
	int observationnum;

	public Statement() {
		
	}
	
	public Statement(String s) {
		statement = s;
		String[] parts = statement.split(",\\s*");
		observationnum = Integer.parseInt(parts[0]);
		datetime = parts[1];
		pointname = parts[2];
		qualifier = parts[3];
		atrisknotes = parts[4];
		followup = parts[5];
		
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
