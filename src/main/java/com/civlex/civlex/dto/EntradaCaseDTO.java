package com.civlex.civlex.dto;

import lombok.Data;

@Data
public class EntradaCaseDTO {
    private String titulo;
    private String descricao;
    private String especialidade;
    private Long idBeneficiario;
    private Long idAdvogado;
}