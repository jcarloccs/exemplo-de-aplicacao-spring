package com.j.carlo.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.j.carlo.course.model.Endereco;
import com.j.carlo.course.service.EnderecoService;

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
	public ResponseEntity<Endereco> buscarPorCep(@PathVariable String cep) {
		return ResponseEntity.ok(enderecoService.buscarPorCep(cep));
	}
	
	@PostMapping
	public ResponseEntity<Endereco> inserir(@RequestBody Endereco endereco) {
		enderecoService.inserir(endereco.getCep());
		return ResponseEntity.ok(endereco);
	}
	
	
}
