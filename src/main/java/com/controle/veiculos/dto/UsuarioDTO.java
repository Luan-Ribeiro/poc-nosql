package com.controle.veiculos.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UsuarioDTO {
    private String id;
    private String nome;
    private String email;
    private String cpf;
    private LocalDate dataNascimento;
}
