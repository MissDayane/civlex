package com.civlex.civlex.dto.responseDTO;

import lombok.Data;

@Data
public class ViaCepResponse {
    private String cep;
    private String logradouro; // rua
    private String complemento;
    private String bairro;
    private String localidade; // cidade
    private String uf; // estado
    private Boolean erro; // true se CEP inválido
}
