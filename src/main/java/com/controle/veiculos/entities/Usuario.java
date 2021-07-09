package com.controle.veiculos.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@RequiredArgsConstructor
@Document(collection = "usuario")
public class Usuario {
    @Id
    private String id;
    private String nome;
    private String email;
    private String cpf;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
}
