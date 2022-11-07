package com.ads.farmacia.recursos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ads.farmacia.entidades.Loja;

@RestController
@RequestMapping(value = "/lojas")
public class LojaRecurso {

	@GetMapping
	public ResponseEntity<List<Loja>> findAll() {
		List<Loja> lista = new ArrayList<>();
		lista.add(new Loja(123456789, "Rua damasio slvador", 18020345, 180203252, "Squirtle society"));
		lista.add(new Loja(987654321, "Rua salvador damasio", 18020467, 991007073, "Blue pharma"));
		return ResponseEntity.ok().body(lista);
	}
	
}
