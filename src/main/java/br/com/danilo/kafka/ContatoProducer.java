package br.com.danilo.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ContatoProducer {
	
	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
	
    public void publicarMensagem(String messagem) {
        kafkaTemplate.send("contatos", messagem);
    }
}
