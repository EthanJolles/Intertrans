package com.jollestech.intertrans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactUsController {

    @GetMapping("/contact")
    public String getContactUsPage() {
        return "/contact";
    }
}
