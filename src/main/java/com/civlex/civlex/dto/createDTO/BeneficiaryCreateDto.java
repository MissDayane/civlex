package com.civlex.civlex.dto.createDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BeneficiaryCreateDto extends UsersCreateDto {
    private String cadUnico;
    private String cadUnicoAnexo;
}
