package oop_Interface;

public class FortisHospital extends UNHG implements USMedical, UKMedical,IndianMedical{
	
	// 4 parents 1 class and 3 interfaces
	// 2 class cannot extend 

	//always override methods from the interface
	//US Medical
	@Override
	public void physioService() {
		System.out.println("FH -- physioService");
		
	}

	@Override
	public void cardioService() {
		System.out.println("FH -- cardioService");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");
		
	}

	//UK Medical
	@Override
	public void entService() {
		System.out.println("FH -- entService");
		
	}

	@Override
	public void pediaService() {
		System.out.println("FH -- pediaService");
		
	}

	//India Medical
	@Override
	public void orthoService() {
		System.out.println("FH -- orthoService");
		
	}

	@Override
	public void dentalService() {
		System.out.println("FH -- dentalService");
		
	}
	
	//Fortis
	public void medicalTraining() {
		System.out.println("FH -- medicalTraining");
	}
	
	public void optServices() {
		System.out.println("FH -- optServices");
	}

	//interfaces can have same methods but class will override only once
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
		
	}
	
	//default method override of USMedical interface is possible?
	// yes it is allowed 
	@Override
	public void medInsurance() {
		System.out.println("FH -- med Insurance");
	}

	@Override
	public void covidTest() {
		System.out.println("FH -- covidTest");
		
	}
	
	
	
	

}
