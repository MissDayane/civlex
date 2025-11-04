package com.civlex.civlex.models.users;

import com.civlex.civlex.models.enums.SpecialtyLowyer;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "advogados")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Lawyer extends Users {

    @Column(nullable = false, unique = true)
    private String oab;

    @Column(nullable = false)
    private String anexoOab;

    @Enumerated(EnumType.STRING)
    @Column(name = "especialidade", nullable = false)
    private SpecialtyLowyer specialty;
}
