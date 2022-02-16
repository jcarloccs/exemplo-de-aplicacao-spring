package com.j.carlo.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("enderecos")
public class EnderecoRestController {

	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping
	public ResponseEntity<Iterable<Endereco>> buscarTodos() {
		return ResponseEntity.ok(enderecoService.buscarTodos());
	}
	
	@GetMapping("/{cep}")
	public ResponseEntity<Iterable<Endereco>> inserir(@PathVariable String cep) {
		enderecoService.inserir(cep);
		return ResponseEntity.ok(enderecoService.buscarTodos());
	}
	
}
