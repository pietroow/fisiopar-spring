package br.com.unopar.fisiopar;

public class Aluno {

    private static final Aluno INSTANCE = new Aluno();
    private String nome;

    public static Aluno getInstance(){
        return INSTANCE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
