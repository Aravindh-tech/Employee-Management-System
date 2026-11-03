package org.example.employeemanagementsystem.auth.audit;

import org.example.employeemanagementsystem.auth.security.CustomUserDetails;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;


import java.util.Optional;

public class AuditingAwareImpl implements AuditorAware<Long> {


    @Override
    public Optional<Long> getCurrentAuditor(){

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if(authentication == null || !authentication.isAuthenticated()){
            return Optional.empty();
        }

        CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();

        return Optional.of(userDetails.getUserId());
    }

}
