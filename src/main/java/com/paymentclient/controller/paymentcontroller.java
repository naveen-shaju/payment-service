package com.paymentclient.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class paymentcontroller {

    @GetMapping("/checkpayment")
    public String checkPayment(@RequestParam String payment){
        return switch (payment) {
            case "ATM" -> "ATM";
            case "CASH" -> "CASH";
            default -> "";
        };

    }

}
