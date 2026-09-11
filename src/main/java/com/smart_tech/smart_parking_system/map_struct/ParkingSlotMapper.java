package com.smart_tech.smart_parking_system.map_struct;

import org.springframework.stereotype.Component;

import com.smart_tech.smart_parking_system.dto.ParkingSlotRequestDTO;
import com.smart_tech.smart_parking_system.dto.ParkingSlotResponseDTO;
import com.smart_tech.smart_parking_system.entity.ParkingSlot;

@Component
public class ParkingSlotMapper {
    public ParkingSlot toParkingSlot(ParkingSlotRequestDTO dto) {
        if (dto == null) return null;
        ParkingSlot entity = new ParkingSlot();
        entity.setSlotNumber(dto.getSlotNumber());
        entity.setSlotType(dto.getSlotType());
        return entity;
    }

    public ParkingSlotResponseDTO toParkingSlotResponseDTO(ParkingSlot entity) {
        if (entity == null) return null;
        ParkingSlotResponseDTO dto = new ParkingSlotResponseDTO();
        dto.setId(entity.getId());
        dto.setSlotNumber(entity.getSlotNumber());
        dto.setStatus(entity.getStatus());
        dto.setSlotType(entity.getSlotType());
        return dto;
    }
}
