package com.pharmapartners2.api.controller;

import com.pharmapartners2.api.dao.UserModel;
import com.pharmapartners2.api.repository.UserRepository;
import com.pharmapartners2.api.service.JwtTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;
import com.pharmapartners2.api.model.LoginRequest;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@RestController
public class AuthController {
    private final JwtTokenService tokenService;
    private final AuthenticationManager authenticationManager;
    @Autowired
    private UserRepository userRepository;

    public AuthController(JwtTokenService tokenService, AuthenticationManager authenticationManager) {
        this.tokenService = tokenService;
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/login")
    public String token(@RequestBody LoginRequest userLogin) throws AuthenticationException {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userLogin.username(), userLogin.password()));
        if(authentication.isAuthenticated()) {
            var user = userRepository.findUserByUsername(userLogin.username());
            return tokenService.generateToken(authentication, user.getId());
        }
        return "Not authenticated";
    }

    @GetMapping("/user")
    public @ResponseBody List<UserModel> getAllUsers()
    {
        return userRepository.findAll();
    }
    @GetMapping("/user/{userId}")
    public @ResponseBody UserModel findUserById(@PathVariable int Id){return userRepository.findUserById(Id);}
}
