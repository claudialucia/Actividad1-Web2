package com.empresa.service;

import java.util.List;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {
	
	public abstract List<Medicamento>listaTodos();	
	public abstract Medicamento insertaMedicamento(Medicamento obj);
	public abstract List<Medicamento>listaMedicamentoporNombre(String des_med);
	
}
