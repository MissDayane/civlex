package com.civlex.civlex.mapper;

import com.civlex.civlex.dto.createDTO.UsersCreateDto;
import com.civlex.civlex.dto.responseDTO.UsersResponseDTO;
import com.civlex.civlex.models.users.User;

public class UserMapper {

    public static void mapCommonFieldsToDTO(User user, UsersResponseDTO dto) {
        dto.setId(user.getId());
        dto.setNome(user.getNome());
        dto.setEmail(user.getEmail());
        dto.setTelefone(user.getTelefone());
        dto.setFotoPerfil(user.getFotoPerfil());
        dto.setCpf(user.getCpf());
        dto.setEndereco(AddressMapper.toDTO(user.getEndereco()));
    }

    public static void mapCommonFieldsToEntity(UsersCreateDto dto, User user) {
        user.setNome(dto.getNome());
        user.setEmail(dto.getEmail());
        user.setTelefone(dto.getTelefone());
        user.setFotoPerfil(dto.getFotoPerfil());
        user.setCpf(dto.getCpf());
        user.setSenha(dto.getSenha());

        if (dto.getEndereco() != null)
            user.setEndereco(dto.getEndereco());
    }
}
