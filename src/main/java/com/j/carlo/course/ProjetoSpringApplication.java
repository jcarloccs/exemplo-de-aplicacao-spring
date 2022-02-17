package com.j.carlo.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.j.carlo.course.model.Endereco;
import com.j.carlo.course.model.EnderecoRepository;
import com.j.carlo.course.service.EnderecoClient;

@SpringBootApplication
@EnableFeignClients
public class ProjetoSpringApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringApplication.class, args);
	}
	
	Endereco endereco;
	
	@Bean
    public CommandLineRunner rodar(EnderecoClient enderecoClient, EnderecoRepository enderecoRepository) {
        return args -> {
                endereco = enderecoClient.cep("40435405");
                enderecoRepository.save(endereco);
                endereco = enderecoClient.cep("40436220");
                enderecoRepository.save(endereco);
                
                for (Endereco endereco1 : enderecoRepository.findAll()) {
                	System.out.println(endereco1.toString());
                }
        };
    }

}
