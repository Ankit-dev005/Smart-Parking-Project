package com.smart_tech.smart_parking_system.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.smart_tech.smart_parking_system.dto.LoginRequestDTO;
import com.smart_tech.smart_parking_system.entity.Role;
import com.smart_tech.smart_parking_system.entity.User;
import com.smart_tech.smart_parking_system.repository.RoleRepository;
import com.smart_tech.smart_parking_system.repository.UserRepository;
import com.smart_tech.smart_parking_system.security.JwtUtils;


@Service
public class AuthService {
	public AuthService(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder, JwtUtils jwtUtils) {
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.passwordEncoder = passwordEncoder;
		this.jwtUtils = jwtUtils;
	}


	private final UserRepository userRepository;

	private final RoleRepository  roleRepository;
	
	private final PasswordEncoder passwordEncoder;
	
	private final JwtUtils jwtUtils;
	
	public User registerUserService(User user) {
		
		 Role role = roleRepository.findById(user.getRole().getId())
		            .orElseThrow(() -> new RuntimeException("Role not found"));

		    user.setRole(role); // ✅ full object with name

		
		return userRepository.saveAndFlush(user);
	}
	
	public String login(LoginRequestDTO dto) {

	        User user = userRepository.findByEmail(dto.getEmail())
	                .orElseThrow(() -> new RuntimeException("User not found"));

	        if (!passwordEncoder.matches(dto.getPassword(), user.getPassword())) {
	            throw new RuntimeException("Invalid password");
	        }

	        return jwtUtils.generateToken(user.getEmail());
	    }

}
