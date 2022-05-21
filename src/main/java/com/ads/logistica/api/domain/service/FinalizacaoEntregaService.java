package com.ads.logistica.api.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ads.logistica.api.domain.model.Entrega;
import com.ads.logistica.api.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class FinalizacaoEntregaService {

	private EntregaRepository entregaRepository;
	
	private BuscaEntregaService buscaEntregaService;
	
	@Transactional
	public void finalizar(Long id) {
		Entrega entrega = buscaEntregaService.buscar(id);
		entrega.finalizar();
		entregaRepository.save(entrega);
	}
	
}