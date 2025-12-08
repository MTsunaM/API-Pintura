package com.abel.pintura.controller;



import com.abel.pintura.DTO.OrcamentodePinturaDTO;
import com.abel.pintura.DTO.ResultadoDeOrcamento;
import com.abel.pintura.service.CalculoOrcamento;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pintura")
public class pinturacontroller {

     private final CalculoOrcamento service;
     public pinturacontroller (CalculoOrcamento service){
         this.service = service;
     }

    @PostMapping
    public ResponseEntity<?> SolicitarOrcamento(@RequestBody OrcamentodePinturaDTO dto) {



        if (dto.getLocalPintura() == null) {
            return ResponseEntity.badRequest().body("O local de pintura e obrigatorio");

        }

        if (dto.getTipo() == null){
            return ResponseEntity.badRequest().body("Tipo de pintura e obrigatorio");

        }

        if (dto.getTamanho() <=0){
            return ResponseEntity.badRequest().body("O Tamanho não pode ser 0");

        }

        if (dto.getCor() == null){
            return ResponseEntity.badRequest().body("A cor nao pode estar vazia");


        }

        ResultadoDeOrcamento resultado = service.CalculoOrcamento(dto);
        return ResponseEntity.ok(resultado);
    }





}
