package com.class23;

public class ScrumTeam extends Employee {
	
	public String artifacts;
	public String ceremonies;
	
	public void workOnArtifact() {
		System.out.println("Scrum team work on "+ artifacts);
	}
	public void attendScrumMeeting() {
		System.out.println("Scrum team work on "+ ceremonies);
	}

}
