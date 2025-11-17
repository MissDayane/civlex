package com.civlex.civlex.models.users;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "beneficiarios")
@PrimaryKeyJoinColumn(name = "usuario_id")
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Beneficiary extends User {

    @NotBlank
    @Pattern(regexp = "\\d{11}", message = "O CadÚnico deve conter exatamente 11 dígitos")
    @Column(name = "cadunico", nullable = false, unique = true, length = 11)
    private String cadUnico;

    @NotBlank
    @Column(name = "cadunico_anexo", nullable = false)
    private String cadUnicoAnexoUrl;
}
