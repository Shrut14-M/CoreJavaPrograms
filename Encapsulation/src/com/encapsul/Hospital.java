package com.encapsul;

public class Hospital {
public static void main(String[] args) {
	PatientDetails p = new PatientDetails();
	p.setPatientName("Aashta Shrivastav");
	System.out.println("Name of the Patient is "+ p.getPatientName());
	p.setDisease("Fever");
	System.out.println("Diagnosed Disease is "+ p.getDisease());
	p.setTotalExpense(2000);
	System.out.println("Total Expenditure is "+p.getTotalExpense());
	p.setGuardianName("sakshi Shrivastav");
	System.out.println("Guardian of this patient is "+ p.getGuardianName());
}
}
