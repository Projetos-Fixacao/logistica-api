package com.ads.logistica.api.domain.service;

import org.springframework.stereotype.Service;

import com.ads.logistica.api.domain.exception.EntidadeNaoEncontradaException;
import com.ads.logistica.api.domain.model.Entrega;
import com.ads.logistica.api.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {

	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long id) {
		return entregaRepository.findById(id)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}
	
}