public class EmpregadoComissao implements Empregado {
    private String nome;
    private double valorVendas;
    private double porcentagemComissao;

    EmpregadoComissao(String nome, double porcentagemComissao) {
        this.nome = nome;
        this.porcentagemComissao = porcentagemComissao;
        this.valorVendas = 0;
    }

    public void logVendas(double valorVendas) {
        this.valorVendas += valorVendas;
    }

    @Override
    public double getValorPagamento() throws CondicoesTrabalhoIlegaisException {
        if (this.porcentagemComissao < 0.1) {
            throw new CondicoesTrabalhoIlegaisException("Empregado com comissão menor que 10% !");
        }

        return this.valorVendas * this.porcentagemComissao;
    }
}
