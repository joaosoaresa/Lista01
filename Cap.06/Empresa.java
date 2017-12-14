
package banco;


public class Empresa {
 Funcionario[] empregados;
 String cnpj;
 int temp;

public Empresa() {
    this.temp = 0;
    empregados = new Funcionario[10];
}

public void adiciona(Funcionario pessoa) {
    if (temp == empregados.length) {
        System.out.println("Array esta cheio");
    } else {
        empregados[temp] = pessoa;
        temp++;
    }
}

public void mostraEmpregados() {
    for (int i = 0; i < temp; i++) {
        System.out.println("\nFuncionario N." + (i+1) + "\n");
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

