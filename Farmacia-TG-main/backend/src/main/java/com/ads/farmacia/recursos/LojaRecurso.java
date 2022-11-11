package com.ads.farmacia.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ads.farmacia.entidades.Loja;
import com.ads.farmacia.servicos.LojaServico;

@RestController
@RequestMapping(value = "/lojas")
public class LojaRecurso {

	@Autowired
	private LojaServico servico;
	
	@GetMapping
	public ResponseEntity<List<Loja>> findAll() {
		List<Loja> lista = servico.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
}
