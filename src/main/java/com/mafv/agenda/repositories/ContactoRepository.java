package com.mafv.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mafv.agenda.models.Contacto;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer>{
    
}
