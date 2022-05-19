package com.ads.logistica.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ads.logistica.api.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Alana");
		cliente1.setTelefone("9999999999");
		cliente1.setEmail("alana@com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Rafaela");
		cliente2.setTelefone("9999999999");
		cliente2.setEmail("rafaela@com");
		
		return Arrays.asList(cliente1,cliente2);
	}
}
