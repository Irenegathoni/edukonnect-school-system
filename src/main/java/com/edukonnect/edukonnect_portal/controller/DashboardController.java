package com.edukonnect.edukonnect_portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    @GetMapping("/dashboard")
    public  String dashboard(Model model){
        model.addAttribute("pageTitle","Dashboard");
        model.addAttribute("activePage","dashboard");
        model.addAttribute("content","pages/dashboard :: content");
        return "fragments/layout";
    }
}
