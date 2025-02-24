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
public class Patient {
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String emergencyName;
	private String emergencyPhoneNumber;
	//Default constructor that accepts no parameters
	public Patient()
	{
		firstName = "";
		middleName = "";
		lastName = "";
		streetAddress = "";
		city = "";
		state = "";
		zipCode = "";
		phoneNumber = "";
		emergencyName = "";
		emergencyPhoneNumber = "";
	}
	//Constructor that accepts first, middle, and last name
	public Patient(String theFirstName, String theMiddleName, String theLastName)
	{
		firstName = theFirstName;
		middleName = theMiddleName;
		lastName = theLastName;
	}
	//Constructor that accepts parameters for all private variables
	public Patient(String theFirstName, String theMiddleName, String theLastName, String theAddress, String theCity, String theState, String zip, String phone, String theEmergencyName, String theEmergencyPhoneNumber)
	{
		firstName = theFirstName;
		middleName = theMiddleName;
		lastName = theLastName;
		streetAddress = theAddress;
		city = theCity;
		state = theState;
		zipCode = zip;
		phoneNumber = phone;
		emergencyName = theEmergencyName;
		emergencyPhoneNumber = theEmergencyPhoneNumber;
	}
	//All getter methods
    public String getFirstName() 
    { 
    	return firstName; 
    }
    
    public String getMiddleName()
    {
    	return middleName;
    }
    
    public String getLastName()
    {
    	return lastName;
    }
    
    public String getStreetAddress()
    { 
    	return streetAddress;
    }
    
    public String getCity()
    {
    	return city; 
    }
    
    public String getState()
    { 
    	return state; 
    }
    
    public String getZipCode()
    {
    	return zipCode;
    }
    
    public String getPhoneNumber()
    {
    	return phoneNumber;
    }
    
    public String getEmergencyName()
    {
    	return emergencyName;
    }
    
    public String getEmergencyPhoneNumber()
    {
    	return emergencyPhoneNumber;
    }
    
    
    //All setter methods
    public void setFirstName(String name)
    {
    	firstName = name;
    }
    
    public void setMiddleName(String name)
    {
    	middleName = name;
    }
    
    public void setlastName(String name)
    {
    	lastName = name;
    }
    
    public void setStreetAddress(String address)
    {
    	streetAddress = address;
    }
    
    public void setCity(String theCity)
    {
    	city = theCity;
    }
    
    public void setState(String theState)
    {
    	state = theState;
    }
    
    public void setZipCode(String zip)
    {
    	zipCode = zip;
    }
    
    public void setPhoneNumber(String phone)
    {
    	phoneNumber = phone;
    }
    
    public void setEmergencyName(String name)
    {
    	emergencyName = name;
    }
    
    public void setEmergencyPhoneNumber(String number)
    {
    	emergencyPhoneNumber = number;
    }
    //Returns the full name
    public String buildFullName()
    {
    	return firstName + " " + middleName + " " + lastName;
    }
    //Returns the full address
    public String buildAddress()
    {
    	return streetAddress + " " + city + " " + state + " " + zipCode;
    }
    //Returns the emergency contact
    public String buildEmergencyContact()
    {
    	return emergencyName + " " + emergencyPhoneNumber;
    }
    
    //Returns the full toString with all variables within the patient class
    public String toString()
    {
    	return "Patient info:\n  Name: " + buildFullName() + "\n  Address: " + buildAddress() + "\n  Phone Number: " + phoneNumber + "\n  Emergency Contact: " + buildEmergencyContact();

    }
    
}
