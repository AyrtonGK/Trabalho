package br.edu.udc.computacaografica;

import java.util.Scanner;

import ayrton.compGrafica.model.Linha3D;
import ayrton.compGrafica.model.Ponto3D;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores x e y para um ponto: ");
		Ponto3D p1 = new Ponto3D(sc.nextInt(), sc.nextInt(),sc.nextInt());
		System.out.println("Digite os valores x e y para outro ponto: ");
		Ponto3D p2 = new Ponto3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
		sc.close();
		
		System.out.println("Os pontos são: " + p1 + " e " + p2 );
		
		
		if(p1.equals(p2))
			System.out.println(p1 + " é igual a " + p2);
		else
			System.out.println(p1 + " é deferente de " + p2);
		
		Linha3D linha = new Linha3D(p1,p2);
		System.out.println("Os pontos são: " + linha );
			}
}
