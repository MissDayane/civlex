package com.civlex.civlex.mapper;

import com.civlex.civlex.dto.responseDTO.CaseResponseDTO;
import com.civlex.civlex.models.cases.Case;

public class CaseMapper {
    public static CaseResponseDTO toDTO(Case c) {
        if (c == null) return null;

        return CaseResponseDTO.builder()
                .id(c.getId())
                .titulo(c.getTitulo())
                .descricao(c.getDescricao())
                .especialidade(c.getEspecialidade())
                .dataAbertura(c.getDataAbertura())
                .statusCase(c.getStatusCase())
                .idBeneficiario(c.getBeneficiary().getId())
                .nomeBeneficiario(c.getBeneficiary().getNome())
                .idAdvogado(c.getLawyer().getId())
                .nomeAdvogado(c.getLawyer().getNome())
                .build();
    }
}