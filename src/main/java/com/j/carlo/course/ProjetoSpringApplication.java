package com.j.carlo.course;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProjetoSpringApplication {
	
	private static final Logger log = LoggerFactory.getLogger(ProjetoSpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Endereco endereco = restTemplate.getForObject("https://viacep.com.br/ws/40435405/json/", Endereco.class);
			log.info(endereco.toString());
		};
	}

}
