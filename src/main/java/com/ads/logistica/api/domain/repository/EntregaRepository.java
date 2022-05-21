package com.ads.logistica.api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ads.logistica.api.domain.model.Entrega;

	@Repository
	public interface EntregaRepository extends JpaRepository<Entrega, Long> {

	}

