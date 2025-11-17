package com.civlex.civlex.dto.responseDTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressResponseDTO {
    private Long id;
    private String rua;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;
    private String bairro;
}
