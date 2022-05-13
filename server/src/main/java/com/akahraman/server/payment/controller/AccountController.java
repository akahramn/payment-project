package com.akahraman.server.payment.controller;


import com.akahraman.server.payment.model.Account;
import com.akahraman.server.payment.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    private AccountService accountService;

    @PostMapping(path = "/")
    public ResponseEntity<?> createAccount(@RequestBody Account account) {
        try {
            accountService.createAccount(account);

        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return ResponseEntity.ok().body(HttpStatus.OK);
    }
}
