package com.civlex.civlex.dto.createDTO;

import com.civlex.civlex.models.address.Address;
import lombok.*;
import lombok.experimental.SuperBuilder;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.br.CPF;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsersCreateDto {

    @NotBlank(message = "O nome não pode estar vazio.")
    private String nome;

    @Email(message = "Formato de e-mail inválido.")
    @NotBlank(message = "O email é obrigatório.")
    private String email;

    @NotBlank(message = "O telefone é obrigatório.")
    private String telefone;

    private String fotoPerfil;

    @CPF(message = "CPF inválido.")
    @NotBlank(message = "O CPF é obrigatório.")
    private String cpf;

    @NotNull(message = "O endereço é obrigatório.")
    private Address endereco;

    @NotBlank(message = "A senha é obrigatória.")
    private String senha;
}
