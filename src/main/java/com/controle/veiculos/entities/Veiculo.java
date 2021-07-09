package com.controle.veiculos.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@Document(collection = "veiculo")
public class Veiculo {
    @Id
    private String id;
    private String marca;
    private String modelo;
    private String ano;
    private String valor;
    private String diaRodizio;
    private Boolean rodizio;
}