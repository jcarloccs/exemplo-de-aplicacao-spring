package com.j.carlo.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.j.carlo.course.model.Cliente;
import com.j.carlo.course.model.ClienteRepository;
import com.j.carlo.course.model.Endereco;
import com.j.carlo.course.model.EnderecoRepository;
import com.j.carlo.course.model.ViaCep;
import com.j.carlo.course.service.ViaCepService;

@SpringBootApplication
@EnableFeignClients
public class ProjetoSpringApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner run(ClienteRepository clienteRepository, EnderecoRepository enderecoRepository, ViaCepService viaCepService) {
        return args -> {
        	ViaCep viaCep = viaCepService.cep("40435405");
        	Endereco endereco = new Endereco(viaCep.getCep(), viaCep.getBairro(), viaCep.getComplemento(), viaCep.getUf(), viaCep.getLocalidade());
        	enderecoRepository.save(endereco);
        	Cliente cliente = new Cliente("Jean", 35, endereco);
        	clienteRepository.save(cliente);
        	
        	System.out.println(cliente);
        };
    }

}
