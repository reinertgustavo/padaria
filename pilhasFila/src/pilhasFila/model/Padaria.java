package pilhasFila.model;

import java.util.Scanner;

public class Padaria {

	private Scanner in = new Scanner(System.in);
	
	public boolean sair = false;
	public int opcao, busca, numero, senha=0;
	double valorTotal;
	public String imprimir="";

	Elemento inicio, fim, aux, novo;
	
	public void run() {
		do {
			System.out.println("\nDigite uma opção:\n"
					+ "1 - Entrar cliente\n"
					+ "2 - Exibir a fila\n"
					+ "3 - Tirar da fila\n"
					+ "0 - Sair\n");
			opcao = in.nextInt();
			switch (opcao) {
			
			case 0:
				System.out.println("Valor arrecadado no dia foi " +  valorTotal + "reais.");
				System.out.println("Tchau tchau");
				sair = true;
				break;
				
			case 1: // Entrar na fila
				
				novo = new Elemento();
				novo.numero = senha;
				if (inicio == null) {
					inicio = novo;
					fim = novo;
				} else {
					novo.prox = inicio;
					inicio = novo;
				}
				senha++;
				System.out.println("\nNovo cliente entrou na fila.");
				break;
				
			case 2: // Exibir a fila
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
				
			case 3: // Tirar da fila
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
				System.out.println("Qual o valor gasto pelo cliente da senha " + (fim.numero-1) + "?");
				valorTotal += in.nextDouble();
				break;
				
			default:
				sair = true;
				break;
			}
		}while(opcao != 0);
	}
	
	
	
	
}
