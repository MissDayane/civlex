package com.civlex.civlex.dto.responseDTO;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BeneficiaryResponseDTO extends UsersResponseDTO {
    private String cadUnico;
}
