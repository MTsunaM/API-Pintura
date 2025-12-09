package com.abel.pintura.service;


import com.abel.pintura.DTO.SolicitacaodePinturaDTO;
import com.abel.pintura.DTO.ResultadodeSolicitacaoPinturaDTO;
import org.springframework.stereotype.Service;

@Service
public class CalculodeSolicitacaodePintura {


   public ResultadodeSolicitacaoPinturaDTO CalculoOrcamento(SolicitacaodePinturaDTO dto){

       double precoBase = switch (dto.getLocal()){
           case Interna -> 20.0;
           case Externa -> 30.0;
           case Fachada -> 40.0;

       };

       double tecnicaBase = switch (dto.getTecnica()){
           case Grafiato -> 25.0;
           case Pinturalisa -> 18.0;


       };

    double valor = precoBase * dto.getTamanho() * tecnicaBase;

    ResultadodeSolicitacaoPinturaDTO resposta = new ResultadodeSolicitacaoPinturaDTO();
    resposta.setValor(valor);
    return resposta;

   }



}
