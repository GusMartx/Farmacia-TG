package com.ads.farmacia.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ads.farmacia.entidades.Fornecedor;
import com.ads.farmacia.servicos.FornecedorServico;

@RestController
@RequestMapping(value = "/fornecedores")
public class FornecedorRecurso {

	@Autowired
	private FornecedorServico servico;
	
	@GetMapping
	public ResponseEntity<List<Fornecedor>> findAll() {
		List<Fornecedor> lista = servico.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
}
