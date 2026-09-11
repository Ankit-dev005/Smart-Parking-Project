package com.smart_tech.smart_parking_system.dto;

import com.smart_tech.smart_parking_system.enums.VehicleType;

public class VehicleResponseDTO {

    private Long id;

    private String vehicleNumber;

    private VehicleType vehicleType;

    private String brand;

    private String color;

    private Long userId;

    private String userName;

    private String userEmail;
	public VehicleResponseDTO() { }

	public VehicleResponseDTO(Long id, String vehicleNumber, VehicleType vehicleType, String brand, String color, Long userId, String userName, String userEmail) {
		this.id = id;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
		this.brand = brand;
		this.color = color;
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
	}

	public Long getId() { return id; }

	public void setId(Long id) { this.id = id; }

	public String getVehicleNumber() { return vehicleNumber; }

	public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }

	public VehicleType getVehicleType() { return vehicleType; }

	public void setVehicleType(VehicleType vehicleType) { this.vehicleType = vehicleType; }

	public String getBrand() { return brand; }

	public void setBrand(String brand) { this.brand = brand; }

	public String getColor() { return color; }

	public void setColor(String color) { this.color = color; }

	public Long getUserId() { return userId; }

	public void setUserId(Long userId) { this.userId = userId; }

	public String getUserName() { return userName; }

	public void setUserName(String userName) { this.userName = userName; }

	public String getUserEmail() { return userEmail; }

	public void setUserEmail(String userEmail) { this.userEmail = userEmail; }

}