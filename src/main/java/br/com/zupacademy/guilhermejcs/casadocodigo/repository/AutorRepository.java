package br.com.zupacademy.guilhermejcs.casadocodigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zupacademy.guilhermejcs.casadocodigo.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>{
	
}
