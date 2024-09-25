public class Exercicio4 {
    // Calcular a quantidade de números primos entre 200 e 2000
    
    public static void main(String[] args) {        
        String[] date = args[0].split("/");
        String[] estacoes_do_ano = {"Verão", "Inverno", "Primaveira", "Outono"};
        String estacao;

        if (Integer.parseInt(date[1]) <= 1 && Integer.parseInt(date[1]) >= 3) {
            estacao = estacoes_do_ano[0];
        } else if (Integer.parseInt(date[1]) <= 4 && Integer.parseInt(date[1]) >= 7) {
            estacao = estacoes_do_ano[3];
        } else if (Integer.parseInt(date[1]) <= 8 && Integer.parseInt(date[1]) >= 10){
            estacao = estacoes_do_ano[2];
        } else {
            estacao = estacoes_do_ano[1];
        }

        System.out.printf("A data informada %s corresponde à estação do ano %s \n", args[0], estacao);
    }
}
