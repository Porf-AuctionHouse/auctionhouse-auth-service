package com.ah.authservice.service;

import com.ah.authservice.model.entity.AppUsers;
import com.ah.authservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;


    @Override
    public AppUsers loadUserByUsername(String userNameOrEmail) throws UsernameNotFoundException {
        AppUsers user = userRepository.findByEmail(userNameOrEmail);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with email: " + userNameOrEmail);
        }
        return user;
    }

}

