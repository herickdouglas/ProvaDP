package br.edu.univas.project;

import java.util.Scanner;

public class ProjetoController {
	public void createDepartamento() {
		Projeto c = new Projeto();
		Scanner l = new Scanner(System.in);
		System.out.println("Escreva inicio: ");
        c.setInicio(l.nextLine());
        System.out.println("Escreva o Fim ");
        c.setFim(l.nextInt());
        l.nextLine();
        System.out.println("Escreva o status ");
        c.setStatus(l.nextInt());
        l.nextLine();
		
	}

}
