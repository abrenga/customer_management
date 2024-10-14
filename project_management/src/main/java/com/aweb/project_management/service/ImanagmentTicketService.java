package com.aweb.project_management.service;

import com.aweb.project_management.models.Ticket;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface ImanagmentTicketService {


    Optional<Ticket> findById(Integer id);


    public void insertTicket(Ticket ticket);

    List<Ticket> getAllTicket();
}
