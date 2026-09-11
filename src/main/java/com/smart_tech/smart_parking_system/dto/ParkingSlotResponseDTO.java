package com.smart_tech.smart_parking_system.dto;

import com.smart_tech.smart_parking_system.enums.SlotStatus;
import com.smart_tech.smart_parking_system.enums.VehicleType;

public class ParkingSlotResponseDTO {

	private Long id;
    private String slotNumber;
    private SlotStatus status;
    private VehicleType slotType;
	public Long getId() { return id; }

	public void setId(Long id) { this.id = id; }

	public String getSlotNumber() { return slotNumber; }

	public void setSlotNumber(String slotNumber) { this.slotNumber = slotNumber; }

	public SlotStatus getStatus() { return status; }

	public void setStatus(SlotStatus status) { this.status = status; }

	public VehicleType getSlotType() { return slotType; }

	public void setSlotType(VehicleType slotType) { this.slotType = slotType; }

	public ParkingSlotResponseDTO() { }

}
