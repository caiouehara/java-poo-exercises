public class Ex3 {
    public static void main(String[] args) {
        EmpregadoComissao empComissao = new EmpregadoComissao("Joao", 0.06);
        empComissao.logVendas(200);
        empComissao.logVendas(500);
        
        EmpregadoComissaoAssalariado empComAssalariado = new EmpregadoComissaoAssalariado("Maria", 1200, 0.04);
        empComAssalariado.logVendas(200);
        empComAssalariado.logVendas(500);
        
        EmpregadoHora empHorista = new EmpregadoHora("Edson", 25);
        empHorista.logTrabalho(25);
        empHorista.logTrabalho(17);
        
        EmpregadoAssalariado empAssalariado = new EmpregadoAssalariado("Adriana", 4700);

        System.out.println("Salario empregado comissionado: " + calcularPagamento(empComissao));
        System.out.println("Salario empregado comissionado e assalariado: " + calcularPagamento(empComAssalariado));
        System.out.println("Salario empregado horista: "+ calcularPagamento(empHorista));
        System.out.println("Salario empregado assalariado: " + calcularPagamento(empAssalariado));
    }

    private static double calcularPagamento(Empregado emp) {
        return emp.getValorPagamento();
    }
}
