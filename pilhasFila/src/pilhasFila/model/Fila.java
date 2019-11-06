package pilhasFila.model;

import java.util.Scanner;

import pilhasFila.model.Elemento;

public class Fila {
	
	private Scanner in = new Scanner(System.in);
	
	public boolean sair = false;
	public int opcao, busca, numero;
	public String imprimir="";

	Elemento inicio, fim, aux, novo;
	
	public void run() {
		do {
			System.out.println("\nDigite uma opção:\n"
					+ "0 - Sair\n"
					+ "1 - Entrar na fila\n"
					+ "2 - Tirar da fila\n"
					+ "3 - Consultar\n"
					+ "4 - Esvaziar\n"
					+ "5 - Listar\n");
			opcao = in.nextInt();
			switch (opcao) {
			
			case 0:
				System.out.println("Tchau tchau");
				sair = true;
				break;
				
			case 1: // Entrar na fila
				novo = new Elemento();
				System.out.println("Qual o número?");
				novo.numero = in.nextInt();
				if (inicio == null) {
					inicio = novo;
					fim = novo;
				} else {
					novo.prox = inicio;
					inicio = novo;
				}
				break;
				
			case 2: // Tirar da fila
				if (inicio == null) {
					System.out.println("Fila vazia");
				} else {
					aux = inicio;
					while(aux.prox != fim) {
						aux = aux.prox;
					}
					fim = aux;
					fim.prox = null;
				}
				break;
				
			case 3: // Consultar
				if(inicio==null) {
					System.out.println("Fila vazia");
				} else {
					aux=inicio;
					System.out.println("Qual o número?");
					numero= in.nextInt();
					while (aux != null && numero != aux.numero) {
						aux = aux.prox;
					}	
					if(aux==null) {
						System.out.println("nao acho");
					} else {
						System.out.println("Achei: "+aux.numero);
					}
				}
				break;
				
			case 4: // Esvaziar
				inicio = null;
				fim = null;
				break;
				
			case 5: // Listar
				imprimir = "";
				if (inicio == null)
					System.out.println("Fila vazia");
				aux=inicio;
				while(aux != null)
				{
					imprimir += aux.numero+ " ";
					aux = aux.prox;
				}
				System.out.println(imprimir);
				break;
				
			default:
				System.out.println("Tchau tchau");
				sair = true;
				break;
			}
		}while(opcao != 0);
	}
}