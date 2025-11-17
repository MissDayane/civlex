package com.civlex.civlex.controllers;

import com.civlex.civlex.dto.createDTO.BeneficiaryCreateDto;
import com.civlex.civlex.dto.responseDTO.BeneficiaryResponseDTO;
import com.civlex.civlex.services.BeneficiaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beneficiaries")
@RequiredArgsConstructor
public class BeneficiaryController {

    private final BeneficiaryService beneficiaryService;

    @GetMapping
    public ResponseEntity<List<BeneficiaryResponseDTO>> findAll() {
        return ResponseEntity.ok(beneficiaryService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BeneficiaryResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(beneficiaryService.findById(id));
    }

    @PostMapping
    public ResponseEntity<BeneficiaryResponseDTO> create(@RequestBody BeneficiaryCreateDto dto) {
        return ResponseEntity.ok(beneficiaryService.createBeneficiary(dto));
    }
}
