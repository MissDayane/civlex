package com.civlex.civlex.services;

import com.civlex.civlex.dto.createDTO.CaseCreateDTO;
import com.civlex.civlex.dto.responseDTO.CaseResponseDTO;
import com.civlex.civlex.mapper.CaseMapper;
import com.civlex.civlex.models.cases.Case;
import com.civlex.civlex.models.enums.StatusCase;
import com.civlex.civlex.repository.BeneficiaryRepository;
import com.civlex.civlex.repository.CaseRepository;
import com.civlex.civlex.repository.LawyerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CaseService {

    private final CaseRepository caseRepository;
    private final BeneficiaryRepository beneficiaryRepository;
    private final LawyerRepository lawyerRepository;

    public List<CaseResponseDTO> findAll() {
        return caseRepository.findAll()
                .stream()
                .map(CaseMapper::toDTO)
                .toList();
    }

    public CaseResponseDTO findById(Long id) {
        return caseRepository.findById(id)
                .map(CaseMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Caso não encontrado"));
    }

    public CaseResponseDTO createCase(CaseCreateDTO dto) {
        var beneficiary = beneficiaryRepository.findById(dto.getIdBeneficiario())
                .orElseThrow(() -> new RuntimeException("Beneficiário não encontrado"));

        var lawyer = lawyerRepository.findById(dto.getIdAdvogado())
                .orElseThrow(() -> new RuntimeException("Advogado não encontrado"));

        var novoCaso = Case.builder()
                .titulo(dto.getTitulo())
                .descricao(dto.getDescricao())
                .especialidade(dto.getEspecialidade())
                .dataAbertura(LocalDate.now())
                .beneficiary(beneficiary)
                .lawyer(lawyer)
                .statusCase(StatusCase.EM_ANDAMENTO)
                .build();

        caseRepository.save(novoCaso);
        return CaseMapper.toDTO(novoCaso);
    }
}