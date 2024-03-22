package atividade2;

public class TesteColaborador {

    public static void main(String[] args) {

        Colaborador colaborador1 = new Colaborador("Marco", "Gomes", 5000.0);
        Colaborador colaborador2 = new Colaborador("Julia", "Silva", 6000.0);

        System.out.println("Salário anual de " + colaborador1.getPrimeiroNome() + " " + colaborador1.getSobrenome() + ": " + colaborador1.calcularSalarioAnual());
        System.out.println("Salário anual de " + colaborador2.getPrimeiroNome() + " " + colaborador2.getSobrenome() + ": " + colaborador2.calcularSalarioAnual());

        colaborador1.aumentarSalario(10);
        colaborador2.aumentarSalario(10);
        
        System.out.println("\nApós aumento de 10%:");
        System.out.println("Salário anual de " + colaborador1.getPrimeiroNome() + " " + colaborador1.getSobrenome() + ": " + colaborador1.calcularSalarioAnual());
        System.out.println("Salário anual de " + colaborador2.getPrimeiroNome() + " " + colaborador2.getSobrenome() + ": " + colaborador2.calcularSalarioAnual());
    }
}
