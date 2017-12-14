
package banco;
public class Banco {

    
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        
        f1.setNome("João Soares");
        f1.setDepartamento("Consultoria");
        f1.setData("14/12/2017");
        f1.setRg("7.648.936");
        f1.setSalario(8000);
        f1.recebeAumento(500);
        f1.mostra();
        
       
        
    }
    
}
