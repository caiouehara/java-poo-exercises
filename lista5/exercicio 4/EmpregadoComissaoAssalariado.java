public class EmpregadoComissaoAssalariado extends EmpregadoComissao {
    private double salarioBase;
    
    EmpregadoComissaoAssalariado(String nome, double salarioBase, double porcentagemComissao) {
        super(nome, porcentagemComissao);
        this.salarioBase = salarioBase;    
    }

    @Override
    public double getValorPagamento() throws CondicoesTrabalhoIlegaisException{
        return super.getValorPagamento() + this.salarioBase;
    }
}
