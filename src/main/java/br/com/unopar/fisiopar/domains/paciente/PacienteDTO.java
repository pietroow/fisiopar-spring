package br.com.unopar.fisiopar.domains.paciente;

import br.com.unopar.fisiopar.domains.pessoafisica.EnderecoVO;
import br.com.unopar.fisiopar.domains.pessoafisica.enums.EstadoCivil;
import br.com.unopar.fisiopar.domains.pessoafisica.enums.Etnia;
import br.com.unopar.fisiopar.domains.pessoafisica.enums.Genero;
import com.google.common.collect.Lists;

import java.time.LocalDate;
import java.util.List;

public final class PacienteDTO {

    public String nome;
    public LocalDate dataNascimento;
    public Genero genero;
    public EstadoCivil estadoCivil;
    public Etnia etnia;
    public String nomeResponsavel;
    public String nomeDaMae;
    public String email;
    public List<EnderecoVO> endereco;
    public String convenio;
    public String observacoes;

    public PacienteDTO() {
        endereco = Lists.newArrayList();
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public Etnia getEtnia() {
        return etnia;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public String getEmail() {
        return email;
    }

    public List<EnderecoVO> getEndereco() {
        return endereco;
    }

    public String getConvenio() {
        return convenio;
    }

    public String getObservacoes() {
        return observacoes;
    }
}