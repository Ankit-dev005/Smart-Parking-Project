package com.smart_tech.smart_parking_system.dto;

import jakarta.validation.constraints.NotBlank;
public class ExitBookingDTO {

	@NotBlank(message = "Vehicle number is required")
	private String vehicleNumber;
	
	public ExitBookingDTO() { }

	public ExitBookingDTO(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleNumber() { return vehicleNumber; }

	public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }

}
