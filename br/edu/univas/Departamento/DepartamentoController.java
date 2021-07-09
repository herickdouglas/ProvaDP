package br.edu.univas.departamento;

import java.util.Scanner;

public class DepartamentoController {
	public void createDepartamento() {
		Departamento c = new Departamento();
		Scanner l = new Scanner(System.in);
		System.out.println("Escreva o nome: ");
        c.setNome(l.nextLine());
        System.out.println("Escreva o numero de funcionarios ");
        c.setQuantidadeFuncionarios(l.nextInt());
        l.nextLine();
		
	}
	
	

}
