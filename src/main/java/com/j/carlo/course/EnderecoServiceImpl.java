package com.j.carlo.course;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl implements EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private EnderecoClient enderecoClient;
	
	@Override
	public Iterable<Endereco> buscarTodos() {
		return enderecoRepository.findAll();
	}

	@Override
	public Endereco buscarPorCep(String cep) {
		Optional<Endereco> enderecoOptional = enderecoRepository.findById(cep);
		return enderecoOptional.get();
	}

	@Override
	public void inserir(String cep) {
		Endereco endereco = enderecoClient.cep(cep);
		enderecoRepository.save(endereco);
	}

	@Override
	public void deletar(String cep) {
		enderecoRepository.deleteById(cep);
	}

}
