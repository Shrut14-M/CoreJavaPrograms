package com.abstraction;

public class Fan extends Appliance {

	@Override
	public void powerConsumption() {
		System.out.println("Fan consumes less power than the heater.");
	}

}
