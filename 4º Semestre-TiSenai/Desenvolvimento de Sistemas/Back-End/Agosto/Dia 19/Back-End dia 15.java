package com.senai.aula1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Anotações da Classe
@SpringBootApplication
@RestController
public class Aula1Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula1Application.class, args);
	}
        
        // Anotação do metodo.
        @GetMapping("/")
        
        // "Pulbic" modificador de acesso.
        // "String" tipo de retorno do metodo.
        // "helloWorld" nome do metodo.
        // "{  }" Parametros.
        public ResponseEntity<Numero> helloWorld(){
            
            Numero num = new Numero();
            num.setNumero1(1);
            num.setNumero2(2);
            
            return ResponseEntity.accepted().body(num);
        }

        @PostMapping("/")   
        public String post(@RequestBody Numero num){
            System.out.println("Numero1=" + num.getNumero1());
            System.out.println("Numero2=" + num.getNumero2());
            return "post";
        }
}
