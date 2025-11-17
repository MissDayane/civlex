package com.civlex.civlex.mapper;

import com.civlex.civlex.dto.responseDTO.AddressResponseDTO;
import com.civlex.civlex.models.address.Address;

public class AddressMapper {

    public static AddressResponseDTO toDTO(Address address) {
        if (address == null) return null;

        return AddressResponseDTO.builder()
                .id(address.getId())
                .rua(address.getRua())
                .cidade(address.getCidade())
                .estado(address.getEstado())
                .cep(address.getCep())
                .complemento(address.getComplemento())
                .bairro(address.getBairro())
                .build();
    }
}
