package br.edu.univas.funcio;

import java.util.Scanner;

import br.edu.univas.project.Projeto;

public class FuncionarioController {
	public void createFuncionario() {
		Funcionario c = new Funcionario();
		Scanner l = new Scanner(System.in);
		System.out.println("Escreva o registro: ");
        c.setRegistro(l.nextLine());
        System.out.println("Escreva o Nome ");
        c.setNome(l.nextInt());
        l.nextLine();
        System.out.println("Escreva o Email ");
        c.setEmail(l.nextInt());
        l.nextLine();
        int op = l.nextInt();
        l.nextLine();
		
	}

}
