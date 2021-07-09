package com.controle.veiculos.controller;

import com.controle.veiculos.dto.VeiculoDTO;
import com.controle.veiculos.entities.Veiculo;
import com.controle.veiculos.exception.BusinessException;
import com.controle.veiculos.service.VeiculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/veiculo")
public class VeiculoController {

    private final VeiculoService service;

    @PostMapping(path = "/cadastro", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Veiculo> adicionaVeiculo(@RequestBody VeiculoDTO novoVeiculo) throws BusinessException {
        return new ResponseEntity<Veiculo>(service.createVeiculo(novoVeiculo), HttpStatus.CREATED);
    }
}
