package com.joao.dias.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao.dias.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
