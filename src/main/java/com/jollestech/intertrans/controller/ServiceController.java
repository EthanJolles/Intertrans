package com.jollestech.intertrans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiceController {

    @GetMapping("/services")
    public String getServicePage() {
        return "/services";
    }

    @GetMapping("/services/request-interpreter")
    public String getRequestInterpreterFormPage() {
        return "/request_interpreter";
    }
}
