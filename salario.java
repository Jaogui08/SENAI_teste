package Projetos_LPA.aula4;

import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		double valorhora, horastrabalhadas, salarioliq, salariobruto, inss ;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("informe as horas trabalhadas totais no mês: ");
		horastrabalhadas = ler.nextDouble();
		
		System.out.println("informe o valor por hora: ");
		valorhora = ler.nextDouble();
		
		salariobruto = horastrabalhadas * valorhora;
		
		inss = salariobruto * 0.12;
		
		salarioliq = salariobruto - inss;
		
		System.out.println("o valor do salário bruto é de: " + salariobruto);
		
		System.out.println("o valor do salário liquido é de: " + salarioliq);
		
		

	}

}
