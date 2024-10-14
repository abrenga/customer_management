package com.aweb.project_management.controllers;

import com.aweb.project_management.models.Ticket;
import com.aweb.project_management.service.ImanagmentTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class Cat {
    public int id;
    public String name;
}

public class CatResponse {
    public Cat cat;
    public String modifyRoute;

    public CatResponse(Cat cat, String modifyRoute) {
        this.cat = cat;
        this.modifyRoute = modifyRoute;
    }
}


@RestController
@RequestMapping("/tickets")
public class RestTicketManagment {
    @Autowired
    ImanagmentTicketService managmentTicketService;


    @GetMapping("/cats/{id}")
    public ResponseEntity<CatResponse> getCat(@PathVariable("id") Integer id) {
        Cat cat = service.getCatById(id);

        return new ResponseEntity<>(new CatResponse(cat, "POST /cats/5"), HttpStatus.OK);
    }

    @PostMapping("/cats/{id}")
    public ResponseEntity modifyCat(@PathVariable("id") Integer id, @RequestBody Cat cat) {
        service.modifyCat(id, cat);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}









    @GetMapping
    public ResponseEntity<List<Ticket>> showTickets() {
        List<Ticket> tickets = managmentTicketService.getAllTicket();
        if (tickets != null) {
            return new ResponseEntity<>(tickets, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        }


        //prendiamo l'id per il singolo giornovb.
        @GetMapping("/{id}")
        public ResponseEntity<List<Ticket>> getTicketId(@PathVariable("id") Integer id){
            Optional<Ticket> ticket = managmentTicketService.findById(id);
            if (ticket != null) {
                return new ResponseEntity<>(ticket, HttpStatus.OK);

            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }


    }
    
