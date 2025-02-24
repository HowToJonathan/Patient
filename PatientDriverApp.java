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
import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Patient patient;
        Procedure p1;
        Procedure p2;
        Procedure p3;

        //Asks questions. Answers are used to make objects of the Patient and Procedure class.
        System.out.print("Enter your first name: ");
        String fName = input.nextLine();
        System.out.print("Enter your middle name: ");
        String mName = input.nextLine();
        System.out.print("Enter your last name: ");
        String lName = input.nextLine();
        System.out.print("Enter your address: ");
        String address = input.nextLine();
        System.out.print("Enter your city: ");
        String city = input.nextLine();
        System.out.print("Enter your state: ");
        String state = input.nextLine();
        System.out.print("Enter your zip code: ");
        String zip = input.nextLine();
        System.out.print("Enter your phone number: ");
        String phoneNumber = input.nextLine();
        System.out.print("Enter your emergency contact’s name: ");
        String emergencyName = input.nextLine();
        System.out.print("Enter your emergency contact’s phone number: ");
        String emergencyPhoneNumber = input.nextLine();

        patient = new Patient(fName, mName, lName, address, city, state, zip, phoneNumber, emergencyName, emergencyPhoneNumber);
        System.out.println();
        System.out.print("Enter the procedure name: ");
        String pName = input.nextLine();
        System.out.print("Enter the procedure date: ");
        String pDate = input.nextLine();
        System.out.print("Enter the practitioner: ");
        String practitioner = input.nextLine();
        System.out.print("Enter the procedure charge: ");
        double pCharge = input.nextDouble();
        p1 = new Procedure(pName, pDate, practitioner, pCharge);
        
        System.out.println();
        input.nextLine();
        System.out.print("Enter the procedure name: ");
        pName = input.nextLine();
        System.out.print("Enter the procedure date: ");
        pDate = input.nextLine();
        System.out.print("Enter the practitioner: ");
        practitioner = input.nextLine();
        System.out.print("Enter the procedure charge: ");
        pCharge = input.nextDouble();
        p2 = new Procedure(pName, pDate, practitioner, pCharge);
        
        System.out.println();
        input.nextLine();
        System.out.print("Enter the procedure name: ");
        pName = input.nextLine();
        System.out.print("Enter the procedure date: ");
        pDate = input.nextLine();
        System.out.print("Enter the practitioner: ");
        practitioner = input.nextLine();
        System.out.print("Enter the procedure charge: ");
        pCharge = input.nextDouble();
        p3 = new Procedure(pName, pDate, practitioner, pCharge);
        
        input.close();
        System.out.println();
        
        displayPatient(patient);
        System.out.println();
        displayProcedure(p1);
        System.out.println();
        displayProcedure(p2);
        System.out.println();
        displayProcedure(p3);
        System.out.println();
        System.out.println("Total Charges: $" + calculateTotalCharges(p1, p2, p3));
    }

    public static void displayPatient(Patient patient) {
        System.out.println(patient.toString());
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure.toString());
    }

    public static String calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
    	String total = "" + (p1.getProcedureCharge() + p2.getProcedureCharge() + p3.getProcedureCharge());
    	//Makes the total is in the correct format with two digits after a decimal.
    	if (total.indexOf('.') == -1)
    	{
    	    total += ".00";
    	}
    	else if (total.length() - total.indexOf('.') == 2)
    	{
    	    total += "0";
    	}

    	String finalTotal = "";
    	int index = total.indexOf('.') - 1;
    	int count = 0;
    	//Loops through a String with the total without commas, and correctly puts a comma every three numbers by reseting the count
    	//to 0 whenever a period is found. This avoids any incorrect placements.
    	for (int i = total.length() - 1; i >= 0; i--) {
    	    

    	    if (i == index) {
    	        count = 0;
    	    } else {
    	        count++;
    	        if (count % 3 == 0 && i > 0 && i <= index) {
    	            finalTotal = "," + finalTotal;
    	        }
    	    }
    	    finalTotal = total.charAt(i) + finalTotal;
    	}
    	//Fixes any unexpected rounding errors.
    	int indexOfDecimal = finalTotal.indexOf(".");
    	finalTotal = finalTotal.substring(0, indexOfDecimal + 3);
    	//Returns the desire final total.
    	return finalTotal;
        
    }
}