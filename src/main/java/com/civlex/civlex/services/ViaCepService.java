package com.civlex.civlex.services;

import com.civlex.civlex.dto.responseDTO.ViaCepResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@Service
public class ViaCepService {

    private final WebClient webClient;

    public ViaCepService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://viacep.com.br").build();
    }

    public ViaCepResponse buscarCep(String cep) {
        try {
            ViaCepResponse response = webClient.get()
                    .uri("/ws/{cep}/json/", cep)
                    .retrieve()
                    .bodyToMono(ViaCepResponse.class)
                    .block();

            if (response == null || Boolean.TRUE.equals(response.getErro())) {
                throw new IllegalArgumentException("CEP inválido: " + cep);
            }
            return response;

        } catch (WebClientResponseException e) {
            throw new RuntimeException("Erro ao consultar ViaCEP: " + e.getMessage());
        }
    }
}
