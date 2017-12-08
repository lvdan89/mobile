package lvdan;

public class Employee {
	private int thePayrollNumber;
	public int getThePayrollNumber() {
		return thePayrollNumber;
	}

	public void setThePayrollNumber(int thePayrollNumber) {
		this.thePayrollNumber = thePayrollNumber;
	}

	public int getTheMonthlySalary() {
		return theMonthlySalary;
	}

	public void setTheMonthlySalary(int theMonthlySalary) {
		this.theMonthlySalary = theMonthlySalary;
	}

	public String getTheName() {
		return theName;
	}

	public void setTheName(String theName) {
		this.theName = theName;
	}

	private int theMonthlySalary;
	private String theName;
	
	//
	public Employee(int aPayrollNumber, int aMonthlySalary,String aName){
		this.setThePayrollNumber(aPayrollNumber);
		this.setTheMonthlySalary(aMonthlySalary);
		this.setTheName(aName);
	}
	
	public int getMonthlySalary(){
		return 0;
	}
	
	public void display(){
		//System.out.println("FirstName:\t"+ theName);
		//System.out.println("PayrollNumber:\t" + thePayrollNumber);
		//System.out.println("MonthlySalary:\t"+ theMonthlySalary);		
		
		System.out.println("FirstName:\t"+ theName + "\t" + "PayrollNumber:\t" + thePayrollNumber + "\t" + "MonthlySalary:\t"+ theMonthlySalary);
	}
	
}
