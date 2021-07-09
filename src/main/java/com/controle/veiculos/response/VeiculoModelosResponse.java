package com.controle.veiculos.response;

import lombok.Data;

import java.util.List;

@Data
public class VeiculoModelosResponse {
    private List<VeiculoResponse> anos;
    private List<VeiculoResponse> modelos;
}
