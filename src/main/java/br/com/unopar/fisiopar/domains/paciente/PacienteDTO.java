package br.com.unopar.fisiopar.domains.paciente;

import br.com.unopar.fisiopar.domains.documento.Documento;
import br.com.unopar.fisiopar.domains.pessoafisica.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public final class PacienteDTO {

    public String nome;
    public LocalDate dataNascimento;
    public Genero genero;
    public EstadoCivil estadoCivil;
    public Etnia etnia;
    public String nomeResponsavel;
    public String nomeDaMae;
    public String email;
    public Set<EnderecoDTO> enderecos;
    public Set<TelefoneVO> telefones;
    public List<Documento> documentos;
    public String convenio;
    public String observacoes;

}