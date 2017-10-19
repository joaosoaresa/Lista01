/* Crie um programa Java que receba dois números do usuário e que mostre a
quantidade de números pares, a quantidade de números ímpares e a soma entre os
dois números informados.

*/


import java.util.Scanner;

class Q9{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	
	int contSequencia =0, numPar=0,numImpar=0,n,soma=0;

	for(int i = 0; i<2 ; i++){
		contSequencia++;

		System.out.println("Informe o "+contSequencia+"º numero");
		n = ler.nextInt();
		soma += n;
		
		if(n%2 == 0){
			numPar++;
		}else{
			numImpar++;
		}
	}System.out.println("A soma eh: "+soma+"\nNumero par(Quant): "+numPar+"\nNumero Impar(Quant): "+numImpar);
		
	

}
}