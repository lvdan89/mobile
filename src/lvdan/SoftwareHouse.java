package lvdan;

import java.util.ArrayList;
import java.util.List;

public class SoftwareHouse {
	private String name;
	
	private List<Programmer> staff;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public List<Programmer> getStaff() {
		return staff;
	}

	
	public SoftwareHouse(String aname){
		this.name = aname;
		this.staff = new ArrayList<>();
	}
	
	
	public void Hire(Programmer staff){
		this.staff.add(staff);
	}
	
	public void displayStaff(){
		
		System.out.println("Lis Programmer in My SoftwareHouse :\t" + this.name);
	
		for(Programmer prg : this.getStaff()){			
			prg.display();
			
		}
	}
}
