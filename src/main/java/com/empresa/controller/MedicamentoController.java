package com.empresa.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;

@RestController
@RequestMapping("/rest/medicamento")
public class MedicamentoController {

	@Autowired
	private MedicamentoService service;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Medicamento>>listarMedicamento(){
		return ResponseEntity.ok(service.listaTodos());
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<HashMap<String,Object>>insertaMedicamento(@RequestBody Medicamento obj){
		
		HashMap<String,Object>salida= new HashMap<String,Object>();
		try {
			List<Medicamento>listaMedicamentoNombre=service.listaMedicamentoporNombre(obj.getDes_med());
			if(CollectionUtils.isEmpty(listaMedicamentoNombre)) {
				obj.setCod_med(0);
				Medicamento objSalida=service.insertaMedicamento(obj);
				if(objSalida==null) {
					salida.put("mensaje","Error en el registro");
				}else {
					salida.put("mensaje","REGISTRO EXITOSO");
				}
			}else{
				salida.put("mensaje", "El Medicamento ya existe:" + obj.getDes_med());
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje","Error en el registro"+e.getMessage());
		}

		return ResponseEntity.ok(salida);
	}
	
}
