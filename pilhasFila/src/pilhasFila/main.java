package pilhasFila;

import java.util.Scanner;
import pilhasFila.model.Pilha;
import pilhasFila.model.Fila;
import pilhasFila.model.Padaria;

public class main {

	public static void main(String[] args) {
		
		/* int opcao;
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nDigite uma opção:\n"
				+ "1 - Pilha\n"
				+ "2 - Fila\n"
				+ "3 - Padaria\n");
		opcao = in.nextInt();
		
		switch (opcao) {
		
		case 1:
			Pilha p = new Pilha();
			p.run();
			break;

		case 2: 
			Fila f = new Fila();
			f.run();
			break;
			
		case 3:
			Padaria pd = new Padaria();
			pd.run();
			break;
		
		default:
			break;
		}*/
		
		Padaria pd = new Padaria();
		pd.run();
			
	}
}
