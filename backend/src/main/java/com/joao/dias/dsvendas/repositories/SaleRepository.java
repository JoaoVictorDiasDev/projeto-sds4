package com.joao.dias.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.joao.dias.dsvendas.dto.SaleSuccessDTO;
import com.joao.dias.dsvendas.dto.SaleSumDTO;
import com.joao.dias.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

	@Query("SELECT new com.joao.dias.dsvendas.dto.SaleSumDTO (obj.seller, SUM(obj.amount) ) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
		
	
	@Query("SELECT new com.joao.dias.dsvendas.dto.SaleSuccessDTO (obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
	
}
