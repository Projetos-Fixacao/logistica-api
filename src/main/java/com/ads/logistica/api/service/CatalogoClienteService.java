package com.ads.logistica.api.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ads.logistica.api.exception.NegocioException;
import com.ads.logistica.api.model.Cliente;
import com.ads.logistica.api.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CatalogoClienteService {
	
	private ClienteRepository clienteRepository;
	
	@Transactional
	public Cliente salvar(Cliente cliente) {
		boolean emailExistente = clienteRepository.finddByEmail(cliente.getEmail())
				.stream()
				.anyMatch(clienteExistente -> !clienteExistente.equals(cliente));
		
		if(emailExistente) {
			throw new NegocioException("E-mail já cadastrado.");
		}
		return clienteRepository.save(cliente);
	}
	
	@Transactional
	public void excluir(Long id) {
		clienteRepository.deleteById(id);
	}
}
