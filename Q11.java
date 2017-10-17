import java.util.Scanner;

/* Código      Produto           Preço unitário (R$)
    10         Pastel de carne      1,50
    11         Coxinha de frango    1,80
    12         Empada de frango     1,90
    20         Hamburguer           10,00
    30         Pizza                8,00
    50         Suco                 2,50
*/



class Q11{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		int codeProduto,quantProduto;
		float total=0,total2=0;
		System.out.println("***********************************************");
		System.out.println("Código 	Produto 		Preço unitário R$");
		System.out.println("10	Pastel de carne 	1,50");
		System.out.println("11 	Coxinha de frango 	1,80");
		System.out.println("12 	Empada de frango 	1,90");
		System.out.println("20 	Hamburguer 		10,00");
		System.out.println("30 	Pizza 			8,00");
		System.out.println("50 	Suco 			2,50");
		System.out.println("***********************************************");
		
		System.out.println("Informe o codigo do produto: ");
		codeProduto = ler.nextInt();

		System.out.println("Informe a quant do produto: ");
		quantProduto = ler.nextInt();

		switch(codeProduto){
			case 10:
				total = quantProduto*1.50F;
				System.out.println("Total: \n"+total);
				break;
			case 11:
				total = quantProduto*1.80F;
				System.out.println("Total: \n"+total);
				break;
			case 12:
				total = quantProduto*1.90F;
				System.out.println("Total: \n"+total);
				break;
			case 20:
				total = quantProduto*10.00F;
				System.out.println("Total: \n"+total);
				break;
			case 30:
				total = quantProduto*8.00F;
				System.out.println("Total: \n"+total);
				break;
				
			case 50:
				total = quantProduto*2.50F;
				System.out.println("Total: \n"+total);
				break;
			default:
				System.out.println("Codigo Invalido!");
				break;

		} if(total > 50.00F){
			total2 = total*0.95F;
			System.out.println("Total: \n"+total2);
		}
	}
}
		
		