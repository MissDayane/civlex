package com.civlex.civlex.dto.responseDTO;

import com.civlex.civlex.models.enums.SpecialtyLawyer;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class LawyerResponseDTO extends UsersResponseDTO {

    private String oab;
    private SpecialtyLawyer specialty;
}
