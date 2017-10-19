import java.util.Scanner;

/* Desenvolva um programa em Java que calcule os quadrados e cubos dos números de
0 a 10 e imprima os valores resultantes conforme a tabela abaixo.


Número Quadrado Cubo
0       0        0
1       1        1
2       4        8  
3       9        27
4       16       64
5       25       125
6       36       216
7       49       343
8       64       512
9       81       729
10      100      1000

*/



class Q12{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		int numQuadrado = 0, numCubo = 0, n;

		for(int i = 0 ; i < 11 ; i++){
			numQuadrado = (i*i);
			numCubo = (i*i*i);

		System.out.println(numQuadrado);
		System.out.println(numCubo);

		}
			

	

	}

}