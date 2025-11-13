package com.civlex.civlex.dto.responseDTO;

import com.civlex.civlex.dto.responseDTO.AddressResponseDTO;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class UsersResponseDTO {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String fotoPerfil;
    private String cpf;
//    private String endereco;
}
