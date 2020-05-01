package oo.encapsulamento;

public class Pessoa {
    private int idade;
    private String nome, sobrenome;

    public Pessoa(int idade, String nome, String sobrenome){
        setIdade(idade);
        setNome(nome);
        setSobrenome(sobrenome);
    }

    public int getIdade(){
        return idade;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 120){
            this.idade = novaIdade;
        }
    }

    public String getNomeCompleto(){
        return getNome() + " " + getSobrenome();
    }

    @Override
    public String toString() {
        return "Olá eu sou o " + getNome()
                + " e tenho " + getIdade()
                + " anos.";
    }
}
