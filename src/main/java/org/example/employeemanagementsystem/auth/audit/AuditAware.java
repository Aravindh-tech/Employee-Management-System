package org.example.employeemanagementsystem.auth.audit;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@Configuration
public class AuditAware {

    @Bean
    public AuditorAware<Long> auditorAware(){
        return new AuditingAwareImpl();
    }
}
