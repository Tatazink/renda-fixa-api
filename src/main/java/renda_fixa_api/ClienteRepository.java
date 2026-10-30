package renda_fixa_api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository 
extends JpaRepository<Cliente, Long> {
    
}
