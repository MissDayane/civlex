package com.civlex.civlex.dto.createDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BeneficiaryCreateDto extends UsersCreateDto {

    @NotBlank(message = "O CadÚnico é obrigatório.")
    @Pattern(
            regexp = "\\d{11}",
            message = "O CadÚnico deve conter exatamente 11 dígitos numéricos."
    )
    private String cadUnico;

    @NotBlank(message = "O anexo do CadÚnico é obrigatório.")
    private String cadUnicoAnexo;
}
