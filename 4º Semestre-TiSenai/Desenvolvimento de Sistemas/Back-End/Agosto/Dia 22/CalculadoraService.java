
package com.senai.calculadora.services;

import com.senai.calculadora.dtos.CalculadoraDTO;
import com.senai.calculadora.dtos.RespostaCalculoDTO;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    
    RespostaCalculoDTO resultado = new RespostaCalculoDTO();
    
    public RespostaCalculoDTO soma(CalculadoraDTO dados){
        
        resultado.setNumero1(dados.getNumero1());
        resultado.setNumero2(dados.getNumero2());
        resultado.setResultado(dados.getNumero1() + dados.getNumero2());
        
        return resultado;
        
    }
    
    public RespostaCalculoDTO subtracao(CalculadoraDTO dados){

        resultado.setResultado(dados.getNumero1() - dados.getNumero2());
        
        return resultado;
        
    }
    
    public RespostaCalculoDTO multiplicacao(CalculadoraDTO dados){

        resultado.setResultado(dados.getNumero1() * dados.getNumero2());
        
        return resultado;
        
    }
    
    public RespostaCalculoDTO divisao(CalculadoraDTO dados){

        resultado.setResultado(dados.getNumero1() / dados.getNumero2());
        
        return resultado;
        
    }
}
