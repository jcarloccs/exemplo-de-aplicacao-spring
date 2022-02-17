package com.j.carlo.course.service;

import com.j.carlo.course.model.Endereco;

public interface EnderecoService {
	
	Iterable<Endereco> buscarTodos();

	Endereco buscarPorCep(String cep);

	Endereco inserir(String cep);

	void deletar(String cep);

}
