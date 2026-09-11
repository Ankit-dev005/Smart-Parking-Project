package com.smart_tech.smart_parking_system.map_struct;

import org.springframework.stereotype.Component;

import com.smart_tech.smart_parking_system.dto.VehicleRequestDTO;
import com.smart_tech.smart_parking_system.dto.VehicleResponseDTO;
import com.smart_tech.smart_parking_system.entity.Vehicle;
import com.smart_tech.smart_parking_system.entity.User;

@Component
public class VehicleMapper {
    public Vehicle toVehicle(VehicleRequestDTO dto) {
        if (dto == null) return null;
        Vehicle entity = new Vehicle();
        entity.setVehicleNumber(dto.getVehicleNumber());
        entity.setVehicleType(dto.getVehicleType());
        entity.setBrand(dto.getBrand());
        entity.setColor(dto.getColor());
        return entity;
    }

    public VehicleResponseDTO toVehicleResponseDTO(Vehicle vehicle) {
        if (vehicle == null) return null;
        VehicleResponseDTO dto = new VehicleResponseDTO();
        dto.setId(vehicle.getId());
        dto.setVehicleNumber(vehicle.getVehicleNumber());
        dto.setVehicleType(vehicle.getVehicleType());
        dto.setBrand(vehicle.getBrand());
        dto.setColor(vehicle.getColor());
        User user = vehicle.getUser();
        if (user != null) {
            dto.setUserId(user.getId());
            dto.setUserName(user.getName());
            dto.setUserEmail(user.getEmail());
        }
        return dto;
    }
}
