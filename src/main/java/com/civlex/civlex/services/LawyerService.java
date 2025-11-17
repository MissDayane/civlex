package com.civlex.civlex.services;

import com.civlex.civlex.dto.createDTO.LawyerCreateDto;
import com.civlex.civlex.dto.responseDTO.LawyerResponseDTO;
import com.civlex.civlex.exceptions.NotFoundException;
import com.civlex.civlex.mapper.LawyerMapper;
import com.civlex.civlex.models.users.Lawyer;
import com.civlex.civlex.repository.LawyerRepository;
import com.civlex.civlex.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LawyerService extends UserService {

    private final LawyerRepository lawyerRepository;

    public LawyerService(UserRepository userRepository, LawyerRepository lawyerRepository) {
        super(userRepository);
        this.lawyerRepository = lawyerRepository;
    }

    public List<LawyerResponseDTO> findAll() {
        return lawyerRepository.findAll()
                .stream()
                .map(LawyerMapper::toDTO)
                .toList();
    }

    public LawyerResponseDTO findById(Long id) {
        return lawyerRepository.findById(id)
                .map(LawyerMapper::toDTO)
                .orElseThrow(() -> new NotFoundException("Advogado não encontrado com ID: " + id));
    }

    public LawyerResponseDTO createLawyer(LawyerCreateDto dto) {

        // Validações comuns
        validateEmailAvailable(dto.getEmail());
        validateCpfAvailable(dto.getCpf());

        // Validação específica
        if (lawyerRepository.existsByOab(dto.getOab())) {
            throw new IllegalArgumentException("OAB já cadastrada: " + dto.getOab());
        }

        Lawyer novoAdvogado = LawyerMapper.toEntity(dto);

        lawyerRepository.save(novoAdvogado);

        return LawyerMapper.toDTO(novoAdvogado);
    }
}
