package com.ads.farmacia.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ads.farmacia.entidades.ProdForn;
import com.ads.farmacia.servicos.ProdFornServico;

@RestController
@RequestMapping(value = "/lojas")
public class ProdFornRecurso {

	@Autowired
	private ProdFornServico servico;
	
	@GetMapping
	public ResponseEntity<List<ProdForn>> findAll() {
		List<ProdForn> lista = servico.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
}
