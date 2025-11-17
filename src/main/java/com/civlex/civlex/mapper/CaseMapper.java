package com.civlex.civlex.mapper;

import com.civlex.civlex.dto.responseDTO.CaseResponseDTO;
import com.civlex.civlex.models.cases.Case;

public class CaseMapper {

    private CaseMapper() {
        // Construtor privado para evitar instanciação
    }

    public static CaseResponseDTO toDTO(Case c) {
        if (c == null) return null;

        return CaseResponseDTO.builder()
                .id(c.getId())
                .titulo(c.getTitulo())
                .descricao(c.getDescricao())
                .especialidade(c.getEspecialidade())
                .dataAbertura(c.getDataAbertura())
                .statusCase(c.getStatusCase())
                .idBeneficiario(c.getBeneficiary() != null ? c.getBeneficiary().getId() : null)
                .nomeBeneficiario(c.getBeneficiary() != null ? c.getBeneficiary().getNome() : null)
                .idAdvogado(c.getLawyer() != null ? c.getLawyer().getId() : null)
                .nomeAdvogado(c.getLawyer() != null ? c.getLawyer().getNome() : null)
                .build();
    }
}
