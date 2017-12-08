package lvdan;

public class Programmer extends Employee{
	private String theLanguage;

	public String getTheLanguage() {
		return theLanguage;
	}

	public void setTheLanguage(String theLanguage) {
		this.theLanguage = theLanguage;
	}
	
	public Programmer(int aPayrollNumber, int aMonthlySalary,String aName,String aLanguage) {
		super(aPayrollNumber,aMonthlySalary,aName);
		this.setTheLanguage(aLanguage);
	}	
	
	public void display() {
		super.display();
		System.out.println("The Language:\t"+ theLanguage);
	}

}
