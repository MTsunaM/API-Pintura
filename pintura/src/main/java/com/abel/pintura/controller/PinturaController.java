package com.abel.pintura.controller;



import com.abel.pintura.DTO.SolicitacaodePinturaDTO;
import com.abel.pintura.DTO.ResultadodeSolicitacaoPinturaDTO;
import com.abel.pintura.service.CalculodeSolicitacaodePintura;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pintura")
public class PinturaController {

     private final CalculodeSolicitacaodePintura pintura;
     public PinturaController(CalculodeSolicitacaodePintura pintura){
         this.pintura = pintura;
     }

    @PostMapping
    public ResponseEntity<?> SolicitarPintura(@RequestBody SolicitacaodePinturaDTO dto) {



       if (dto.getTecnica() == null){
           return ResponseEntity.badRequest().body("Tecnica de pintura e obrigatorio");

       }

        if (dto.getLocal() == null){
            return ResponseEntity.badRequest().body("Local da pintura e obrigatorio");

        }

        if (dto.getTamanho() <=0){
            return ResponseEntity.badRequest().body("O Tamanho não pode ser 0");

        }

        if (dto.getCor() == null){
            return ResponseEntity.badRequest().body("A cor nao pode estar vazia");


        }

        ResultadodeSolicitacaoPinturaDTO resultado = pintura.CalculoOrcamento(dto);
        return ResponseEntity.ok(resultado);
    }





}
