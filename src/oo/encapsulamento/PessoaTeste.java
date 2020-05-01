package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(-45, "Pedro", "Sampaio");

        pessoa.setIdade(230); // alterar

        System.out.println(pessoa.getIdade()); // ler
        System.out.println(pessoa); // ler
        System.out.println(pessoa.getNomeCompleto());

    }
}
