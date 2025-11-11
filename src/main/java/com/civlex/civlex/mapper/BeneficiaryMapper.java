package com.civlex.civlex.mapper;

import com.civlex.civlex.dto.createDTO.BeneficiaryCreateDto;
import com.civlex.civlex.models.users.Beneficiary;

public class BeneficiaryMapper {
    public static BeneficiaryCreateDto mapToBeneficiaryDTO(Beneficiary beneficiary){
        return new BeneficiaryCreateDto(
                beneficiary.getNome(),
                beneficiary.getCpf(),
                beneficiary.getTelefone(),
                beneficiary.getFotoPerfil(),
                beneficiary.getEmail(),
                beneficiary.getCadUnico(),
                beneficiary.getCadUnicoAnexo()

        );
    }

    public static Beneficiary mapToBeneficiary(BeneficiaryCreateDto dto){
        return new Beneficiary(
                BeneficiaryCreateDto.
        )
    }
}
