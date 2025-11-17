package com.civlex.civlex.services;

import com.civlex.civlex.exceptions.NotFoundException;
import com.civlex.civlex.models.users.User;
import com.civlex.civlex.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public abstract class UserService {

    protected final UserRepository userRepository;

    protected User findUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Usuário não encontrado com ID: " + id));
    }

    protected void validateEmailAvailable(String email) {
        if (userRepository.existsByEmail(email)) {
            throw new IllegalArgumentException("Email já está em uso: " + email);
        }
    }

    protected void validateCpfAvailable(String cpf) {
        if (userRepository.existsByCpf(cpf)) {
            throw new IllegalArgumentException("CPF já está em uso: " + cpf);
        }
    }
}
