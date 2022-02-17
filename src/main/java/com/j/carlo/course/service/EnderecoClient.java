package com.j.carlo.course.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.j.carlo.course.model.Endereco;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface EnderecoClient {
	
	@GetMapping("{cep}/json/")
    Endereco cep(@PathVariable("cep") String cep);

}
