package com.civlex.civlex.services;

import com.civlex.civlex.dto.responseDTO.ViaCepResponse;
import com.civlex.civlex.dto.createDTO.AddressCreateDTO;
import com.civlex.civlex.models.address.Address;
import com.civlex.civlex.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;
    private final ViaCepService viaCepService;

    public Address criarEndereco(AddressCreateDTO dto) {
        ViaCepResponse response = viaCepService.buscarCep(dto.getCep());

        Address endereco = Address.builder()
                .cep(response.getCep())
                .rua(response.getLogradouro())
                .cidade(response.getLocalidade())
                .estado(response.getUf())
                .complemento(dto.getComplemento())
                .bairro(dto.getBairro() != null ? dto.getBairro() : response.getBairro())
                .build();

        return addressRepository.save(endereco);
    }

    public Address buscarPorId(Long id) {
        return addressRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereço não encontrado com ID: " + id));
    }
}
