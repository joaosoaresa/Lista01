/* Crie um programa Java que determine a idade atual da pessoa, baseado no ano de
nascimento. */

import java.util.Scanner;

class measure{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int n, ref;
		System.out.println("Informe seu ano de nasc.:");
		n = ler.nextInt();
		ref = 2017 - n;
		System.out.println("Sua idade eh: "+ref);
	}
}