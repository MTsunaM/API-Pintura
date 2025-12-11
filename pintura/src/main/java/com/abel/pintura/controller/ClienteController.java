package com.abel.pintura.controller;

import com.abel.pintura.DTO.ClienteDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {



    @PostMapping
    ResponseEntity<?> CadastrarCliente (@RequestBody ClienteDTO dto){

        if (dto.getNome() == null){
            return ResponseEntity.badRequest().body("O nome não pode estar vazio");
        }

        if (dto.getEmail() == null){
            return ResponseEntity.badRequest().body("O email não pode estar vazio");

        }

        if (dto.getTelefone() == null){
            return ResponseEntity.badRequest().body("O numero de telefone não pode estar vazio");

        }

        return ResponseEntity.ok("Cliente cadastrado com sucesso");

    }




}
