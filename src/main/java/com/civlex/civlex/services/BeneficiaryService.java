package com.civlex.civlex.services;

import com.civlex.civlex.dto.createDTO.BeneficiaryCreateDto;
import com.civlex.civlex.dto.responseDTO.BeneficiaryResponseDTO;
import com.civlex.civlex.mapper.BeneficiaryMapper;
import com.civlex.civlex.models.users.Beneficiary;
import com.civlex.civlex.repository.BeneficiaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BeneficiaryService {

    private final BeneficiaryRepository beneficiaryRepository;

    public List<BeneficiaryResponseDTO> findAll() {
        return beneficiaryRepository.findAll()
                .stream()
                .map(BeneficiaryMapper::toDTO)
                .toList();
    }

    public BeneficiaryResponseDTO findById(Long id) {
        return beneficiaryRepository.findById(id)
                .map(BeneficiaryMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Beneficiário não encontrado"));
    }

    public BeneficiaryResponseDTO createBeneficiary(BeneficiaryCreateDto dto) {

        var novoBeneficiario = Beneficiary.builder()
                .nome(dto.getNome())
                .cpf(dto.getCpf())
                .telefone(dto.getTelefone())
                .fotoPerfil(dto.getFotoPerfil())
                .email(dto.getEmail())
                .cadUnico(dto.getCadUnico())
                .cadUnicoAnexo(dto.getCadUnicoAnexo())
                .build();

        beneficiaryRepository.save(novoBeneficiario);
        return BeneficiaryMapper.toDTO(novoBeneficiario);
    }
}
