package com.j.carlo.course.service;

import com.j.carlo.course.model.Cliente;

public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Integer id);

	Cliente inserir(Cliente cliente);

	void deletar(Integer id);

}
