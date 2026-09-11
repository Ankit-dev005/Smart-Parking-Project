package com.smart_tech.smart_parking_system.dto;

import com.smart_tech.smart_parking_system.enums.VehicleType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
public class ParkingSlotRequestDTO {
	
	@NotBlank(message = "Slot number is required")
    @Pattern(
        regexp = "^[A-Z0-9_-]+$",
        message = "Slot number must be uppercase alphanumeric (e.g., A1, B-12)"
    )
    private String slotNumber;

    @NotNull(message = "Vehicle type is required")
    private VehicleType slotType;

	public String getSlotNumber() { return slotNumber; }

	public void setSlotNumber(String slotNumber) { this.slotNumber = slotNumber; }

	public VehicleType getSlotType() { return slotType; }

	public void setSlotType(VehicleType slotType) { this.slotType = slotType; }

	public ParkingSlotRequestDTO() { }

}
