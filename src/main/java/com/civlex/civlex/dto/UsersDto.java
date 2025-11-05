package com.civlex.civlex.dto;

import com.civlex.civlex.models.enums.StatusAccount;
import com.civlex.civlex.models.address.Address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsersDto {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String fotoPerfil;
    private StatusAccount statusAccount;
    private Address endereco;

}
