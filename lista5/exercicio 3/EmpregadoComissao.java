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
    public double getValorPagamento() {
        return this.valorVendas * this.porcentagemComissao;
    }
}
