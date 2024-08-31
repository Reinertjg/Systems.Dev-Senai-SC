
package com.senai.calculadora.controllers;

import com.senai.calculadora.dtos.CalculadoraDTO;
import com.senai.calculadora.dtos.RespostaCalculoDTO;
import com.senai.calculadora.services.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
    
    @Autowired
    CalculadoraService calcService;
    
    @PostMapping("/soma")
    public ResponseEntity<RespostaCalculoDTO> soma(@RequestBody CalculadoraDTO dados){
        
        RespostaCalculoDTO resultado = calcService.soma(dados);
        
        return ResponseEntity.ok().body(resultado);
    }
    
    @PostMapping("/subtracao")
    public ResponseEntity<RespostaCalculoDTO> subtracao(@RequestBody CalculadoraDTO dados){
        
        RespostaCalculoDTO resultado = calcService.subtracao(dados);
        
        return ResponseEntity.ok().body(resultado);
    }
    
    @PostMapping("/multiplicacao")
    public ResponseEntity<RespostaCalculoDTO> multiplicacao(@RequestBody CalculadoraDTO dados){
        
        RespostaCalculoDTO resultado = calcService.multiplicacao(dados);
        
        return ResponseEntity.ok().body(resultado);
    }
    
    @PostMapping("/divisao")
    public ResponseEntity<RespostaCalculoDTO> divisao(@RequestBody CalculadoraDTO dados){
        
        RespostaCalculoDTO resultado = calcService.divisao(dados);
        
        return ResponseEntity.ok().body(resultado);
    }
    
}
