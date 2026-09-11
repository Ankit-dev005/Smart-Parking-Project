package com.smart_tech.smart_parking_system.service;

import org.springframework.stereotype.Service;

import com.smart_tech.smart_parking_system.dto.ParkingSlotRequestDTO;
import com.smart_tech.smart_parking_system.dto.ParkingSlotResponseDTO;
import com.smart_tech.smart_parking_system.entity.ParkingSlot;
import com.smart_tech.smart_parking_system.enums.SlotStatus;
import com.smart_tech.smart_parking_system.map_struct.ParkingSlotMapper;
import com.smart_tech.smart_parking_system.repository.ParkingSlotRepository;


@Service
public class ParkingSlotService {
	public ParkingSlotService(ParkingSlotRepository parkingSlotRepository, ParkingSlotMapper parkingSlotMapper) {
		this.parkingSlotRepository = parkingSlotRepository;
		this.parkingSlotMapper = parkingSlotMapper;
	}

	
	private final ParkingSlotRepository parkingSlotRepository;
	
	private final ParkingSlotMapper parkingSlotMapper;
	
	public ParkingSlotResponseDTO registerParkingSlot(ParkingSlotRequestDTO dto) {

		if (parkingSlotRepository.existsBySlotNumber(dto.getSlotNumber())) {
			throw new RuntimeException("Parking slot already exists");
		}

		ParkingSlot slot = parkingSlotMapper.toParkingSlot(dto);

		// Default status
		slot.setStatus(SlotStatus.AVAILABLE);

		ParkingSlot savedSlot = parkingSlotRepository.saveAndFlush(slot);

		//
		ParkingSlotResponseDTO response = parkingSlotMapper.toParkingSlotResponseDTO(savedSlot);
		
		return response;
	}
	
}
