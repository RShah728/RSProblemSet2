package edu.monmouth.campusvehicle;

public class CampusVehicle {
	private String id;
	private String location;
	private boolean available;
	private final String DEFAULT_ID="UNKNOWN", DEFAULT_LOCATION="UNKNOWN";
	private final boolean DEFAULT_AVAILABLE=true;
	
	public CampusVehicle() {
		setId(DEFAULT_ID);
		setLocation(DEFAULT_LOCATION);
		setAvailable(DEFAULT_AVAILABLE);
	}
	public CampusVehicle(String id, String location, boolean available) {
		setId(id);
		setLocation(location);
		setAvailable(available);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		
		//we check if the string is null, if it doesn't have any characters, if its length is less than 4, if its length is greater than 12, and if doesn't start with MU
		if(id == null || id.length() == 0 || id.length() < 4 || id.length() > 12 || id.toUpperCase().startsWith("MU") == false)
		{
			this.id = DEFAULT_ID;
		}
		else
		{
			this.id = id;
		}
		
		
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		
		//if its null or has nothing it gets set to UNKNOWN
		if(location == null || location.length() == 0)
		{
			this.location = DEFAULT_LOCATION;
		}
		else
		{
			String upperCaseLocation = location.toUpperCase();

			//here we check if the location is correctly set to our locations and if not we set it to UNKNOWN
			if(upperCaseLocation.equals("LIBRARY") || upperCaseLocation.equals("UNIVERSITY BLUFFS") || upperCaseLocation.equals("PARKING LOT") || upperCaseLocation.equals("SPRUCE HALL") || upperCaseLocation.equals("LAUREL HALL"))
			{
				this.location = location;
			}
			else
			{
				this.location = DEFAULT_LOCATION;
			}
			
		}
		
		
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public void checkOut() {
		
		//if its available we can check out and set check out to false
		if(available == true)
		{
			available = false;
		}
		
	}
	public void returnVehicle() {
		available = true;
	}

}
