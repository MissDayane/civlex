//package com.civlex.civlex.mapper;
//
//import com.civlex.civlex.dto.createDTO.UsersCreateDto;
//import com.civlex.civlex.dto.responseDTO.*;
//import com.civlex.civlex.models.users.*;
//
//public class AlternativaMapper {
//
//    // Mapear entidade Users para DTO de resposta
//    public static UsersResponseDTO toDTO(Users user) {
//        if (user == null) return null;
//
//        if (user instanceof Lawyer lawyer) {
//            return LawyerResponseDTO.builder()
//                    .id(lawyer.getId())
//                    .nome(lawyer.getNome())
//                    .cpf(lawyer.getCpf())
//                    .telefone(lawyer.getTelefone())
//                    .fotoPerfil(lawyer.getFotoPerfil())
//                    .email(lawyer.getEmail())
//                    .oab(lawyer.getOab())
//                    .specialty(lawyer.getSpecialty())
//                    .build();
//        } else if (user instanceof Beneficiary beneficiary) {
//            return BeneficiaryResponseDTO.builder()
//                    .id(beneficiary.getId())
//                    .nome(beneficiary.getNome())
//                    .cpf(beneficiary.getCpf())
//                    .telefone(beneficiary.getTelefone())
//                    .fotoPerfil(beneficiary.getFotoPerfil())
//                    .email(beneficiary.getEmail())
//                    .cadUnico(beneficiary.getCadUnico())
//                    .build();
//        } else {
//            // Usuário genérico
//            return UsersResponseDTO.builder()
//                    .id(user.getId())
//                    .nome(user.getNome())
//                    .cpf(user.getCpf())
//                    .telefone(user.getTelefone())
//                    .fotoPerfil(user.getFotoPerfil())
//                    .email(user.getEmail())
//                    .build();
//        }
//    }
//
//    // Mapear DTO de criação para entidade Users
//    public static Users toEntity(UsersCreateDto dto) {
//        if (dto == null) return null;
//
//        return Users.builder()
//                .nome(dto.getNome())
//                .cpf(dto.getCpf())
//                .telefone(dto.getTelefone())
//                .fotoPerfil(dto.getFotoPerfil())
//                .email(dto.getEmail())
//                .endereco(dto.getEndereco())
//                .build();
//    }
//}
