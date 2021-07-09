package com.controle.veiculos.service;

import com.controle.veiculos.entities.Usuario;
import com.controle.veiculos.exception.BusinessException;
import com.controle.veiculos.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;

    public Usuario createUsuario(Usuario usuario) throws BusinessException {
        try {
            return repository.save(usuario);
        } catch (Throwable e) {
            throw new BusinessException("Dados invalidos! Favor verificar");
        }
    }

    public Usuario findByCpf(String cpf) throws BusinessException {
        try {
            return repository.findByCpf(cpf);
        } catch (Throwable e) {
            throw new BusinessException("Dados não encontrados!");
        }
    }
}