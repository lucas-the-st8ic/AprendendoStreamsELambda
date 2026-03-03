package streamselambdas;

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



        List<Pessoa> menoresDeIdadeStream = pessoas
                .stream()
                .filter(pessoa -> pessoa.getIdade() < 18)
                .toList();


        for (Pessoa p : pessoas) {
            System.out.println(p.nome);;
        }

        pessoas.stream()
                .map(Pessoa::getNome)
                .forEach(System.out::println);


        pessoas.stream()
                .sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome()))
                .map(Pessoa::getNome)
                .forEach(System.out::println);

        /*Neste exemplo ele imprime cinco valores da Lista

        int[] numeros = {8,1,2,3,4,5,6,7,8,9,10};

        Arrays.stream(numeros).limit(5).forEach(System.out::println);*/
    }
}

class Pessoa {
    String nome;
    int idade;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
