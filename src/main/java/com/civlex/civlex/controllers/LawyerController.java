package com.civlex.civlex.controllers;

import com.civlex.civlex.dto.createDTO.LawyerCreateDto;
import com.civlex.civlex.dto.responseDTO.LawyerResponseDTO;
import com.civlex.civlex.services.LawyerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lawyers")
@RequiredArgsConstructor
public class LawyerController {

    private final LawyerService lawyerService;

    @GetMapping
    public ResponseEntity<List<LawyerResponseDTO>> findAll() {
        return ResponseEntity.ok(lawyerService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LawyerResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(lawyerService.findById(id));
    }

    @PostMapping
    public ResponseEntity<LawyerResponseDTO> create(@RequestBody LawyerCreateDto dto) {
        return ResponseEntity.ok(lawyerService.createLawyer(dto));
    }
}
