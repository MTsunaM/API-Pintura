package com.abel.pintura.DTO;


import com.fasterxml.jackson.annotation.JsonGetter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cliente")
public class ClienteDTO {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private String telefone;


    @JsonGetter
    public String getTelefoneFormatado() {
        if (telefone == null) return null;

        String digits = telefone.replaceAll("\\D", "");
        if (digits.length() == 11) {
            return String.format("(%s) %s-%s",
                    digits.substring(0, 2),
                    digits.substring(2, 7),
                    digits.substring(7));


        }

        return telefone;

    }

}