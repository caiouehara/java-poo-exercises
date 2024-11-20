public class EmpregadoAssalariado implements Empregado {
    private String nome;
    private double salario;

    EmpregadoAssalariado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public double getValorPagamento() {
        return this.salario;
    }
    
}
