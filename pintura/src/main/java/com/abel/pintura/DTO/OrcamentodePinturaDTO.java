package com.abel.pintura.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrcamentodePinturaDTO {
    private TipodePintura Tipo;
    private long id;
    private int tamanho;
    private String cor;
    private String localPintura;


    public enum TipodePintura{

        Interna,
        Externa,
        Fachada


    }

}
