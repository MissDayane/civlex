package com.civlex.civlex.mapper;

import com.civlex.civlex.dto.createDTO.UsersCreateDto;
import com.civlex.civlex.dto.responseDTO.UsersResponseDTO;
import com.civlex.civlex.models.users.Users;

public class UserMapper {

    public static UsersResponseDTO toDTO(Users user) {
        if (user == null) return null;

        return UsersResponseDTO.builder()
                .id(user.getId())
                .nome(user.getNome())
                .cpf(user.getCpf())
                .telefone(user.getTelefone())
                .fotoPerfil(user.getFotoPerfil())
                .email(user.getEmail())
                .build();
    }

    public static Users toEntity(UsersCreateDto dto) {
        if (dto == null) return null;

        return Users.builder()
                .nome(dto.getNome())
                .cpf(dto.getCpf())
                .telefone(dto.getTelefone())
                .fotoPerfil(dto.getFotoPerfil())
                .email(dto.getEmail())
                .build();
    }
}
