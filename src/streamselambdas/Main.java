package streamselambdas;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        var pessoas = new ArrayList<Pessoa>();

        pessoas.add(new Pessoa("Lara", 35));
        pessoas.add(new Pessoa("Peter", 21));
        pessoas.add(new Pessoa("Zach", 45));
        pessoas.add(new Pessoa("Karl", 50));
        pessoas.add(new Pessoa("Barbara", 17));
        pessoas.add(new Pessoa("Lois", 16));

        List<Pessoa> menoresDeIdade = new ArrayList<>();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.idade < 18) {
                menoresDeIdade.add(pessoa);
            }
        }

        List<Pessoa> menoresDeIdadeStream = pessoas
                .stream()
                .filter(pessoa -> pessoa.idade < 18)
                .toList();

        System.out.println(menoresDeIdade.equals(menoresDeIdadeStream));
    }
}

class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {

    }
}
