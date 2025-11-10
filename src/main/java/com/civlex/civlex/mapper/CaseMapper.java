package com.civlex.civlex.mapper;

import com.civlex.civlex.dto.SaidaCaseDTO;
import com.civlex.civlex.models.cases.Case;

public class CaseMapper {
    public static SaidaCaseDTO toDTO(Case c) {
        if (c == null) return null;

        return SaidaCaseDTO.builder()
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