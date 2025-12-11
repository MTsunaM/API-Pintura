package com.abel.pintura.DTO;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pintura")

public class SolicitacaodePinturaDTO {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private LocaldePintura Local;

    private int tamanho;
    private String cor;

    @Enumerated(EnumType.STRING)
    private TecnicadePintura Tecnica;



    public enum LocaldePintura{

        Interna,
        Externa,
        Fachada


    }

    public enum TecnicadePintura{

        Grafiato,
        Pinturalisa


    }




}
