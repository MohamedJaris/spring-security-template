package com.springSecurity.spring_security_template.service;

import com.springSecurity.spring_security_template.entity.Role;
import com.springSecurity.spring_security_template.entity.Users;
import com.springSecurity.spring_security_template.repository.UserDetailsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AdminUserInitializer {

    @Bean
    public CommandLineRunner createAdminUser(UserDetailsRepository userDetailsRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (userDetailsRepository.findByUsername("admin").isEmpty()) {
                Users admin = new Users();
                admin.setUsername("admin");
                admin.setPassword(passwordEncoder.encode("admin"));
                admin.setRole(Role.ADMIN);
                userDetailsRepository.save(admin);
                System.out.println("Default Admin User Created!");
            }
        };
    }
}
