package com.controle.veiculos.controller;

import com.controle.veiculos.entities.Usuario;
import com.controle.veiculos.exception.BusinessException;
import com.controle.veiculos.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/usuario")
public class UsuarioController {

    private final UsuarioService service;

    @GetMapping(path = "/{cpf}")
    public ResponseEntity<Usuario> findByCpf(@PathVariable("cpf") String cpf) throws BusinessException {
        return new ResponseEntity<Usuario>(service.findByCpf(cpf), HttpStatus.OK);
    }

    @PostMapping(path = "/cadastro", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Usuario> criaUsuario(@RequestBody Usuario novoUsuario) throws BusinessException {
        return new ResponseEntity<Usuario>(service.createUsuario(novoUsuario), HttpStatus.CREATED);
    }
}
