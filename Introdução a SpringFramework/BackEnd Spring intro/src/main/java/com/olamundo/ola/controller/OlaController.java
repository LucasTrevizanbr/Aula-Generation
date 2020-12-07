package com.olamundo.ola.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class OlaController {

	@GetMapping
	public String ola() {
		return "Quero melhorar minha atenção aos detalhes, aprender mais sobre o git e github e melhorar"
				+ " meu trabalho em equipe";
	}
}
