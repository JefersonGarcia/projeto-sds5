package com.garcia.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garcia.backend.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long> {

}
