package com.abel.pintura.DTO;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="reparo")
public class SolicitacaoReparoDTO {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;

     @Enumerated(EnumType.STRING)
     private ReparoParedes paredes;

     @Enumerated(EnumType.STRING)
     private ReparoPortasPortoes portoes;

     @Enumerated(EnumType.STRING)
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
