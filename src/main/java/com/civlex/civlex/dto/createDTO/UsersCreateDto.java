package com.civlex.civlex.dto.createDTO;

import com.civlex.civlex.models.address.Address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsersCreateDto { // DTO para criação (entrada de dados)

    private String nome;
    private String email;
    private String telefone;
    private String fotoPerfil;
    private Address endereco;

}
