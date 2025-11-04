package com.civlex.civlex.models.users;

import com.civlex.civlex.models.address.Address;
import com.civlex.civlex.models.enums.StatusAccount;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
@SuperBuilder
public class Beneficiary extends Users {

    @Column(name = "cadunico", nullable = false, unique = true, length = 11)
    private String cadUnico;

    @Column(name = "cadunico_anexo", nullable = false)
    private String cadUnicoAnexo;

}
