package hello;

public class Classification {
	String result;
	Statement statement;
	
	
	public Classification() {
		
	}
	
	public Classification(Statement s) {
		statement = s;
	}
	
	public void whichClass() {
		if(statement.highEnergyPresent()==true && statement.highEnergyIncident()==true && statement.directControl()!=true && statement.seriousInjury()==true) {
			result = "hsif"; //High-Energy Serious Injury or Fatality
		}
		if(statement.highEnergyPresent()==true && statement.highEnergyIncident()==true && statement.directControl()!=true && statement.seriousInjury()!=true) {
			result = "psif"; //Potential Serious Injury or Fatality
		}
		if(statement.highEnergyPresent()!=true && statement.highEnergyIncident()!=true && statement.directControl()!=true && statement.seriousInjury()==true) {
			result = "lsif"; //Low-Energy Serious Injury or Fatality
		}
		if(statement.highEnergyPresent()==true && statement.highEnergyIncident()==true && statement.directControl()==true && statement.seriousInjury()!=true) {
			result = "capacity"; //Incident with a release of high energy in the presence of a direct control where a serious injury is not sustained
		}
		if(statement.highEnergyPresent()==true && statement.highEnergyIncident()!=true && statement.directControl()==true && statement.seriousInjury()!=true) {
			result = "success"; //Condition where a high-energy incident does not occur because of the presence of a direct control
		}
		if(statement.highEnergyPresent()==true && statement.highEnergyIncident()!=true && statement.directControl()!=true && statement.seriousInjury()!=true) {
			result = "exposure"; //Condition where high energy is present in the absence of a direct control
		}
		if(statement.highEnergyPresent()!=true && statement.highEnergyIncident()!=true && statement.directControl()!=true && statement.seriousInjury()!=true) {
			result = "low-severity";
		}
	}
	
}

