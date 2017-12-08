package lvdan;

import java.util.List;

public class MainTest {
	public static void main(String[] args) {
		// Create Programmer
		Programmer p1 = new Programmer(123,2000,"John","Ada");
		Programmer p2 = new Programmer(234,2500,"Ken","C++");
		Programmer p3 = new Programmer(345,3000,"Peter","Java");
		Programmer p4 = new Programmer(456,2500,"Alice","C#");
		Programmer p5 = new Programmer(567,3000,"Bob","VB");
		Programmer p6 = new Programmer(678,2500,"Peter","Android");
		Programmer p7 = new Programmer(789,3000,"Tony","IOS");
		
		// Software House
		SoftwareHouse sh = new SoftwareHouse("VNPT");
		sh.Hire(p1);
		sh.Hire(p2);
		sh.Hire(p3);
		sh.Hire(p4);
		sh.Hire(p5);
		sh.Hire(p6);
		sh.Hire(p7);
		//Leader
		ProjectLeader dotnet = new ProjectLeader("Dotnet");
		dotnet.AddTeam(p4);
		dotnet.AddTeam(p5);
				
		// Display	
		sh.displayStaff();
		dotnet.displayTeam();
		List<Programmer> lsdotnet = dotnet.getTeam();
		for(Programmer prg : lsdotnet){	
			prg.display();
			
		}
		
		ProjectLeader oop = new ProjectLeader("OOP");
		oop.AddTeam(p2);
		oop.AddTeam(p3);
		oop.displayTeam();
		List<Programmer> lsoop = oop.getTeam();
		for(Programmer prg : lsoop){	
			prg.display();			
		}
				
		ProjectLeader mobile = new ProjectLeader("Mobile");
		mobile.AddTeam(p6);
		mobile.AddTeam(p7);
		mobile.displayTeam();
		
		List<Programmer> lsmobile = mobile.getTeam();
		for(Programmer prg : lsmobile){	
			prg.display();			
		}
	}
}
