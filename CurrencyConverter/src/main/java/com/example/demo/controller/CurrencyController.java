package com.example.demo.controller;

import com.example.demo.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CurrencyController {

    @Autowired
    private CurrencyService service;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/convert")
    public String convert(
            @RequestParam("from") String from,
            @RequestParam("to")  String to,
            @RequestParam("amount") double amount,
            Model model) {

        double result = service.convert(from, to, amount);

        model.addAttribute("result", result);
        return "result";
    }
}
