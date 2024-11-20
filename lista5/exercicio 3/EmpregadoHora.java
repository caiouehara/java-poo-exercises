public class EmpregadoHora implements Empregado {
    private String nome;
    private double valorHora;
    private int horasTrabalhadas;

    EmpregadoHora(String nome, double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrabalhadas = 0;
    }

    public void logTrabalho(int horas) {
        this.horasTrabalhadas += horas;
    }

    @Override
    public double getValorPagamento() {
        int horasExtras = Math.max(this.horasTrabalhadas - 40, 0);
        this.horasTrabalhadas -= horasExtras;

        return this.horasTrabalhadas * this.valorHora + horasExtras * this.valorHora * 1.5; 
    }
    
}
