package org.example.employeemanagementsystem.auth.service.Impl;




import lombok.AllArgsConstructor;
import org.example.employeemanagementsystem.auth.security.CustomUserDetails;
import org.example.employeemanagementsystem.entity.CompanyEntity;
import org.example.employeemanagementsystem.entity.UserEntity;
import org.example.employeemanagementsystem.repository.CompanyRepository;
import org.example.employeemanagementsystem.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;


@Service
@AllArgsConstructor
public class JwtUserDetailsService implements UserDetailsService {

    private final UsersRepository usersRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity user;

        try {
            Long mobile = Long.parseLong(username);
            user = usersRepository.findByMobileNumber(mobile).orElse(null);
        } catch (NumberFormatException e) {
            user = usersRepository.findByEmail(username).orElse(null);
        }

        if (user == null) {
            throw new UsernameNotFoundException("User not found: " + username);
        }

        if (user.getStatus() != 1) {
            throw new RuntimeException("User is inactive");
        }

        CompanyEntity company = companyRepository.findById(user.getCompanyId())
                .orElseThrow(() -> new RuntimeException("Company not found"));

        if (company.getStatus() != 1) {
            throw new RuntimeException("Company is inactive");
        }

        return new CustomUserDetails(
                user.getId(),
                username,
                user.getPassword(),
                getUserAuthorities()
        );
    }

    private static Collection<? extends GrantedAuthority> getUserAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));
    }

}
