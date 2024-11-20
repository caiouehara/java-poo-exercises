public class Ex4 {
    public static void main(String[] args) {
        EmpregadoComissao empComissao = new EmpregadoComissao("Joao", 0.12);
        empComissao.logVendas(200);
        empComissao.logVendas(500);
        
        EmpregadoComissaoAssalariado empComAssalariado = new EmpregadoComissaoAssalariado("Maria", 200, 0.08);
        empComAssalariado.logVendas(200);
        empComAssalariado.logVendas(500);
        
        EmpregadoHora empHorista = new EmpregadoHora("Edson", 25);
        empHorista.logTrabalho(25);
        // empHorista.logTrabalho(47); // retire o comentario para testar a excecao de horas excessivas
        
        EmpregadoAssalariado empAssalariado = new EmpregadoAssalariado("Adriana", 4700);

        Empregado empregados[] = {empComissao, empComAssalariado, empHorista, empAssalariado};
        calcularPagamento(empregados);
    }

    private static void calcularPagamento(Empregado[] emps) {
        for (Empregado emp : emps) {
            try {
                System.out.println("Salario empregado: " + emp.getValorPagamento());
            }
            catch (CondicoesTrabalhoIlegaisException ex) {
                System.out.println(ex);
            }
        }
    }

}
