/* Crie um programa Java que peça 10 números inteiros e apresente: a média, o maior
e o menor.

*/

import java.util.Scanner;

class Q8{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		int contSequencia = 0;
		int contNum=0;
		float maiorNum=0, menorNum = 10000,n,media;
		

		for(int i= 0; i<10 ; i++){
			contSequencia++;

			System.out.println("Informe o "+contSequencia+"º numero: ");
			n = ler.nextFloat();
			contNum+= n;
			
			if(n > maiorNum){
				maiorNum = n;
		
			}if(n < menorNum){
				menorNum = n;
			}

	} System.out.println(contNum);
	media = contNum/10;
	System.out.println("A media eh: "+media+"\nMaior numero: "+maiorNum+"\nMenor numero: "+menorNum);
		
	}	
}