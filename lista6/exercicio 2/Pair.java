public class Pair <F,S>{
    
    private F tipo1;
    private S tipo2;
    
    public Pair() {
        setTipo1(null);
        setTipo2(null);
    }

    public F getTipo1() {
        return tipo1;
    }

    public void setTipo1(F tipo1) {
        this.tipo1 = tipo1;
    }

    public S getTipo2() {
        return tipo2;
    }

    public void setTipo2(S tipo2) {
        this.tipo2 = tipo2;
    }    
    
	public boolean equalsTo(){
        return tipo1.equals(tipo2);
    }
    
	public boolean classEqualsTo(){
        Class f, s;
        
        f = tipo1.getClass();
        s = tipo2.getClass();
        return (f.getName().equals(s.getName()));
    }
}
