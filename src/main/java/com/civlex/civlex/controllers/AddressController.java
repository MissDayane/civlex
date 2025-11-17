package com.civlex.civlex.controllers;

import com.civlex.civlex.dto.createDTO.AddressCreateDTO;
import com.civlex.civlex.dto.responseDTO.AddressResponseDTO;
import com.civlex.civlex.mapper.AddressMapper;
import com.civlex.civlex.models.address.Address;
import com.civlex.civlex.services.AddressService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addresses")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @PostMapping
    public ResponseEntity<AddressResponseDTO> createAddress(@RequestBody @Valid AddressCreateDTO dto) {
        Address endereco = addressService.criarEndereco(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(AddressMapper.toDTO(endereco));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressResponseDTO> getAddress(@PathVariable Long id) {
        Address endereco = addressService.buscarPorId(id);
        return ResponseEntity.ok(AddressMapper.toDTO(endereco));
    }
}
