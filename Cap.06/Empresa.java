package banco;

public class Empresa {
    private Funcionario[] empregados;
    private String cnpj;
    private int temp;

    public Empresa() {
        this.temp = 0;
        empregados = new Funcionario[10];
    }

    public Empresa(int tamanho) {
        this.temp = 0;
        empregados = new Funcionario[tamanho];
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void adiciona(Funcionario pessoa) {
        if (temp == empregados.length) {
            System.out.println("Array com limite esgotado!");
        } else {
            empregados[temp] = pessoa;
            temp++;
        }
    }

    public void mostraEmpregados() {
        for (int i = 0; i < temp; i++) {
            System.out.println("\nFuncionario Nº: " + (i+1) + "\n");
            empregados[i].mostra();
        }
    }

    public boolean contem(Funcionario pessoa) {
        for (int i = 0; i < temp; i++) {
            if (pessoa == empregados[i]) {
                return true;
            }
        }
        return false;
    }
}
