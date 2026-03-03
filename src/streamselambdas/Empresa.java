package streamselambdas;

import java.util.ArrayList;

public class Empresa {
    String empresa;
    ArrayList<Pessoa> funcionarios;

    public Empresa(String empresa, ArrayList<Pessoa> listaFuncionarios) {
        this.empresa = empresa;
        this.funcionarios = listaFuncionarios;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Pessoa> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Pessoa> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
