package atividade1;

public class Main {
    public static void main(String[] args) {

        Suprimentos suprimento = new Suprimentos(1, "Teclado", 2, 50.0);

        // Exibindo informações do suprimento
        System.out.println("Número do item: " + suprimento.getNumeroItem());
        System.out.println("Descrição do item: " + suprimento.getDescricaoItem());
        System.out.println("Quantidade comprada: " + suprimento.getQuantidadeItem());
        System.out.println("Preço unitário: " + suprimento.getPrecoItem());

        // Calculando e exibindo o valor da fatura
        System.out.println("Valor da fatura: " + suprimento.getInvoiceAmount());
    }
    }

