package oop_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cardioService();
		fh.dentalService();
		fh.emergencyServices();
		fh.medicalTraining();
		fh.entService();
		fh.optServices();
		USMedical.billing();// by using the interface name we can access static billing method  
		//fh.billing();// not able to access
		fh.medInsurance();// default method can be accessed through fortis class obj 
		//after overriding o/p : FH -- medInsurance
		
		fh.covidTest();
		UNHG.covidGuidlines();// from UNHG class
		UNHG.medicalInfo();// from UNHG class
		
		//interface variable should be accessed using interface name
		System.out.println(USMedical.min_fee); //by default interface variables are static and final
		System.out.println(FortisHospital.min_fee);// not recommended way to access the interface variable 
		System.out.println();
		
		
		
		
		//can we create object for interface ?
		// strictly not allowed 
		
		//USMedical us = new USMedical(); not allowed 
		// Top Casting:
		// child class object can be referred by parent interface reference variable
		USMedical us = new FortisHospital();
		us.physioService();
		us.cardioService();
		us.emergencyServices();
		us.oncologyServices();
		// only USMedical interface methods are accessible i.e they have been overridden and reference type check is done so 
		//only USmedical will be accessible
		//us.billing();// not able to access
		us.medInsurance();// FH -- medInsurance
		us.covidTest();
		System.out.println();
		
		// only uk methods are accessible
		UKMedical uk = new FortisHospital();
		uk.emergencyServices();
		uk.entService();
		uk.pediaService();
		uk.covidTest();
		
		//Down Casting is possible??
		// Parent interface object can be referred by class reference variable
		
		//FortisHospital fh1 = new USMedical();// cannot create this down casting( parent interface object not possible )
		
		
		
		
		
		

	}

}
