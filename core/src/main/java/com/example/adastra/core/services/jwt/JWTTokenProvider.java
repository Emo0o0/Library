package com.example.adastra.core.services.jwt;

import com.example.adastra.core.exceptions.jwt.JwtExpiredTokenException;
import com.example.adastra.core.exceptions.jwt.JwtInvalidTokenException;
import com.example.adastra.core.exceptions.jwt.JwtStringClaimsEmptyException;
import com.example.adastra.core.exceptions.jwt.JwtUnsupportedTokenException;
import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
//import org.springframework.security.core.Authentication;

import javax.crypto.SecretKey;
import java.util.Date;

@Configuration
public class JWTTokenProvider {

    @Value("${security.jwt.secret-key}")
    private String JWTSecret;

    @Value("${security.jwt.expiration-time}")
    private int JWTExpirationDate;

    public String generateToken(Authentication authentication) {
        Date currentDate = new Date();
        Date expireDate = new Date(currentDate.getTime() + JWTExpirationDate * 3600L * 24 * 1000);

        return Jwts.builder()
                .subject(authentication.getName())
                .issuedAt(currentDate)
                .expiration(expireDate)
                .signWith(key())
                .compact();
    }

    public String getUsername(String token) {
        Claims claims = Jwts.parser()
                .verifyWith(key())
                .build()
                .parseSignedClaims(token)
                .getPayload();
        return claims.getSubject();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser()
                    .verifyWith(key())
                    .build()
                    .parse(token);
            return true;
        } catch (MalformedJwtException ex) {
            throw new JwtInvalidTokenException("Invalid JWT token");
        } catch (ExpiredJwtException ex) {
            throw new JwtExpiredTokenException("Expired JWT token");
        } catch (UnsupportedJwtException ex) {
            throw new JwtUnsupportedTokenException("Unsupported JWT token");
        } catch (IllegalArgumentException ex) {
            throw new JwtStringClaimsEmptyException("JWT string claims is empty");
        }
    }

    private SecretKey key() {
        byte[] keyBytes = Decoders.BASE64.decode(JWTSecret);
        return Keys.hmacShaKeyFor(keyBytes);
    }

}
