package streamselambdas;

import java.util.ArrayList;
import java.util.List;

public class Main_2 {
    static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Roberto", 30));
        clientes.add(new Cliente("Pedro", 20));
        clientes.add(new Cliente("Carlos", 40));
    }
}

class Cliente {
    String nome;
    int idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
