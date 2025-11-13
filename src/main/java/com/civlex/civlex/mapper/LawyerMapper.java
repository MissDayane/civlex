package com.civlex.civlex.mapper;

import com.civlex.civlex.dto.createDTO.LawyerCreateDto;
import com.civlex.civlex.dto.createDTO.UsersCreateDto;
import com.civlex.civlex.dto.responseDTO.LawyerResponseDTO;
import com.civlex.civlex.models.users.Lawyer;
import com.civlex.civlex.models.users.Users;

public class LawyerMapper {

    public static LawyerResponseDTO toDTO(Lawyer lawyer) {
        if (lawyer == null) return null;

        return LawyerResponseDTO.builder()
                .nome(lawyer.getNome())
                .cpf(lawyer.getCpf())
                .telefone(lawyer.getTelefone())
                .fotoPerfil(lawyer.getFotoPerfil())
                .email(lawyer.getEmail())
                .oab(lawyer.getOab())
                .specialty(lawyer.getSpecialty())
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
                .oab(dto.getOab())
                .specialty(dto.getSpecialty())
                .build();
    }