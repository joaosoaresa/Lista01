/* Crie um programa Java que receba dois n�meros do usu�rio e que mostre a
quantidade de n�meros pares, a quantidade de n�meros �mpares e a soma entre os
dois n�meros informados.

*/


import java.util.Scanner;

class Q9{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	
	int contSequencia =0, numPar=0,numImpar=0,n,soma=0;

	for(int i = 0; i<2 ; i++){
		contSequencia++;

		System.out.println("Informe o "+contSequencia+"� numero");
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