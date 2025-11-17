package com.civlex.civlex.dto.createDTO;

import com.civlex.civlex.models.enums.SpecialtyLawyer;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CaseCreateDTO {

    @NotBlank(message = "O título é obrigatório")
    private String titulo;

    @NotBlank(message = "A descrição é obrigatória")
    private String descricao;

    @NotBlank(message = "A especialidade é obrigatória")
    private SpecialtyLawyer especialidade;

    @NotNull(message = "O ID do beneficiário é obrigatório")
    private Long idBeneficiario;

    @NotNull(message = "O ID do advogado é obrigatório")
    private Long idAdvogado;
}
