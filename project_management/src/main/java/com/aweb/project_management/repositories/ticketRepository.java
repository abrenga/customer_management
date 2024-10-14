package com.aweb.project_management.repositories;


 import com.aweb.project_management.models.Customer;
 import com.aweb.project_management.models.Ticket;
 import org.springframework.data.jpa.repository.JpaRepository;

 import java.util.List;
 import java.util.Optional;


public interface ticketRepository extends JpaRepository<Ticket, Integer> {


 List<Ticket> findByCustomer(Integer id);
}
