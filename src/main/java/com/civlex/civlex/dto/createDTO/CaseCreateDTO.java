package com.civlex.civlex.dto.createDTO;

import lombok.Data;

@Data
public class CaseCreateDTO {
    private String titulo;
    private String descricao;
    private String especialidade;
    private Long idBeneficiario;
    private Long idAdvogado;
}