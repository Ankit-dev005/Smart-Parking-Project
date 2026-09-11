package com.smart_tech.smart_parking_system.map_struct;

import org.springframework.stereotype.Component;

import com.smart_tech.smart_parking_system.dto.UserRequestDTO;
import com.smart_tech.smart_parking_system.dto.UserResponseDTO;
import com.smart_tech.smart_parking_system.entity.Role;
import com.smart_tech.smart_parking_system.entity.User;

@Component
public class UserMapper {
    public User toUser(UserRequestDTO dto) {
        if (dto == null) return null;
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setPhone(dto.getPhone());
        if (dto.getRoleId() != null) {
            Role role = new Role();
            role.setId(dto.getRoleId());
            user.setRole(role);
        }
        return user;
    }

    public UserResponseDTO toUserResponseDTO(User user) {
        if (user == null) return null;
        UserResponseDTO dto = new UserResponseDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setPhone(user.getPhone());
        if (user.getRole() != null && user.getRole().getName() != null) {
            dto.setRole(user.getRole().getName().name());
        }
        return dto;
    }
}
