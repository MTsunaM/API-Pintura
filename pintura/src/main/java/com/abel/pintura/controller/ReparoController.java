package com.abel.pintura.controller;



import com.abel.pintura.DTO.ResultadoSolicitacaoReparoDTO;
import com.abel.pintura.DTO.SolicitacaoReparoDTO;
import com.abel.pintura.service.CalculodeSolicitacaodeReparo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reparo")
public class ReparoController {

     private final CalculodeSolicitacaodeReparo reparo;
     public ReparoController (CalculodeSolicitacaodeReparo reparo){
         this.reparo = reparo;
     }

      @PostMapping ("/portao")
      public ResponseEntity <?> SolicitarReparoPortao (@RequestBody SolicitacaoReparoDTO dto){

         if (dto.getTamanho() <=0 ){
             return ResponseEntity.badRequest().body("O tamanho não pode ser 0");

         }

         if (dto.getPortoes() == null){
             return ResponseEntity.badRequest().body("O tipo de raparo de portao nao pode estar vazio");

         }

         if (dto.getReparo() == null){
             return ResponseEntity.badRequest().body("O local de reparo não pode estar vazio");
         }

          ResultadoSolicitacaoReparoDTO resultado = reparo.CalculoReparoPortao(dto);
             return ResponseEntity.ok(resultado);


      }

      @PostMapping("/parede")
      public ResponseEntity<?> SolicitarReparoParede (@RequestBody SolicitacaoReparoDTO dto){

         if (dto.getTamanho() <=0){
             return ResponseEntity.badRequest().body("O tamanho não pode ser 0");
         }

         if (dto.getParedes() == null ){
             return ResponseEntity.badRequest().body("O tipo de reparo de parede nao pode estar vazio");
         }

         ResultadoSolicitacaoReparoDTO resultado1 = reparo.CalculoReparoParede(dto);
          return ResponseEntity.ok(resultado1);

      }



}
