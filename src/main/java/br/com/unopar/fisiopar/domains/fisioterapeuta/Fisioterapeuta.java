//package br.com.unopar.fisiopar.domains.fisioterapeuta;
//
//import br.com.unopar.fisiopar.domains.pessoafisica.*;
//import org.hibernate.validator.constraints.br.CPF;
//
//import javax.persistence.Column;
//import javax.persistence.DiscriminatorValue;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import javax.validation.constraints.Digits;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotEmpty;
//import java.time.LocalDate;
//
//@Entity
//@Table(name = "fisioterapeuta")
//@DiscriminatorValue("FISIOTERAPEUTA")
//public class Fisioterapeuta extends PessoaFisica {
//
////    @Column(name = "especialidade")
////    private Especialidade especialidade;
//
//    @Column(name = "crefito")
//    private String crefito;
//
//    private Fisioterapeuta() {
//        System.out.println("Construtor vazio 'Fisioterapeuta' ");
//    }
//
//
//    public String getCrefito() {
//        return crefito;
//    }
//
//    public void setCrefito(String crefito) {
//        this.crefito = crefito;
//    }
//}
//
