package org.example.employeemanagementsystem.auth.model;




import lombok.*;
import org.example.employeemanagementsystem.entity.UserEntity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtResponse {

    private String jwtToken;
    private String userName;
    private UserEntity users;
}

