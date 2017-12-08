package lvdan;

import java.util.ArrayList;
import java.util.List;

public class ProjectLeader {
	private String leader;	
	private String name;	
	private List<Programmer> team;
	
	public ProjectLeader(String aname){
		this.name = aname;
		this.team = new ArrayList<>();
	}
	
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	
	public List<Programmer> getTeam() {
		return team;
	}
	public void AddTeam(Programmer team) {
		this.team.add(team);		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayTeam(){
		System.out.println("++++++++++++++ Team: " + this.name + " ++++++++++++++");		
		System.out.println("List Programmer");		
	
	}
}
