package br.com.unopar.fisiopar.domains;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class EnderecoCorreioDTO {

    @JsonProperty(value = "localidade")
    private String cidade;
    private String logradouro;
    private String bairro;
    private String cep;
    private String complemento;
    private String uf;

}
