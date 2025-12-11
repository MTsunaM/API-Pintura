package com.abel.pintura.DTO;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "resultadoreparo")
public class ResultadoSolicitacaoReparoDTO {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;

     private double valorParedes;
     private double valorPortao;
}
