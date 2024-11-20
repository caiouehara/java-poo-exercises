import java.util.HashMap;
import java.util.Scanner;

public class ex2 {
	public static void main(String args[]){
		HashMap<String,String> hashmap;
		String nome, musica;
		Scanner sc = new Scanner(System.in);
		
		hashmap = new HashMap<String, String>();
		
		System.out.print("Informe o nome (ou digite \'sair\' para encerrar a entrada de dados): ");
        nome = sc.nextLine();

        while (!nome.equals("sair")){
			System.out.print("Informe a musica favorita: ");
			musica = sc.nextLine();
			hashmap.put(nome, musica);
			
			System.out.print("\nInforme o nome (ou digite \'sair\' para encerrar a entrada de dados): ");
			nome = sc.nextLine();
        }
        
		System.out.println("\nDados cadastrados no HashMap: " + hashmap);
		
		System.out.print("\nEntre com o nome a ser buscado (ou \'sair\' para encerrar a aplicação): ");
        nome = sc.nextLine();
        
		while (!nome.equals("sair")){
			musica = hashmap.get(nome);
			if (musica != null){
				System.out.println("A musica favorita de \'" + nome + "\' eh \'" + musica + "\'\n");
			}
            else {
                System.out.println("Nome nao encontrado\n");
            }

			System.out.print("Entre com o nome a ser buscado (ou \'sair\' para encerrar a aplicação): ");
			nome = sc.nextLine();
        }
	}
}