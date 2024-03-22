package atividade2;

public class TesteColaborador {

    public static void main(String[] args) {

        Colaborador colaborador1 = new Colaborador("João", "Silva", 5000.0);
        Colaborador colaborador2 = new Colaborador("Maria", "Souza", 6000.0);

        // Exibindo salário anual de cada colaborador
        System.out.println("Salário anual de " + colaborador1.getPrimeiroNome() + " " + colaborador1.getSobrenome() + ": " + colaborador1.calcularSalarioAnual());
        System.out.println("Salário anual de " + colaborador2.getPrimeiroNome() + " " + colaborador2.getSobrenome() + ": " + colaborador2.calcularSalarioAnual());

        // Dando um aumento de 10% para cada colaborador
        colaborador1.aumentarSalario(10);
        colaborador2.aumentarSalario(10);

        // Exibindo novamente o salário anual de cada colaborador após o aumento
        System.out.println("\nApós aumento de 10%:");
        System.out.println("Salário anual de " + colaborador1.getPrimeiroNome() + " " + colaborador1.getSobrenome() + ": " + colaborador1.calcularSalarioAnual());
        System.out.println("Salário anual de " + colaborador2.getPrimeiroNome() + " " + colaborador2.getSobrenome() + ": " + colaborador2.calcularSalarioAnual());
    }
}
