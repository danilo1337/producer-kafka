package br.com.danilo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.danilo.kafka.ContatoProducer;

@RestController
public class MensagemController {

	@Autowired
	private ContatoProducer contatoProducer;

	@PostMapping("contatos")
	public void publicarMensagem(@RequestBody String message) {
		contatoProducer.publicarMensagem(message);
	}
}
