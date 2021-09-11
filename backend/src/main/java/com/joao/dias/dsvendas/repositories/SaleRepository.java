package com.joao.dias.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao.dias.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
