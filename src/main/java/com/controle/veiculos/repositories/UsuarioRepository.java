package com.controle.veiculos.repositories;

import com.controle.veiculos.entities.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    Usuario findByCpf(String cpf);

}
