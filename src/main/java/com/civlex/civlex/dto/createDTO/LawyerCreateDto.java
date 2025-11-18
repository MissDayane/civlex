package com.civlex.civlex.dto.createDTO;

import com.civlex.civlex.models.enums.SpecialtyLawyer;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LawyerCreateDto extends UsersCreateDto {

    @NotBlank(message = "A OAB é obrigatória.")
    private String oab;

    @NotBlank(message = "O anexo da OAB é obrigatório.")
    private String anexoOab;

    @NotNull(message = "A especialidade é obrigatória.")
    private SpecialtyLawyer specialty;
}