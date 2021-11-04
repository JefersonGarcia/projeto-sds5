package com.garcia.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garcia.backend.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller,Long> {

}
