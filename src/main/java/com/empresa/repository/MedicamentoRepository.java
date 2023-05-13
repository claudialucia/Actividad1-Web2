package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.empresa.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer>{

	@Query("select  e from Medicamento e where e.des_med = ?1" )
	public List<Medicamento>listaporNombreDeMedicamento(String des_med);
	
	
	
	
}
