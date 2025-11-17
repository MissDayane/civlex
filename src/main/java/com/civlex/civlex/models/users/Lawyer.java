package com.civlex.civlex.models.users;

import com.civlex.civlex.models.enums.SpecialtyLawyer;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "advogados")
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Lawyer extends User {

    @NotBlank
    @Column(nullable = false, unique = true)
    private String oab;

    @NotBlank
    @Column(nullable = false)
    private String anexoOabUrl; // se for URL do anexo

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "especialidade", nullable = false)
    private SpecialtyLawyer specialty;
}
