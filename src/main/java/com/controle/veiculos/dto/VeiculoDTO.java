package com.controle.veiculos.dto;

import lombok.Data;

@Data
public class VeiculoDTO {
    private String marca;
    private String modelo;
    private String ano;
    private String valor;
    private String diaRodizio;
    private Boolean rodizio;
}
