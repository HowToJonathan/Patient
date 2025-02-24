/*
 * Class: CMSC203 
 * Instructor: Professor Grinberg
 * Description: In this program, a patient can get a summary of their procedures, the total cost, and an overview of themselves. 
 * Due: 03/01/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently. I have not copied the code from a student or   
 * any source. I have not given my code to any student.
 * Print your Name here: Jonathan Chang
*/
public class Procedure {
	private String procedureName;
	private String procedureDate;
	private String practitionerName;
	private double procedureCharge;
	//Default Constructor that takes no parameters
	public Procedure()
	{
	     procedureName = "";
	     procedureDate = "";
	     practitionerName = "";
	     procedureCharge = 0;
	}
	//Constructor that takes a name and date
	public Procedure(String name, String date)
	{
	     procedureName = name;
	     procedureDate = date;
	}
	//Constructor that takes all four variables for the instance variables
	public Procedure(String name, String date, String practitioner, double charge)
	{  
	     procedureName = name;
	     procedureDate = date;
	     practitionerName = practitioner;
	     procedureCharge = charge;
	}
	//All the Getter methods
	public String getProcedureName()
	{  
	    return procedureName;
	}

	public String getProcedureDate()
	{
	    return procedureDate;
	}

	public String getPractitionerName()
	{
	    return practitionerName;
	}

	public double getProcedureCharge()
	{
	    return procedureCharge;
	}
	//All the setter methods
	public void setProcedureName(String name)
	{  
	     procedureName = name;
	}

	public void setProcedureDate(String date)
	{  
	     procedureDate = date;
	}

	public void setPractitionerName(String practitioner)
	{  
	     practitionerName = practitioner;
	}

	public void ProcedureCharge(int charge)
	{  
	    procedureCharge = charge;
	}
	//Returns the toString of all the variables within the class with context text
	public String toString()
	{  
		return "\t Procedure Information:\n\t Procedure Name: " + procedureName + "\n\t Date: " + procedureDate + "\n\t Practitioner: " + practitionerName + "\n\t Charge: $" + procedureCharge;
	}

}
