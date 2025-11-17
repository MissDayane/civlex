package com.civlex.civlex.controllers;

import com.civlex.civlex.dto.createDTO.CaseCreateDTO;
import com.civlex.civlex.dto.responseDTO.CaseResponseDTO;
import com.civlex.civlex.models.enums.StatusCase;
import com.civlex.civlex.services.CaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cases")
@RequiredArgsConstructor
public class CaseController {

    private final CaseService caseService;

    // Listar todos os casos
    @GetMapping
    public ResponseEntity<List<CaseResponseDTO>> findAll() {
        return ResponseEntity.ok(caseService.findAll());
    }

    // Buscar caso por ID
    @GetMapping("/{id}")
    public ResponseEntity<CaseResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(caseService.findById(id));
    }

    // Criar um novo caso
    @PostMapping
    public ResponseEntity<CaseResponseDTO> createCase(@RequestBody CaseCreateDTO dto) {
        return ResponseEntity.ok(caseService.createCase(dto));
    }

    // Atualizar status do caso
    @PatchMapping("/{id}/status")
    public ResponseEntity<CaseResponseDTO> updateStatus(
            @PathVariable Long id,
            @RequestParam StatusCase status
    ) {
        CaseResponseDTO updatedCase = caseService.updateStatus(id, status);
        return ResponseEntity.ok(updatedCase);
    }
}
