
package banco;
public class Funcionario {
    String nome;
    String departamento;
    String data;
    String rg;
    double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    void recebeAumento(double aumento){
        this.salario = salario + aumento;
    }

    double calculaGanhoAnual(){
        return salario*12;
 
    }
    
    void mostra(){
        System.out.println("Nome do funcionario: " + getNome());
        System.out.println("Nome do departamento: " + getDepartamento());
        System.out.println("Salário" + getSalario());
        System.out.println("Data de entrada no banco: " + getData());
        System.out.println("RG do funcionário: " + getRg());
        
    }
    
    
}
