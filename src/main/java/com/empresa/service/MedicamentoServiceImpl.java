package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {

	@Autowired
	private MedicamentoRepository repository;
	
	@Override
	public List<Medicamento> listaTodos() {
		
		return repository.findAll();
	}

	@Override
	public Medicamento insertaMedicamento(Medicamento obj) {
		
		return repository.save(obj);
	}

	@Override
	public List<Medicamento> listaMedicamentoporNombre(String des_med) {

		return repository.listaporNombreDeMedicamento(des_med);
	}

}
