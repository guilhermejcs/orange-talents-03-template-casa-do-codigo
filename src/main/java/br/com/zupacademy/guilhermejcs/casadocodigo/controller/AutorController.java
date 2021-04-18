package br.com.zupacademy.guilhermejcs.casadocodigo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zupacademy.guilhermejcs.casadocodigo.controller.form.AutorForm;
import br.com.zupacademy.guilhermejcs.casadocodigo.model.Autor;
import br.com.zupacademy.guilhermejcs.casadocodigo.repository.AutorRepository;

@RestController
@RequestMapping("/autor")
public class AutorController {
	
	@Autowired
	private AutorRepository autorRepository;
	
	@PostMapping
	public void cadastrar(@RequestBody @Valid AutorForm form) {
		Autor autor = form.converter();
		autorRepository.save(autor);
	}

}
