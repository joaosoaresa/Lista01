/* Um hotel cobra R$ 60.00 a di�ria e mais uma taxa de servi�os. A taxa de servi�os �
de:
� R$ 5.50 por di�ria, se o n�mero de di�rias for maior que 15;
� R$ 6.00 por di�ria, se o n�mero de di�rias for igual a 15;
� R$ 8.00 por di�ria, se o n�mero de di�rias for menor que 15.
� Construa um programa Java que mostre o nome e o total da conta de um
cliente 

*/


import java.util.Scanner;


class Q6{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		int n;
		float valorPrincipal;
		String nome;
		
		System.out.println("Informe o nome do cliente: ");
		nome = ler.nextLine();
		
		System.out.println("Informe a quant de di�rias do cliente: ");
		n = ler.nextInt();

		if(n > 15){
			valorPrincipal = 60.00F*5.50F;
			System.out.println("Nome do cliente: \n"+nome+"\nTotal: \n"+valorPrincipal);
		}else if(n == 15){
			valorPrincipal = 60.00F*6.00F;
			System.out.println("Nome do cliente: \n"+nome+"\nTotal: \n"+valorPrincipal);
		}if(n < 15){
			valorPrincipal = 60.00F*8.00F;
			System.out.println("Nome do cliente: \n"+nome+"\nTotal: \n"+valorPrincipal);
		}

	}
} 