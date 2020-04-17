package com.example.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
//import javax.naming.AuthenticationException;
//
//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.bean.ApiResponse;
import com.example.rest.bean.AuthToken;
import com.example.rest.bean.Customer;
import com.example.rest.bean.LoginCustomer;
import com.example.rest.config.JwtTokenUtil;
import com.example.rest.service.CustomerServiceImpl;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/token")
public class AuthenticationController {

	
	
	@Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private CustomerServiceImpl customerService;

    @RequestMapping(value = "/generate-token", method = RequestMethod.POST)
    public ResponseEntity register(@RequestBody LoginCustomer loginCustomer) throws AuthenticationException {

        final org.springframework.security.core.Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                		loginCustomer.getCustomerEmail(),
                		loginCustomer.getPassword()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        final Customer cust = customerService.findOne(loginCustomer.getCustomerEmail());
        final String token = jwtTokenUtil.generateToken(cust);
//        return new ApiResponse(200, "success",new AuthToken(token, cust.getCustomerEmail()));
//        return new ApiResponse(200, "success",cust.getCustomerEmail()));
		return null;
    }

}
