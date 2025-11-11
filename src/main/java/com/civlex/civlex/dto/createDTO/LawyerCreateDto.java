package com.civlex.civlex.dto.createDTO;

import com.civlex.civlex.models.enums.SpecialtyLowyer;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class LawyerCreateDto extends UsersCreateDto {

    private String oab;
    private String anexoOab;
    private SpecialtyLowyer specialty;
}
