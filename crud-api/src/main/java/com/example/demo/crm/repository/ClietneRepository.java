package com.example.demo.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.crm.model.Cliente;

@Repository
public interface ClietneRepository extends JpaRepository<Cliente, Long> {

}
