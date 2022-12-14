package com.ads.farmacia.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ads.farmacia.entidades.Produto;
import com.ads.farmacia.servicos.ProdutoServico;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoRecurso {

	@Autowired
	private ProdutoServico servico;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		List<Produto> lista = servico.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
}
