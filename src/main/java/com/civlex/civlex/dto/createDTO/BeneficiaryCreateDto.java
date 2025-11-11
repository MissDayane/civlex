package com.civlex.civlex.dto.createDTO;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BeneficiaryCreateDto {
    private String nome;
    private String cpf;
    private String telefone;
    private String fotoPerfil;
    private String email;
    private String cadUnico;
    private String cadUnicoAnexo;
}