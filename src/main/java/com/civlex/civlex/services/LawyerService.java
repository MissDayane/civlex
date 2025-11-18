package com.civlex.civlex.services;

import com.civlex.civlex.dto.createDTO.LawyerCreateDto;
import com.civlex.civlex.dto.responseDTO.LawyerResponseDTO;
import com.civlex.civlex.mapper.LawyerMapper;
import com.civlex.civlex.models.users.Lawyer;
import com.civlex.civlex.repository.LawyerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LawyerService {

    private final LawyerRepository lawyerRepository;

    public List<LawyerResponseDTO> findAll() {
        return lawyerRepository.findAll()
                .stream()
                .map(LawyerMapper::toDTO)
                .toList();
    }

    public LawyerResponseDTO findById(Long id) {
        return lawyerRepository.findById(id)
                .map(LawyerMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Advogado não encontrado"));
    }

    public LawyerResponseDTO createLawyer(LawyerCreateDto dto) {

        var novoAdvogado = Lawyer.builder()
                .nome(dto.getNome())
                .cpf(dto.getCpf())
                .telefone(dto.getTelefone())
                .fotoPerfil(dto.getFotoPerfil())
                .email(dto.getEmail())
                .oab(dto.getOab())
                .specialty(dto.getSpecialty())
                .build();

        lawyerRepository.save(novoAdvogado);
        return LawyerMapper.toDTO(novoAdvogado);
    }
}
