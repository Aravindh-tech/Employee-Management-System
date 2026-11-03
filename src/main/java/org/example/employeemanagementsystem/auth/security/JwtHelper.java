package org.example.employeemanagementsystem.auth.security;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Component
public class JwtHelper {

    public static final long JWT_TOKEN_VALIDITY = 12 * 60 * 60;

    private String secret = "8b3cd955bbc11f6ab8b201b91339ed704c11fef814c58169b1a14700d4c5a5be8b7a4111c2eaa47da1edfeae638a3c8cab5a21ffb35b682462519c46daced3bb0497bb78755a108d2c066f6728a6d8cc3996db8c811c67d08f4512f35844314fc8b3b35f81879009fc76d5dfd74ae5200328a1c275ec098c5860caa4add4f16e1d558506e74e7a70fd8b9de4f12ea025f9a8a734a918fa91799296f0461ce140ef2e602f6a751baf0cf56efd794a6ae2d96967d17ef96c5bbb6fb5c87bb4c426189d834259c4c41e938095d4a5c32fa0817d70fc624dfc61c371960f1b79f2980222ab3d689d40710287a51317f9c05cbe51acd57c13f08e4778b99042729e76";

    public String getUsernameFromToken(String token) {
        return getClaimFromToken(token, Claims::getSubject);
    }

    public Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

    private Claims getAllClaimsFromToken(String token) {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    }

    private Boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }

    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        return doGenerateToken(claims, userDetails.getUsername());
    }

    private String doGenerateToken(Map<String, Object> claims, String subject) {

        return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 1000))
                .signWith(SignatureAlgorithm.HS512, secret).compact();
    }

    public Boolean validateToken(String token, UserDetails userDetails) {
        final String username = getUsernameFromToken(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }
}
