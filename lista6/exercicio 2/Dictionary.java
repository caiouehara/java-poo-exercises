public class Dictionary <F,S>{

	private Pair<F,S> pairs[];
	private int usedEntries;

	public Dictionary(int maxEntries){
		pairs = new Pair[maxEntries];
		usedEntries = 0;
	}

	public boolean add(F key, S value){
		Pair<F,S> newPair;
		
		if(pairs.length == usedEntries){
			return false;
		} else {
			S aux = get(key);	
			if (aux == null){ // elemento nao encontrado
				// cria nova instancia de Pair
				newPair = new Pair<F,S>();
				newPair.setTipo1(key);
				newPair.setTipo2(value);
				
				// adiciona instancia ao dicionario
				pairs[usedEntries] = newPair;
				usedEntries ++;
				return true;
			} else 
				return false;
		}
	}
	
	public S get(F key){
		Pair<F,S> aPair;
		
		for(int i = 0; i< usedEntries; i++){
			aPair = pairs[i];
			if(aPair.getTipo1().equals(key))
				return aPair.getTipo2();
		}

		return null;
	}
	
	public void print(){
		Pair<F,S> aPair;
		
		for(int i = 0; i< usedEntries; i++){
			aPair = pairs[i];
			System.out.println(aPair.getTipo1() + " " + aPair.getTipo2());
		}
	}
}