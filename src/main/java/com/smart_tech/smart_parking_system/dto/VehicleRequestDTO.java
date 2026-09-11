package com.smart_tech.smart_parking_system.dto;

import com.smart_tech.smart_parking_system.enums.VehicleType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
public class VehicleRequestDTO {

	@NotBlank(message = "Vehicle number is required")
	@Pattern(regexp = "^[A-Z0-9-]+$", message = "Vehicle number must be uppercase")
	private String vehicleNumber;

	@NotNull(message = "Vehicle type is required")
	private VehicleType vehicleType;

	@NotBlank(message = "Brand is required")
	private String brand;

	@NotBlank(message = "Color is required")
	private String color;
	public VehicleRequestDTO() { }

	public VehicleRequestDTO(String vehicleNumber, VehicleType vehicleType, String brand, String color) {
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
		this.brand = brand;
		this.color = color;
	}

	public String getVehicleNumber() { return vehicleNumber; }

	public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }

	public VehicleType getVehicleType() { return vehicleType; }

	public void setVehicleType(VehicleType vehicleType) { this.vehicleType = vehicleType; }

	public String getBrand() { return brand; }

	public void setBrand(String brand) { this.brand = brand; }

	public String getColor() { return color; }

	public void setColor(String color) { this.color = color; }

}