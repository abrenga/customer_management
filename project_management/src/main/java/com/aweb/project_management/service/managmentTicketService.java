package com.aweb.project_management.service;

import com.aweb.project_management.models.Ticket;
import com.aweb.project_management.repositories.ticketRepository;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class managmentTicketService implements ImanagmentTicketService {

    @Autowired
    public ticketRepository ticketRepo;



    @Override
    public Optional<Ticket>  findById(Integer id) {
       Optional<Ticket> ticketFoundedById = ticketRepo.findById(id);
        return ticketFoundedById;
    }

    public List<Ticket> findByCustomerId(Integer id){
        List<Ticket> ticketCustomer = ticketRepo.findByCustomer(id);
        return ticketCustomer;

    }


    public void insertTicket(Ticket ticket) {
        ticketRepo.save(ticket);
    }

    @Override
    public List<Ticket> getAllTicket() {
        return ticketRepo.findAll();
    }

    public void deleteTicket(Ticket ticket) {
        ticketRepo.delete(ticket);
    }



}
