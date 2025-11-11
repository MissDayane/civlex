package com.civlex.civlex.mapper;

import com.civlex.civlex.dto.createDTO.UsersCreateDto;
import com.civlex.civlex.models.users.Users;

public class UserMapper {

    public static UsersCreateDto mapToUserDTO(Users users){
        return new UsersCreateDto(

                users.getNome(),
                users.getCpf(),
                users.getTelefone(),
                users.getFotoPerfil(),
                users.getEmail()
        );
    }

    public static Users mapToUsers(UsersCreateDto dto){
        return new Users(

                usersCreateDto.getNome(),
                usersCreateDto.getEmail(),
                usersCreateDto.getTelefone(),
                usersCreateDto.getFotoPerfil(),
                usersCreateDto.getEndereco()
        );
    }

}
