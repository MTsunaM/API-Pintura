package com.abel.pintura.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolicitacaoReparoDTO {
     private long id;
     private ReparoParedes paredes;
     private ReparoPortasPortoes portoes;
     private LocalReparo reparo;
     private int tamanho;


     public enum LocalReparo{

         Interna,
         Fachada,
         Externa
     }


     public enum ReparoParedes{

         Mofo,
         Trinca,
         Descascamento,
         Buracos

     }

     public enum ReparoPortasPortoes{

         Ferrugem,
         Madeira

     }




}
