public class Exe2 {

	public static void main(String[] args){
		Dictionary<String,Integer> dictionary;

		dictionary = new Dictionary<String,Integer>(10);

		System.out.println("Adicionando elementos ao dicionario:");
		System.out.println("- Joao - 1000: " + dictionary.add("Joao", 1000));
		System.out.println("- Maria - 100: " + dictionary.add("Maria", 100));
		System.out.println("- Joao - 10: " + dictionary.add("Joao", 10));
	
		System.out.println("\nImprimindo dados do dicionário:");
		dictionary.print();
		
		System.out.println("\nBuscando elementos no dicionario:");
		System.out.println("- Joao: " + dictionary.get("JOao"));
		System.out.println("- Maria: " + dictionary.get("Maria"));
		System.out.println("- Luiza: " + dictionary.get("Luiza"));
	}
}