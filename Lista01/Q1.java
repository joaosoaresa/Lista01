/* Crie um programa Java para receber uma velocidade em m/s e alterar para km/h. */

import java.util.Scanner;

class Q1{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		float n,converte;

		System.out.println("Informe oa velocidade em m/s: ");
		n = ler.nextFloat();
		converte = n*3.6F;

		System.out.println("A velocidade em km/h eh: "+converte);
	}
}
