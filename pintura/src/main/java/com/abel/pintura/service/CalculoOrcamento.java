package com.abel.pintura.service;


import com.abel.pintura.DTO.OrcamentodePinturaDTO;
import com.abel.pintura.DTO.ResultadoDeOrcamento;
import org.springframework.stereotype.Service;

@Service
public class CalculoOrcamento {


   public ResultadoDeOrcamento CalculoOrcamento(OrcamentodePinturaDTO dto){

       double precoBase = switch (dto.getTipo()){
           case Interna -> 20.0;
           case Externa -> 30.0;
           case Fachada -> 40.0;

       };

    double valor = precoBase * dto.getTamanho();

    ResultadoDeOrcamento reposta = new ResultadoDeOrcamento();
    reposta.setValor(valor);
    return reposta;

   }



}
