package com.civlex.civlex.dto.createDTO;
import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BeneficiaryCreateDto extends UsersCreateDto {

    private String cadUnico;
    private String cadUnicoAnexo;
}
