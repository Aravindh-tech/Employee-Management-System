package org.example.employeemanagementsystem.auth.controller;


import org.example.employeemanagementsystem.auth.model.JwtRequest;
import org.example.employeemanagementsystem.auth.model.JwtResponse;
import org.example.employeemanagementsystem.auth.security.JwtHelper;
import org.example.employeemanagementsystem.auth.service.Impl.JwtUserDetailsService;
import org.example.employeemanagementsystem.entity.UserEntity;
import org.example.employeemanagementsystem.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private JwtUserDetailsService userDetailsService;

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private JwtHelper helper;

    @Autowired
    private UsersRepository usersRepository;


    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody JwtRequest request) {

        String input = request.getUserName();

        UserEntity user;

        try {
            Long mobile = Long.parseLong(input);
            user = usersRepository.findByMobileNumber(mobile).orElse(null);
        } catch (NumberFormatException e) {
            user = usersRepository.findByEmail(input).orElse(null);
        }

        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("User not found");
        }

        if (user.getStatus() == 0) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("User is inactive");
        }

        this.doAuthenticate(input, request.getPassword());

        UserDetails userDetails = userDetailsService.loadUserByUsername(input);

        String token = this.helper.generateToken(userDetails);

        JwtResponse response = JwtResponse.builder()
                .jwtToken(token)
                .userName(userDetails.getUsername())
                .users(user)
                .build();

        return ResponseEntity.ok(response);
    }

    private void doAuthenticate(String username, String password) {

        UsernamePasswordAuthenticationToken authentication =
                new UsernamePasswordAuthenticationToken(username, password);

        try {
            // System.out.println("try");
            manager.authenticate(authentication);
        } catch (BadCredentialsException e) {

            throw new BadCredentialsException("Invalid username or password");
        }
    }
}


