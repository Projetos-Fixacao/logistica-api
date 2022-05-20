package com.ads.logistica.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ads.logistica.api.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	List<Cliente> findByNome(String nome);
	List<Cliente> findByNomeContaining(String nome);
	Optional<Cliente> finddByEmail(String email);
}
