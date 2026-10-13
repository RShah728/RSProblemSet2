package edu.monmouth.problemSet2;

import edu.monmouth.campusvehicle.CampusVehicle;

public class ProblemSet2 {

	public static void main(String[] args) {

		
		CampusVehicle campusVehicle1 = new CampusVehicle();
		
		
		
		System.out.println("Campus Vehicle 1 ID: " + campusVehicle1.getId());
		System.out.println("Campus Vehicle 1 Location: " + campusVehicle1.getLocation());
		System.out.println("Campus Vehicle 1 Available: " + campusVehicle1.isAvailable());

		
		
		campusVehicle1.setId("MU1111");
		campusVehicle1.setLocation("Library");
		campusVehicle1.setAvailable(true);

		
		
		System.out.println();
		
		
		
		System.out.println("Campus Vehicle 1 ID: " + campusVehicle1.getId());
		System.out.println("Campus Vehicle 1 Location: " + campusVehicle1.getLocation());
		System.out.println("Campus Vehicle 1 Available: " + campusVehicle1.isAvailable());
		campusVehicle1.checkOut();
		System.out.println("After we use checkOut, the Campus Vehicle 1 Available: " + campusVehicle1.isAvailable());

		campusVehicle1.returnVehicle();
		System.out.println("After we use returnVehicle, the Campus Vehicle 1 Available: " + campusVehicle1.isAvailable());

		
		
		
		CampusVehicle campusVehicle2 = new CampusVehicle("MU2222", "Spruce Hall", false);

		
		
		System.out.println();

		
		
		System.out.println("Campus Vehicle 2 ID: " + campusVehicle2.getId());
		System.out.println("Campus Vehicle 2 Location: " + campusVehicle2.getLocation());
		System.out.println("Campus Vehicle 2 Available: " + campusVehicle2.isAvailable());

		
		
		campusVehicle2.setId("MU1090");
		campusVehicle2.setLocation("library");
		campusVehicle2.setAvailable(true);
		
		
		
		
		System.out.println();

		
		
		
		System.out.println("Campus Vehicle 2 ID: " + campusVehicle2.getId());
		System.out.println("Campus Vehicle 2 Location: " + campusVehicle2.getLocation());
		System.out.println("Campus Vehicle 2 Available: " + campusVehicle2.isAvailable());
		campusVehicle2.checkOut();
		System.out.println("After we use checkOut, the Campus Vehicle 2 Available: " + campusVehicle2.isAvailable());

		campusVehicle2.returnVehicle();
		System.out.println("After we use returnVehicle, the Campus Vehicle 2 Available: " + campusVehicle2.isAvailable());
		
		
		
		
		System.out.println();

		
		
		
		CampusVehicle badCampusVehicle1 = new CampusVehicle(null, null, true);
		System.out.println("Bad Campus Vehicle 1 ID: " + badCampusVehicle1.getId());
		System.out.println("Bad Campus Vehicle 1 Location: " + badCampusVehicle1.getLocation());
		System.out.println("Bad Campus Vehicle 1 Available: " + badCampusVehicle1.isAvailable());
		badCampusVehicle1.checkOut();
		System.out.println("After we use checkOut, the Bad Campus Vehicle 1 Available: " + badCampusVehicle1.isAvailable());

		badCampusVehicle1.returnVehicle();
		System.out.println("After we use returnVehicle, the Bad Campus Vehicle 1 Available: " + badCampusVehicle1.isAvailable());
		
		
		
		
		System.out.println();

		
		
		
		CampusVehicle badCampusVehicle2 = new CampusVehicle("MU2", "Student Dorms", true);
		System.out.println("Bad Campus Vehicle 2 ID: " + badCampusVehicle2.getId());
		System.out.println("Bad Campus Vehicle 2 Location: " + badCampusVehicle2.getLocation());
		System.out.println("Bad Campus Vehicle 2 Available: " + badCampusVehicle2.isAvailable());
		badCampusVehicle2.checkOut();
		System.out.println("After we use checkOut, the Bad Campus Vehicle 2 Available: " + badCampusVehicle2.isAvailable());

		badCampusVehicle2.returnVehicle();
		System.out.println("After we use returnVehicle, the Bad Campus Vehicle 2 Available: " + badCampusVehicle2.isAvailable());
		
		
		
		
		System.out.println();

		
	
		
		CampusVehicle badCampusVehicle3 = new CampusVehicle("MU67676767676767", "Rutgers", true);
		System.out.println("Bad Campus Vehicle 3 ID: " + badCampusVehicle3.getId());
		System.out.println("Bad Campus Vehicle 3 Location: " + badCampusVehicle3.getLocation());
		System.out.println("Bad Campus Vehicle 3 Available: " + badCampusVehicle3.isAvailable());
		badCampusVehicle3.checkOut();
		System.out.println("After we use checkOut, the Bad Campus Vehicle 3 Available: " + badCampusVehicle3.isAvailable());

		badCampusVehicle3.returnVehicle();
		System.out.println("After we use returnVehicle, the Bad Campus Vehicle 3 Available: " + badCampusVehicle3.isAvailable());
		
		
		
		
		System.out.println();

		
	
		
		CampusVehicle badCampusVehicle4 = new CampusVehicle("", "", true);
		System.out.println("Bad Campus Vehicle 4 ID: " + badCampusVehicle4.getId());
		System.out.println("Bad Campus Vehicle 4 Location: " + badCampusVehicle4.getLocation());
		System.out.println("Bad Campus Vehicle 4 Available: " + badCampusVehicle4.isAvailable());
		badCampusVehicle4.checkOut();
		System.out.println("After we use checkOut, the Bad Campus Vehicle 4 Available: " + badCampusVehicle4.isAvailable());

		badCampusVehicle4.returnVehicle();
		System.out.println("After we use returnVehicle, the Bad Campus Vehicle 4 Available: " + badCampusVehicle4.isAvailable());
		
		
		
		
		System.out.println();

		
	
		
		CampusVehicle badCampusVehicle5 = new CampusVehicle("HH1234", "", true);
		System.out.println("Bad Campus Vehicle 5 ID: " + badCampusVehicle5.getId());
		System.out.println("Bad Campus Vehicle 5 Location: " + badCampusVehicle5.getLocation());
		System.out.println("Bad Campus Vehicle 5 Available: " + badCampusVehicle5.isAvailable());
		badCampusVehicle5.checkOut();
		System.out.println("After we use checkOut, the Bad Campus Vehicle 5 Available: " + badCampusVehicle5.isAvailable());

		badCampusVehicle5.returnVehicle();
		System.out.println("After we use returnVehicle, the Bad Campus Vehicle 5 Available: " + badCampusVehicle5.isAvailable());
		
	}
	

}
