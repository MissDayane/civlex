package com.civlex.civlex.services;

import com.civlex.civlex.dto.createDTO.BeneficiaryCreateDto;
import com.civlex.civlex.dto.responseDTO.BeneficiaryResponseDTO;
import com.civlex.civlex.exceptions.NotFoundException;
import com.civlex.civlex.mapper.BeneficiaryMapper;
import com.civlex.civlex.models.users.Beneficiary;
import com.civlex.civlex.repository.BeneficiaryRepository;
import com.civlex.civlex.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeneficiaryService extends UserService {

    private final BeneficiaryRepository beneficiaryRepository;

    public BeneficiaryService(UserRepository userRepository,
                              BeneficiaryRepository beneficiaryRepository) {
        super(userRepository);
        this.beneficiaryRepository = beneficiaryRepository;
    }

    public List<BeneficiaryResponseDTO> findAll() {
        return beneficiaryRepository.findAll()
                .stream()
                .map(BeneficiaryMapper::toDTO)
                .toList();
    }

    public BeneficiaryResponseDTO findById(Long id) {
        return beneficiaryRepository.findById(id)
                .map(BeneficiaryMapper::toDTO)
                .orElseThrow(() -> new NotFoundException("Beneficiário não encontrado com ID: " + id));
    }

    public BeneficiaryResponseDTO createBeneficiary(BeneficiaryCreateDto dto) {

        // Validações comuns
        validateEmailAvailable(dto.getEmail());
        validateCpfAvailable(dto.getCpf());

        // Validação específica
        if (beneficiaryRepository.existsByCadUnico(dto.getCadUnico())) {
            throw new IllegalArgumentException("Cadastro Único já está registrado: " + dto.getCadUnico());
        }

        Beneficiary novoBeneficiario = BeneficiaryMapper.toEntity(dto);

        beneficiaryRepository.save(novoBeneficiario);

        return BeneficiaryMapper.toDTO(novoBeneficiario);
    }
}
