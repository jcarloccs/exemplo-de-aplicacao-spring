package com.j.carlo.course;

public interface EnderecoService {
	
	Iterable<Endereco> buscarTodos();

	Endereco buscarPorCep(String cep);

	void inserir(String cep);

	void deletar(String cep);

}
