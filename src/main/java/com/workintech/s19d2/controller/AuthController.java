package com.workintech.s19d2.controller;

import com.workintech.s19d2.dto.RegisterResponse;
import com.workintech.s19d2.dto.RegistrationMember;
import com.workintech.s19d2.entity.Member;
import com.workintech.s19d2.service.AccountService;
import com.workintech.s19d2.service.AuthenticationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AuthController {

    @Autowired
    private final AuthenticationService authenticationService;

    @PostMapping("/auth/register")
    public RegisterResponse register(@RequestBody RegistrationMember registrationMember) {
        Member createdMember = authenticationService.register(registrationMember.email(), registrationMember.password());

        return new RegisterResponse(createdMember.getEmail(), "kayıt başarılı bir şekilde gerçekleşti.");
    }
}
