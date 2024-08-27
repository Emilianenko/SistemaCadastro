package models;

public class Cliente {
    private String nome;
    private Integer idade;
    private String cpf;
    private Double altura;
    private Double peso;
    private Double rendaPessoal;

    public Cliente() {
    }

    public Cliente(String nome, Integer idade, String cpf, Double altura, Double peso, Double rendaPessoal) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.altura = altura;
        this.peso = peso;
        this.rendaPessoal = rendaPessoal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getRendaPessoal() {
        return rendaPessoal;
    }

    public void setRendaPessoal(Double rendaPessoal) {
        this.rendaPessoal = rendaPessoal;
    }
}
