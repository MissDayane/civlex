package com.civlex.civlex.mapper;

import com.civlex.civlex.dto.createDTO.BeneficiaryCreateDto;
import com.civlex.civlex.dto.responseDTO.BeneficiaryResponseDTO;
import com.civlex.civlex.models.users.Beneficiary;

public class BeneficiaryMapper {

    public static BeneficiaryResponseDTO toDTO(Beneficiary beneficiary) {
        if (beneficiary == null) return null;

        return BeneficiaryCreateDto.builder()
                .nome(beneficiary.getNome())
                .cpf(beneficiary.getCpf())
                .telefone(beneficiary.getTelefone())
                .fotoPerfil(beneficiary.getFotoPerfil())
                .email(beneficiary.getEmail())
                .cadUnico(beneficiary.getCadUnico())
                .cadUnicoAnexo(beneficiary.getCadUnicoAnexo())
                .build();
    }

    public static Beneficiary toEntity(BeneficiaryResponseDTO dto) {
        if (dto == null) return null;

        return Beneficiary.builder()
                .nome(dto.getNome())
                .cpf(dto.getCpf())
                .telefone(dto.getTelefone())
                .fotoPerfil(dto.getFotoPerfil())
                .cadUnico(dto.getCadUnico())
                .build();
    }
}