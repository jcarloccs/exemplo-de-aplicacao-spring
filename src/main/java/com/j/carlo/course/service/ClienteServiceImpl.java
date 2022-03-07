package com.j.carlo.course.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j.carlo.course.model.Cliente;
import com.j.carlo.course.model.ClienteRepository;
import com.j.carlo.course.model.Endereco;
import com.j.carlo.course.model.EnderecoRepository;
import com.j.carlo.course.model.ViaCep;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ViaCepService viaCepService;
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Integer id) {
		Optional<Cliente> clienteOptional = clienteRepository.findById(id);
		return clienteOptional.get();
	}
	
	@Override
	public Cliente inserir(Cliente cliente) {
		String cep = cliente.getEndereco().getCep();
		ViaCep viaCep = viaCepService.cep(cep);
		Endereco endereco = new Endereco(viaCep.getLogradouro(), cliente.getEndereco().getNumCasa(), viaCep.getCep(), viaCep.getBairro(), viaCep.getComplemento(), viaCep.getUf(), viaCep.getLocalidade());
		enderecoRepository.save(endereco);
		cliente.setEndereco(endereco);
		clienteRepository.save(cliente);
		return cliente;
	}

	@Override
	public void deletar(Integer id) {
		clienteRepository.deleteById(id);
	}

}
