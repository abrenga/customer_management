package com.aweb.project_management.controllers;

import com.aweb.project_management.service.IgestioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class gestionePrenotazione {
    @Autowired
    IgestioneService eventService;

    @GetMapping("/administration")
    public String showEvents(Model model){
        model.addAttribute("eventFile", eventService.getAllEvents());


        return "";
    }


}
