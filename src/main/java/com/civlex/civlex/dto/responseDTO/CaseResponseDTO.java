package com.civlex.civlex.dto.responseDTO;

import com.civlex.civlex.models.enums.StatusCase;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CaseResponseDTO {
    private Long id;
    private String titulo;
    private String descricao;
    private String especialidade;
    private LocalDate dataAbertura;
    private StatusCase statusCase;

    private Long idBeneficiario;
    private String nomeBeneficiario;
    private Long idAdvogado;
    private String nomeAdvogado;
}