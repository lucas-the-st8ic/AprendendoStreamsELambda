package streamselambdas;

import java.util.ArrayList;

public class Main_3 {
    static void main(String[] args) {
        ArrayList<Empresa> empresas = new ArrayList<>();

        empresas.add(new Empresa("Google", new ArrayList<Pessoa>() {{
            add(new Pessoa("Lara", 35));
            add(new Pessoa("Tony", 35));
        }}));

        empresas.add(new Empresa("Apple", new ArrayList<Pessoa>() {{
            add(new Pessoa("Zach", 45));
            add(new Pessoa("Karl", 27));
            add(new Pessoa("Bob", 45));
            add(new Pessoa("Michael", 51));
        }}));

        empresas.add(new Empresa("Amazon", new ArrayList<Pessoa>() {{
            add(new Pessoa("Pedro", 38));
            add(new Pessoa("Rafael", 22));
            add(new Pessoa("Antonio", 18));
        }}));



    }
}
