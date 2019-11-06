package pilhasFila.model;

import java.util.Scanner;

import pilhasFila.model.Elemento;

public class Pilha {
private Scanner in = new Scanner(System.in);
	
	public boolean sair = false;
	public int opcao, busca, numero;
	public String imprimir="";
	
	Elemento topo, aux, novo;
	
	public void run() {
		do {
			System.out.println("\nDigite uma opção:\n"
					+ "0 - Sair\n"
					+ "1 - Empilhar\n"
					+ "2 - Desempilhar\n"
					+ "3 - Consultar\n"
					+ "4 - Esvaziar\n"
					+ "5 - Listar\n");
			opcao = in.nextInt();
			switch (opcao) {
			
			case 0:
				System.out.println("Tchau tchau");
				sair = true;
				break;
				
			case 1: // Empilhar
				novo = new Elemento();
				System.out.println("Qual o número?");
				novo.numero = in.nextInt();
				if (topo == null) {
					topo = novo;
				}else {
					novo.prox = topo;
					topo = novo;
				}
				break;
				
			case 2: // Desempilhar
				if (topo == null) {
					System.out.println("Pilha vazia");
				} else {
					topo = topo.prox;
				}
				break;
				
			case 3: // Consultar
				if (topo == null) {
					System.out.println("Pilha vazia");
				} else {
					aux = topo;
					System.out.println("Qual o número?");
					novo.numero = in.nextInt();
					while(aux != null && aux.numero == numero) {
						aux = aux.prox;
					}
					System.out.println(aux.numero);
				}
				break;
				
			case 4: // Esvaziar
				topo = null;
				break;
				
			case 5: // Listar
				if (topo == null)
					System.out.println("Pilha vazia");
				aux = topo;
				while(aux.prox != null)
				{
					imprimir += aux+" ";
					aux = aux.prox;
				}
				break;
			}
		}while(opcao != 0);
	}
}