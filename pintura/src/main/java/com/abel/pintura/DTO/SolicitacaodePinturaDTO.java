package com.abel.pintura.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolicitacaodePinturaDTO {
    private LocaldePintura Local;
    private long id;
    private int tamanho;
    private String cor;
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
