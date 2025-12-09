package com.abel.pintura.service;

import com.abel.pintura.DTO.ResultadoSolicitacaoReparoDTO;
import com.abel.pintura.DTO.SolicitacaoReparoDTO;
import org.springframework.stereotype.Service;

@Service
public class CalculodeSolicitacaodeReparo {


   private double precoBase  (SolicitacaoReparoDTO dto){

        return switch (dto.getReparo()) {

        case Interna -> 10.0;
        case Externa -> 20.0;
        case Fachada -> 30.0;

    };

    }

    public ResultadoSolicitacaoReparoDTO CalculoReparoPortao(SolicitacaoReparoDTO dto){

        double precoBase = precoBase(dto);
        double precoPortao = switch (dto.getPortoes()){

            case Ferrugem -> 15.0;
            case Madeira -> 20.0;

        };


        double valor = precoPortao * dto.getTamanho() * precoBase;

        ResultadoSolicitacaoReparoDTO resposta = new ResultadoSolicitacaoReparoDTO();
        resposta.setValorPortao(valor);

        return resposta;
    }


    public ResultadoSolicitacaoReparoDTO CalculoReparoParede (SolicitacaoReparoDTO dto){
        double precoBase = precoBase(dto);
        double precoParedes = switch (dto.getParedes()){

            case Mofo -> 20.0;
            case Trinca -> 15.0;
            case Descascamento -> 10.0;
            case Buracos -> 5.0;

        };


        double valor = precoParedes * dto.getTamanho() * precoBase;

        ResultadoSolicitacaoReparoDTO resposta = new ResultadoSolicitacaoReparoDTO();
        resposta.setValorParedes(valor);

        return resposta;

    }


}
