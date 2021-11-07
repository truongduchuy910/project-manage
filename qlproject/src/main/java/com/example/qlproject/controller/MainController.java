package com.example.qlproject.controller;

import com.example.qlproject.model.Account;
import com.example.qlproject.model.Work;
import com.example.qlproject.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class MainController {
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    AccountService accountService;

    @GetMapping(value = "/login")
    public String login() {
        return "/main/login";
    }

    @GetMapping(value = "/logged")
    public String logged(Model model) {
        return "/trangchu";
    }

    @GetMapping(value = "/sigup")
    public String logup(Account account, Model model) {
        model.addAttribute("account", new Account());
        return "/main/sigup";
    }

    //    @PostMapping(value = "/sigup")
//    public String logupg(Account account) {
//        String password = bCryptPasswordEncoder.encode(account.getPassword());
//        account.setPassword(password);
//        this.accountService.create(account);
//        return "/main/login";
//
//    }
    @PostMapping(value = "/sigup")
    public ResponseEntity<Void> logupg(@RequestBody(required = false) Account account) {
        String password = bCryptPasswordEncoder.encode(account.getPassword());
        account.setPassword(password);
        this.accountService.create(account);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
